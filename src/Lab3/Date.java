package Lab3;

import java.text.DecimalFormat;

public class Date {
	private String dia_, mes_, ano_;
	private LanguageInterface language_;

	Date(int dia, int mes, int ano) {
		set(dia, mes, ano, LanguageInterface.LanguageGenerator("English"));
	}
	
	Date(int dia, int mes, int ano, String language) {
		set(dia, mes, ano, LanguageInterface.LanguageGenerator(language));
	}
	
	Date(int dia, int mes, int ano, LanguageInterface language) {
		set(dia, mes, ano, language);
	}

	void set(int dia, int mes, int ano, LanguageInterface language) {
		dia_ = new DecimalFormat("00").format(dia);
		mes_ = new DecimalFormat("00").format(mes);
		ano_ = new DecimalFormat("0000").format(ano);
		language_ = language;
	}
	
	void setLanguage(LanguageInterface language){
		language_ = language;
	}

	String toPrint() {
		return language_.DateFormat(dia_, mes_, ano_);
	}
}

package Lab3;

public class Phone {
	private int localCode_, phoneNumber_;
	LanguageInterface language_;

	Phone(int localCode, int number) {
		set(localCode, number, LanguageInterface.LanguageGenerator("English"));
	}

	Phone(int localCode, int number, String language) {
		set(localCode, number, LanguageInterface.LanguageGenerator(language));
	}
	
	Phone(int localCode, int number, LanguageInterface language) {
		set(localCode, number, language);
	}

	void set(int localCode, int number, LanguageInterface language) {
		localCode_ = localCode;
		phoneNumber_ = number;
		language_ = language;
	}

	void setLanguage(LanguageInterface language) {
		language_ = language;
	}

	String toPrint() {
		return language_.PhoneFormat(localCode_, phoneNumber_);
	}

	Phone Copy() {
		return new Phone(localCode_, phoneNumber_, language_);
	}
}

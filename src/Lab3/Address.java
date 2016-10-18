package Lab3;

public class Address {
	private String street_;
	private int number_;
	private LanguageInterface language_;

	Address(String street, int number) {
		set(street, number);
		language_=LanguageInterface.LanguageGenerator("English");
	}
	
	Address(String street, int number, String language) {
		set(street, number);
		language_ = LanguageInterface.LanguageGenerator(language);
	}
	
	Address(String street, int number, LanguageInterface language) {
		set(street, number);
		language_ = language;
	}

	void set(String street, int number) {
		street_ = street;
		number_ = number;
	}
	
	void setLanguage(LanguageInterface language) {
		language_ = language;
	}

	String toPrint() {
		return language_.AddressFormat(street_, number_);
	}
	
	Address Copy(){
		return new Address(street_, number_, language_);
	}
}

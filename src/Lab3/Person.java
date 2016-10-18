package Lab3;

public class Person {
	private String name_, email_;
	private Address address_;
	private Phone phone_;
	private LanguageInterface language_;
	
	Person(String name, Address address, Phone phone, String email) {
		setName(name);
		setAddress(address);
		setPhone(phone);
		setEmail(email);
		setLanguage(LanguageInterface.LanguageGenerator("English"));
	}
	
	Person(String name, Address address, Phone phone, String email, String language) {
		setName(name);
		setAddress(address);
		setPhone(phone);
		setEmail(email);
		setLanguage(LanguageInterface.LanguageGenerator(language));
	}
	
	Person(String name, Address address, Phone phone, String email, LanguageInterface language) {
		setName(name);
		setAddress(address);
		setPhone(phone);
		setEmail(email);
		setLanguage(language);
	}

	void setName(String name) {
		name_ = name;
	}

	void setAddress(Address address) {
		address_ = address;
	}

	void setPhone(Phone phone) {
		phone_ = phone;
	}

	void setEmail(String email) {
		email_ = email;
	}

	void setLanguage(LanguageInterface language){
		language_ = language;
		phone_.setLanguage(language);
		address_.setLanguage(language);
	}
	
	String getName() {
		return language_.NameTreatment() + name_;
	}

	Address getAddress() {
		return address_.Copy();
	}

	Phone getPhone() {
		return phone_.Copy();
	}

	String getEmail() {
		return email_;
	}
}

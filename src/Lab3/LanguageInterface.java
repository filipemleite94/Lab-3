package Lab3;

public interface LanguageInterface {
	String Language();
	String Dear();
	String Sincerely();
	String NameTreatment();
	String PhoneFormat(int region, int number);
	String Anonymous();
	String DateFormat(String day, String month, String year);
	String WithLove();
	String AddressFormat(String street, int number);
	static LanguageInterface LanguageGenerator(String Language){
		if(Language.equalsIgnoreCase("English")){
			return new English();
		}
		if(Language.equalsIgnoreCase("Portugues")){
			return new Portugues();
		}
		return new English();
	}
}

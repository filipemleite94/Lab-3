package Lab3;

public class Portugues implements LanguageInterface {

	@Override
	public String Dear() {
		return "Caro";
	}

	@Override
	public String Sincerely() {
		return "Sinceramente";
	}

	@Override
	public String DateFormat(String day, String month, String year ) {
		return day+"/"+month+"/"+year;
	}

	@Override
	public String Anonymous() {
		return "Anonimo";
	}

	@Override
	public String Language() {
		return "Portugues";
	}

	@Override
	public String NameTreatment() {
		return "Sr. ";
	}

	@Override
	public String PhoneFormat(int region, int number) {
		return  "("+ region + ") " + (number/10000) + "-" + (number%10000);
	}

	@Override
	public String WithLove() {
		return "com amor";
	}

	@Override
	public String AddressFormat(String street, int number) {
		return "Rua " + street + ", " + number;
	}
}

package Lab3;

public class English implements LanguageInterface {

	@Override
	public String Dear() {
		return "Dear";
	}

	@Override
	public String Sincerely() {
		return "Sincerely";
	}

	@Override
	public String DateFormat(String day, String month, String year) {
		return month + "/" + day + "/" + year;
	}

	@Override
	public String Anonymous() {
		return "Anonymous";
	}

	@Override
	public String Language() {
		return "English";
	}

	@Override
	public String NameTreatment() {
		return "Mr. ";
	}

	@Override
	public String PhoneFormat(int region, int number) {
		return "(" + region + ") " + (number / 10000) + "-" + (number % 10000);
	}

	@Override
	public String WithLove() {
		return "with love";
	}

	@Override
	public String AddressFormat(String street, int number) {
		return number + " " + street + " Street";
	}
}

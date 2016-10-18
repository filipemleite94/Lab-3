package Lab3;

public class ComercialLetterBuilder extends DefaultLetterBuilder {

	ComercialLetterBuilder(Person sender, Person destinatary, Date date) {
		super(sender, destinatary, date);
	}

	ComercialLetterBuilder(Person sender, Person destinatary, Date date, String language) {
		super(sender, destinatary, date, language);
	}
	
	@Override
	public void setBody() {
		destinatary_.getName();
		body_ = "\n" + language_.Dear() + " " + destinatary_.getName() + ",\n";
	}

	@Override
	public void setConclusion() {
		conclusion_ = "\n" + language_.Sincerely() + ",\n";
	}

	@Override
	public void setSignature() {
		signature_ = "\n\n                                           __________________\n"
				+ "                                           " + sender_.getName() + "\n"
				+ "                                           " + sender_.getPhone().toPrint()
				+ "\n                                           email: " + sender_.getEmail();
	}
}// class Commercial Letter
package Lab3;

public class PersonalLetterBuilder extends DefaultLetterBuilder {
	protected boolean withLove_;

	PersonalLetterBuilder(Person sender, Person destinatary, Date date, boolean withLove) {
		super(sender, destinatary, date);
		withLove_ = withLove;
	}
	
	PersonalLetterBuilder(Person sender, Person destinatary, Date date, String language, boolean withLove) {
		super(sender, destinatary, date, language);
		withLove_ = withLove;
	}

	@Override
	public void setBody() {
		body_ = "\n" + language_.Dear();
		if (withLove_) {
			body_ += " <3";
		}
		body_  += " " + destinatary_.getName() + ",\n";
	}

	@Override
	public void setConclusion() {
		conclusion_ = "\n" + language_.Sincerely();
		if (withLove_) {
			conclusion_ += language_.WithLove();
		}
		conclusion_ += ",\n";
	}

	@Override
	public void setSignature() {
		signature_ = "\n\n                                           " + sender_.getName();
	}

}

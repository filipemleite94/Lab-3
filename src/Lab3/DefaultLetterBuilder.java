package Lab3;

public abstract class DefaultLetterBuilder implements LetterBuilderInterface{
	protected Person destinatary_, sender_;
	protected Address addressSender_, addressDestiny_;
	protected Date date_;
	protected String header_, body_, conclusion_, signature_;
	protected LanguageInterface language_;

	DefaultLetterBuilder(Person sender, Person destinatary, Date date) {
		destinatary_ = destinatary;
		sender_ = sender;
		addressSender_ = sender.getAddress();
		addressDestiny_ = destinatary.getAddress();
		date_ = date;
		language_ = LanguageInterface.LanguageGenerator("English");	
	}

	DefaultLetterBuilder(Person sender, Person destinatary, Date date, String language) {
		destinatary_ = destinatary;
		sender_ = sender;
		addressSender_ = sender.getAddress();
		addressDestiny_ = destinatary.getAddress();
		date_ = date;
		setLanguage(LanguageInterface.LanguageGenerator(language));	
		date_.setLanguage(language_);
		sender_.setLanguage(language_);
		destinatary_.setLanguage(language_);
		
	}
	
	@Override
	public void setLanguage(LanguageInterface language) {
		language_ = language;
		date_.setLanguage(language_);
		sender_.setLanguage(language_);
		destinatary_.setLanguage(language_);
		addressSender_.setLanguage(language_);
		addressDestiny_.setLanguage(language_);
	}
	
	@Override
	public void setLanguage(String language) {
		setLanguage(LanguageInterface.LanguageGenerator(language));
	}
	
	@Override
	public String model() {
		return header_ + body_ + conclusion_ + signature_;
	}
	
	@Override
	public void setHeader() {
		header_ = date_.toPrint() + "\n\n" + sender_.getName() + "\n" + addressSender_.toPrint() + "\n"
				+ destinatary_.getName() + "\n" + addressDestiny_.toPrint() + "\n";
	}
}

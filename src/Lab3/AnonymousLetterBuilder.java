package Lab3;

public class AnonymousLetterBuilder implements LetterBuilderInterface{
	protected Person destinatary_;
	protected Address addressDestiny_;
	protected Date date_;
	protected String header_, body_, conclusion_, signature_;
	protected LanguageInterface language_;
	
	AnonymousLetterBuilder(Person destinatary, Date date){
		destinatary_=destinatary;
		addressDestiny_=destinatary.getAddress();
		date_=date;
		language_ = LanguageInterface.LanguageGenerator("English");
	}
	
	AnonymousLetterBuilder(Person destinatary, Date date,String language){
		destinatary_=destinatary;
		addressDestiny_=destinatary.getAddress();
		date_=date;
		setLanguage(LanguageInterface.LanguageGenerator(language));
	}
	
	@Override
	public void setLanguage(LanguageInterface language) {
		language_ = language;
		date_.setLanguage(language);
		destinatary_.setLanguage(language);
		addressDestiny_.setLanguage(language);
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
		header_ = date_.toPrint() + "\n\n" + language_.Anonymous() + "\n\n"
				+ destinatary_.getName() + "\n" + addressDestiny_.toPrint() + "\n\n";	
	}

	@Override
	public void setBody() {
		body_ = destinatary_.getName()+",\n";
	}

	@Override
	public void setConclusion() {
		conclusion_ = "\n" + language_.Sincerely();
	}
	
	@Override
	public void setSignature() {
		signature_="";		
	}
}

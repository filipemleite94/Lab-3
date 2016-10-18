package Lab3;

public interface LetterBuilderInterface {
	String model();
	void setHeader();
	void setBody();
	void setConclusion();
	void setSignature();
	void setLanguage(LanguageInterface language);
	void setLanguage(String language);
}

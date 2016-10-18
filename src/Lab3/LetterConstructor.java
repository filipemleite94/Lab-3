package Lab3;

public class LetterConstructor {
	static void Construct(LetterBuilderInterface Letter){
		Letter.setHeader();
		Letter.setBody();
		Letter.setConclusion();
		Letter.setSignature();
	}
}

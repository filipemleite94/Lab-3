package Lab3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TesteExercicio1 {
	static Phone[] phoneList;
	static String[] nameList, emailList;
	static Address[] addressList;
	static Person[] personList;
	static Date[] dateList;

	@BeforeClass
	public static void setUp() throws Exception {
		phoneList = new Phone[] { new Phone(860, 1241414), new Phone(210, 5678234), new Phone(012, 9999999) };
		nameList = new String[] { "Arnaldo", "Jessica", "Carlos Alberto" };
		emailList = new String[] { "a@b.c", "d@e.f", "g@h.i" };
		addressList = new Address[] { new Address("Baker", 11), new Address("Corn", 32), new Address("Bacon", 97) };
		personList = new Person[] { new Person(nameList[0], addressList[0], phoneList[0], emailList[0]),
				new Person(nameList[1], addressList[1], phoneList[1], emailList[1]),
				new Person(nameList[2], addressList[2], phoneList[2], emailList[2]) };
		dateList = new Date[]{new Date(30,1,2015), new Date(22,1,2013), new Date(10,5,1910)};
	}

	@Before
	public void Separacao(){
		System.out.println("\n----------------------------------------------------------------");
	}
	
	@Test
	public void test_Modelo_Comercial() {
		ComercialLetterBuilder letter = new ComercialLetterBuilder(personList[0], personList[1], dateList[0]);
		LetterConstructor.Construct(letter);
		System.out.println("Modelo Comercial: \n\n" + letter.model());
	}
	
	@Test
	public void test_Modelo_Pessoal_WithLove() {
		PersonalLetterBuilder letter = new PersonalLetterBuilder(personList[0], personList[1], dateList[1], true);
		LetterConstructor.Construct(letter);
		System.out.println("Modelo Pessoal With Love: \n\n" + letter.model());
	}

	@Test
	public void test_Modelo_Pessoal_WithOutLove() {
		PersonalLetterBuilder letter = new PersonalLetterBuilder(personList[0], personList[2], dateList[1], false);
		LetterConstructor.Construct(letter);
		System.out.println("Modelo Pessoal Without Love: \n\n" + letter.model());
	}
	
	@Test
	public void test_Modelo_Anonimo() {
		AnonymousLetterBuilder letter = new AnonymousLetterBuilder(personList[2], dateList[2]);
		LetterConstructor.Construct(letter);
		System.out.println("Modelo Anonimo: \n\n" + letter.model());
	}
	
}

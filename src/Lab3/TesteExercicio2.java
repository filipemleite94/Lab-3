package Lab3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TesteExercicio2 {
	@Test
	public void test_Date_Em_Mais_De_Uma_Lingua() {
		Date data = new Date(2,3,1990,"Portugues");
		assertEquals("02/03/1990", data.toPrint());
		data = new Date(2,3,1990, "English");
		assertEquals("03/02/1990", data.toPrint());
	}
	
	@Test
	public void test_Phone_Em_Mais_De_Uma_Lingua() {
		Phone phone = new Phone(21,919901990,"Portugues");
		assertEquals("(21) 91990-1990",phone.toPrint());
		phone = new Phone(210,9901990,"Portuguese");
		assertEquals("(210) 990-1990", phone.toPrint());
	}
	
	@Test
	public void test_Address_Em_Mais_De_Uma_Lingua() {
		Address address = new Address("Baker", 21, "Portugues");
		assertEquals("Rua Baker, 21", address.toPrint());
		address.setLanguage(LanguageInterface.LanguageGenerator("English"));
		assertEquals("21 Baker Street", address.toPrint());
	}
	
	@Test
	public void test_Person_Em_Mais_De_Uma_Lingua() {
		Phone phone = new Phone(21,919901990);
		Address address = new Address("Baker", 21, "Portugues");
		String nome = "Carlos",  email = "a@b.c";
		Person brazilian = new Person(nome, address, phone, email, "Portugues");
		assertEquals("Sr. Carlos", brazilian.getName());
		assertEquals("(21) 91990-1990", brazilian.getPhone().toPrint());
		assertEquals("Rua Baker, 21", brazilian.getAddress().toPrint());
		phone = new Phone(210,9901990);
		Person american = new Person(nome, address, phone, email);
		assertEquals("Mr. Carlos", american.getName());
		assertEquals("21 Baker Street", american.getAddress().toPrint());
		assertEquals("(210) 990-1990", american.getPhone().toPrint());
	}
}

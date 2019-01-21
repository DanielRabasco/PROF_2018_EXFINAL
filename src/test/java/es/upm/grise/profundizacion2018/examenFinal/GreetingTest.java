package es.upm.grise.profundizacion2018.examenFinal;

import static org.junit.Assert.*;

import static org.mockito.Mockito.*;

import org.junit.Test;

public class GreetingTest {
	
	MyCalendar myCalendar = mock(MyCalendar.class);

	
	@Test
	public void smokeTest1() {
		Greeting greeting = new Greeting(myCalendar);
		when(myCalendar.GetGreeting()).thenReturn("Good morning");
		assertEquals("Good morning", greeting.getGreeting(null));
	}
	
	@Test
	public void smokeTest2() {
		Greeting greeting = new Greeting(myCalendar);
		when(myCalendar.GetGreeting()).thenReturn("Good morning");
		assertEquals("Good morning", greeting.getGreeting(Language.ENGLISH));
	}
	
	@Test
	public void smokeTest3() {
		Greeting greeting = new Greeting(myCalendar);
		when(myCalendar.GetGreeting()).thenReturn("Buenos días");
		assertEquals("Buenos días", greeting.getGreeting(Language.SPANISH));
	}

	/*@Test
	public void smokeTest4() {
		Message mess = mock(Message.class); 
		Greeting greeting = new Greeting();
		greeting.getGreeting(null);
		verify(mess, times(1)).getDefaultLanguage();
		verify(mess, times(1)).getMessage(greeting.myCalendar.moment, null);
	}*/
}

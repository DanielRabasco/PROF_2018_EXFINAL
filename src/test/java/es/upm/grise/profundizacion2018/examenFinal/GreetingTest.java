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

	@Test
	public void smokeTest4() {
		Message mess = mock(Message.class); 
		when(mess.getDefaultLanguage()).thenReturn(Language.ENGLISH);
		MyCalendar calendar = new MyCalendar(mess);
		Greeting greeting = new Greeting(calendar);
		when(mess.getMessage(calendar.moment, calendar.language)).thenReturn("Good morning");
		greeting.getGreeting(null);
		
		// Two methods executed once
		verify(mess, times(1)).getDefaultLanguage();
		verify(mess, times(1)).getMessage(any(), any());
	}
	
	@Test 
	public void smokeTest5() {
		Message mess = mock(Message.class); 
		when(mess.getDefaultLanguage()).thenReturn(Language.ENGLISH);
		MyCalendar calendar= new MyCalendar(mess);
		Greeting greeting = new Greeting(calendar);
		when(mess.getMessage(calendar.moment, calendar.language)).thenReturn("Buenos días");
		greeting.getGreeting(Language.SPANISH);
		
		// First method not executed and second method executed once
		verify(mess, times(0)).getDefaultLanguage();
		verify(mess, times(1)).getMessage(greeting.myCalendar.moment, null);
	}
}

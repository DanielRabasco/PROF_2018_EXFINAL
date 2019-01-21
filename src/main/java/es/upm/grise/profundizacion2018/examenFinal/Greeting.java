package es.upm.grise.profundizacion2018.examenFinal;

public class Greeting {
	
	public MyCalendar myCalendar;
	
	public Greeting (MyCalendar calendar) {
		myCalendar = calendar;
	}
	public String getGreeting( Language language ) {
		myCalendar.SetLanguage(language);
		myCalendar.SetMoment();
		return myCalendar.GetGreeting();
	}

}

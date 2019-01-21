package es.upm.grise.profundizacion2018.examenFinal;

public class Greeting {
	
	private MyCalendar myCalendar;
	
	public Greeting () {
		myCalendar = new MyCalendar();
	}
	public String getGreeting( Language language ) {
		myCalendar.SetLanguage(language);
		myCalendar.SetMoment();
		return myCalendar.GetGreeting();
	}

}

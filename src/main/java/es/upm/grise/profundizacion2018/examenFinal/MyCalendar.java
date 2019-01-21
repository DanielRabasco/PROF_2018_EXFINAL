package es.upm.grise.profundizacion2018.examenFinal;

import java.util.Calendar;

public class MyCalendar {
	
	public String greeting;
	private Calendar calendar;
	private int hour;
	TimeOfTheDay moment;
	private Language language;
	
	public MyCalendar () {
		calendar = Calendar.getInstance();
		hour = calendar.get( Calendar.HOUR_OF_DAY );
	}	

	public String GetGreeting(){								
		// Return the message		
		return Message.getMessage( moment, language );
	}
	
	public void SetLanguage(Language language) {
		// Find out the greeting language
		if ( language == null )
			this.language = Message.getDefaultLanguage();
	}
	
	public void SetMoment() {
		// Get the moment of the day
		if( hour < 12 ) 
			moment = TimeOfTheDay.MORNING;
		else if ( hour < 18 )
			moment = TimeOfTheDay.AFTERNOON;
		else
			moment = TimeOfTheDay.EVENING;			
	}
}

import se.lth.cs.ptdc.window.SimpleWindow;

public class TurtleRace {
	private final static int WINY = 400; //storleken på fönster i y-led
	private final static int WINX = 400; //storleken på fönster i x-led
	private final static int MARGIN = 50; //Marginal för start och slutpunkt för kapplöpningsbanan i y-led
	/* Skapar sköldpaddorna, kapplöpningsbanan och ett lopp,
	 * genomför loppet */
	public static void main(String[] args){
		//skapar ett fönster
		SimpleWindow w = new SimpleWindow(WINX,WINY,"TurtleRace");
		//skapar en kapplöpningsbana med övre och undre marginal på 50px
		RaceTrack track = new RaceTrack(WINY - MARGIN, MARGIN);
		
		Turtle t1 = new Turtle(w, 0, 0);
		Turtle t2 = new Turtle(w, 0, 0);
		
		//målar upp banan
		track.draw(w);
		RacingEvent event = new RacingEvent(track, t1, t2);
		//vänta på musklick, starta sedan racet
		w.waitForMouseClick();
		event.race(); //returnerar när någon sköldpadda vunnit
	}
}

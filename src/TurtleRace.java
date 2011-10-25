import se.lth.cs.ptdc.window.SimpleWindow;

public class TurtleRace {
	private final static int WINY = 400;
	private final static int WINX = 400;
	private final static int MARGIN = 50;
	/* Skapar sköldpaddorna, kapplöpningsbanan och ett lopp,
	 * genomför loppet */
	public static void main(String[] args){
		SimpleWindow w = new SimpleWindow(WINX,WINY,"TurtleRace");
		RaceTrack track = new RaceTrack(WINY - MARGIN, MARGIN);
		Turtle t1 = new Turtle(w, 0, 0);
		Turtle t2 = new Turtle(w, 0, 0);
		track.draw(w);
		RacingEvent event = new RacingEvent(track, t1, t2);
		w.waitForMouseClick();
		event.race();
	}
}

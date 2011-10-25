import java.awt.Point;
import java.util.Random;

import se.lth.cs.ptdc.window.SimpleWindow;

public class RacingEvent {

	private RaceTrack track;
	private Turtle t1, t2;
	private final static int MAXSPEED = 2;

	/** Skapar ett lopp mellan sköldpaddan t1 och t2 på kapplöpningsbanan track */
	public RacingEvent(RaceTrack track, Turtle t1, Turtle t2) {
		this.track = track;
		this.t1 = t1;
		this.t2 = t2;

	}

	public void race() {
		Point slotOne = track.getSlotOne();
		t1.jumpTo(slotOne.x, slotOne.y);
		Point slotTwo = track.getSlotTwo();
		t2.jumpTo(slotTwo.x, slotTwo.y);
		int finishLine = track.getFinishLine();
		Random rand = new Random();
		t1.penDown();
		t2.penDown();
		while (t1.getY() > finishLine && t2.getY() > finishLine) {
			t1.forward(rand.nextInt(MAXSPEED+1));
			t2.forward(rand.nextInt(MAXSPEED+1));
			SimpleWindow.delay(3);
		}
	}
}

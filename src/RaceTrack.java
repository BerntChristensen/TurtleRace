import java.awt.Point;

import se.lth.cs.ptdc.window.SimpleWindow;

public class RaceTrack {
	private int yStart, yFinish;
	private final static int XTRACKOFFSET = 50;
	private final static int SLOTOFFSET = 100;
	private final static int TRACKWIDTH = 300;

	/*
	 * Skapar en kapplöpningsbana. yStart och yFinish är y-koordinaterna för
	 * start- och mållinje
	 */
	public RaceTrack(int yStart, int yFinish) {
		this.yStart = yStart;
		this.yFinish = yFinish;
	}

	/* Ritar kapplöpningsbanan i fönstret w */
	public void draw(SimpleWindow w) {
		w.moveTo(XTRACKOFFSET, yStart);
		w.lineTo(XTRACKOFFSET + TRACKWIDTH, yStart);
		w.moveTo(XTRACKOFFSET, yFinish);
		w.lineTo(XTRACKOFFSET + TRACKWIDTH, yFinish);
	}

	public Point getSlotOne() {
		return new Point(XTRACKOFFSET + SLOTOFFSET, yStart);
	}

	public Point getSlotTwo() {
		return new Point(XTRACKOFFSET + TRACKWIDTH - SLOTOFFSET, yStart);
	}

	public int getFinishLine() {
		return yFinish;
	}

	// TODO: ..infoga mer metoder här!
}

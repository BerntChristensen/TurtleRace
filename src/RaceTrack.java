import java.awt.Point;

import se.lth.cs.ptdc.window.SimpleWindow;

public class RaceTrack {
	private int yStart, yFinish;
	private final static int XTRACKOFFSET = 50;//marginal i x-led för banan
	private final static int SLOTOFFSET = 100; //avståndet mellan de två enskilda banorna
	private final static int TRACKWIDTH = 300; //bredden på hela banan

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
	/** Ta reda på startkoordinater för första banan**/
	public Point getSlotOne() {
		return new Point(XTRACKOFFSET + SLOTOFFSET, yStart);
	}
	/** Ta reda på startkoordinater för andrabanan**/
	public Point getSlotTwo() {
		return new Point(XTRACKOFFSET + TRACKWIDTH - SLOTOFFSET, yStart);
	}
	/** Ta reda på y-koordinaten för slutlinjen**/
	public int getFinishLine() {
		return yFinish;
	}
}

import se.lth.cs.ptdc.window.SimpleWindow;

public class Turtle {
	private double x; // x-koordinat
	private double y; // y-koordinat
	private int alpha; // riktning turtle pekar i grader
	private boolean draw; // om pennan är nere eller inte.
	private final static int NORTH = 90;
	private SimpleWindow w;

	/**
	 * Skapar en sköldpadda som ritar i ritfönstret w. Från början befinner sig
	 * sköldpaddan i punkten x,y med pennan lyft och huvudet pekande rakt uppåt
	 * i fönstret (i negativ y-riktning)
	 */
	public Turtle(SimpleWindow w, int x, int y) {
		this.w = w;
		this.x = x;
		this.y = y;
		alpha = NORTH;
		draw = false;
	}

	/** Sänker pennan */
	public void penDown() {
		draw = true;
	}

	/** Lyfter pennan */
	public void penUp() {
		draw = false;
	}

	/** Går rakt framåt n pixlar i den riktning som huvudet pekar */
	public void forward(int n) {
		w.moveTo((int) x, (int) y);
		double a = Math.toRadians(alpha);
		x = (int) Math.round(x + (n * Math.cos(a)));
		y = (int) Math.round(y - (n * Math.sin(a)));
		if (draw) {
			w.lineTo((int) x, (int) y);
		}
	}

	/** Vrider beta grader åt vänster runt pennan */
	public void left(int beta) {
		alpha += beta;
	}

	/**
	 * Går till punkten newX,newY utan att rita. Pennans läge (sänkt eller lyft)
	 * och huvudets riktning påverkas inte
	 */
	public void jumpTo(int newX, int newY) {
		x = newX;
		y = newY;
		w.moveTo(newX, newY);
	}

	/** Återställer huvudriktningen till den ursprungliga */
	public void turnNorth() {
		alpha = NORTH;
	}

	/** Tar reda på x-koordinaten för sköldpaddans aktuella position */
	public int getX() {
		return (int) Math.round(x);
	}

	/** Tar reda på y-koordinaten för sköldpaddans aktuella position */
	public int getY() {
		return (int) Math.round(y);
	}

	/** Tar reda på sköldpaddans riktning, i grader från positiv x-led */
	public int getDirection() {
		return alpha;
	}
}

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @author Dan Verst�ndig
 *
 */
public class MyKeyAdapter extends KeyAdapter {

	MyKeyAdapter(Applet adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		adaptee.keyPressed(e);
	}

	Applet adaptee;
}

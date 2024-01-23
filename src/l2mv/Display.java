package l2mv;

import java.awt.Canvas;
import javax.swing.JFrame;

public class Display extends Canvas {
	private static final long serialVersionUID = 1L;

	public final int WIDTH = 800;
	public final int HEIGTH = 600;
	public final String TITLE = " MineFront Pre Alpha 0.01";

	public Display() {

		view();
	}

	public void view() {
		JFrame frame = new JFrame();
		frame.setTitle(TITLE);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(WIDTH, HEIGTH);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);

	}
}

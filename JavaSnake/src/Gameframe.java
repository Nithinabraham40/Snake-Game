import javax.swing.JFrame;

public class Gameframe extends JFrame{
	
	public Gameframe() {
		
		this.add(new Gamepannel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
	

}


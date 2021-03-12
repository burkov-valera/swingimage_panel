import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.net.URL;
import java.io.*;

public class MyCanvas extends Canvas{
		Image myimg;
	public void paint(Graphics g) {
		URL treeURL = null;
		treeURL = getClass().getResource("zxzx.jpg");
		try{
			myimg=ImageIO.read(treeURL);
		}
        catch(IOException e)
        {
            e.printStackTrace();
        }
		g.drawImage(myimg, 0,0, this);	
	}
		public static void main(String[] args) {
		MyCanvas m=new MyCanvas();
		JFrame f=new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.setResizable(false);
		f.setSize(400,400);

		f.add(m);

		f.setVisible(true);
	}

}

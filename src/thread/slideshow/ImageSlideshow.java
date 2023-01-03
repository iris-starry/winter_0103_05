package thread.slideshow;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageSlideshow extends JFrame {
	
	JLabel lbl;
	
	public ImageSlideshow() {
		ImageIcon icon = new ImageIcon("image/image1.jpg");
		lbl = new JLabel(icon);
		add(lbl, "Center");
		
		setTitle("이미지슬라이드쇼");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(20, 30, 400, 400);
		setVisible(true);
		setResizable(false); //사이즈 변경이 안됨
		ImageThread t = new ImageThread(lbl);
		t.start();
	}
	
	public static void main(String[] args) {
		new ImageSlideshow();

	}

}

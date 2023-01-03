package thread.slideshow;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImageThread extends Thread {
	JLabel lbl;
	
	public ImageThread(JLabel lbl) {
		this.lbl = lbl;
	}
	
	@Override
	public void run() {
		int i=0;
		ImageIcon icon;
		while(true) {
			icon = new ImageIcon("image/image"+ ++i +".jpg");
			lbl.setIcon(icon);
			
			if(i == 5) {
				i=0;
			}
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
}

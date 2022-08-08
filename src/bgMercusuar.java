import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import javax.swing.JPanel;

public class bgMercusuar extends JPanel 
{
	Image bgimage = null;
	bgMercusuar() 
	{
		MediaTracker mt = new MediaTracker(this);
        bgimage = Toolkit.getDefaultToolkit().getImage("mercusuar-belum-sama-karang.png");
        mt.addImage(bgimage, 0);
        
        try 
        {
          mt.waitForAll();
        }
        catch (InterruptedException e) 
        {
          e.printStackTrace();
        }
        
     }
 
     protected void paintComponent(Graphics g) 
     {
    	  super.paintComponent(g);
    	  setOpaque(false);
    	  int imwidth = bgimage.getWidth(null);
    	  int imheight = bgimage.getHeight(null);
    	  g.drawImage(bgimage, 1, 1, null);
     }
}
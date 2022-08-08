import java.applet.Applet;
import java.applet.AudioClip;
import java.net.MalformedURLException;
import java.net.URL;

public class main 
{
	public static void main(String[] args) 
	{
		try {
			AudioClip clip = Applet.newAudioClip(
			new URL("file://d:/DOC/Programming/Java/Samuderanesia/foo.wav"));
			clip.play();
			} catch (MalformedURLException murle) {
			System.out.println(murle);
			}
        
        Home a = new Home();
        
	}
}

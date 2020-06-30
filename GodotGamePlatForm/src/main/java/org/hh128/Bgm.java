import javax.sound.midi.Patch;
import java.io.*;
public class Bgm extends Thread
{
	@Override
	public void run()
	{
		File file=new File(".");
		Easy.syso(file.getAbsolutePath());
		//AudioInputStream audio_in=AudioInputStream.getAudioInputStream(new File(""));
	}
}
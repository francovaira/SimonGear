package master.Vistas;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class Reproductor
{
	private File a_mainTheme = new File("C:\\Program Files\\SimonGear\\audio\\main_theme.wav");
	private Clip mainTheme;
	private File a_background = new File("C:\\Program Files\\SimonGear\\audio\\background.wav");
	private Clip background;
	private static File a_que_te_paso = new File("C:\\Program Files\\SimonGear\\audio\\que te paso.wav");
	static Clip que_te_paso;

	public Reproductor()
	{
		try
		{
			mainTheme = AudioSystem.getClip();
			mainTheme.open(AudioSystem.getAudioInputStream(a_mainTheme));
			background = AudioSystem.getClip();
			background.open(AudioSystem.getAudioInputStream(a_background));
			que_te_paso = AudioSystem.getClip();
			que_te_paso.open(AudioSystem.getAudioInputStream(a_que_te_paso));
		} catch (Exception e) {}
	}
	
	public void play_mainTheme()
	{
		mainTheme.loop(Clip.LOOP_CONTINUOUSLY);
	}
	
	public void play_background()
	{
		background.loop(Clip.LOOP_CONTINUOUSLY);
	}

	public static void play_que_te_paso()
	{
		que_te_paso.loop(1);
	}
	
	public void stop_mainTheme()
	{
		mainTheme.stop();
	}
	
	public void stop_background()
	{
		background.stop();
	}
	
	public void stop_que_te_paso()
	{
		que_te_paso.stop();
	}
	
	public void stop_and_close_all()
	{
		stop_background();
		background.close();
		stop_mainTheme();
		mainTheme.close();
		stop_que_te_paso();
		que_te_paso.close();
	}
}

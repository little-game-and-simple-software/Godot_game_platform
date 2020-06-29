import java.awt.event.*;
public  class Close implements WindowListener
{
	@Override
	public void windowDeactivated(WindowEvent e)
	{
		Easy.syso("Dbug.............................");
	}
	@Override
	public void windowActivated(WindowEvent e)
	{
		Easy.syso("Dbug.............................");
	}
	@Override
	public void windowDeiconified(WindowEvent e)
	{
		
	}
	@Override
	public void windowIconified(WindowEvent e)
	{}
	@Override
	public void windowClosed(WindowEvent e)
	{}
	@Override 
	public void windowClosing(WindowEvent e)
	{}	
	@Override 
	public void windowOpened(WindowEvent e)
	{}	
}
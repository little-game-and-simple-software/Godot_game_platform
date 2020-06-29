import java.awt.event.*;
import java.awt.*;
public  class Close implements WindowListener
{
	private boolean ActionClose=false;
	//private enum ActionClose;
	public static Dialog a;
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
	{
		Easy.syso("关闭窗口");
		Easy.syso(a);
		a.dispose();
	}	
	@Override 
	public void windowOpened(WindowEvent e)
	{}	
}
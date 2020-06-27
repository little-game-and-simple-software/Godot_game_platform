import java.io.*;
import java.net.URLEncoder.*;
import java.awt.*;
import java.awt.event.*;
//65001 936gbk


public class kde extends Frame
{	
	static kde main_layout;
	//String s1=URLEncoder.encode(s, "utf-8");
	public static void main(String[] args) throws IOException
	{	
	// cmd /k start
		kde main_layout=new kde();
		System.out.println("Œ“");
		main_layout.setVisible(true);
		main_layout.setSize(600,600);    
		main_layout.setBackground(Color.yellow);
		main_layout.addWindowListener(new WindowAdapter()
		{
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
			}	
		});

	}

	
}

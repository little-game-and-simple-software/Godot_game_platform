import java.io.*;
import java.net.URLEncoder.*;
import java.awt.*;
import java.awt.event.*;
//65001 936gbk


public class kde extends Frame
{	
	static kde main_layout;
	public static void main(String[] args) throws IOException
	{	
	// cmd /k start
		kde main_layout=new kde();
		System.out.println("我");
		main_layout.setVisible(true);
		main_layout.setSize(800,600);
		main_layout.setTitle("godot游戏平台");
		main_layout.setBackground(Color.yellow);
		
		Button user_btn=new Button("游客用户");
		
		Button download_godot=new Button("下载客户端");
		download_godot.addActionListener(new download());
		
		user_btn.setBounds(0,0,200,200);
		
		Panel root=new Panel();
		main_layout.add(root);
		
		root.add(download_godot);
		root.add(user_btn);
		
		main_layout.addWindowListener(new WindowAdapter()
		{
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
			}	
		});

	}

	
}

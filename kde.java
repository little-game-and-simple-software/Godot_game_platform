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
		System.out.println("��");
		main_layout.setVisible(true);
		main_layout.setSize(800,600);
		main_layout.setTitle("godot��Ϸƽ̨");
		main_layout.setBackground(Color.yellow);
		
		Button user_btn=new Button("�ο��û�");
		
		Button download_godot=new Button("���ؿͻ���");
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

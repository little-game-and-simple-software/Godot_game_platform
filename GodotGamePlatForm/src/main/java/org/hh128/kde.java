//package org.hh128;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
//import java.net.*;
//import org.hh128.download;
//65001 936gbk

public class kde extends Frame
{	
	static kde main_layout;
	public static void main(String[] args) 
	{	
	// cmd /k start
		kde main_layout=new kde();
		main_layout.setVisible(true);
		main_layout.setSize(800,600);
		main_layout.setTitle("godot游戏平台");
		main_layout.setBackground(Color.yellow);
		
		Button user_btn=new Button("游客用户");
		
		Button download=new Button("下载客户端");
		download.addActionListener(new D());
		
		user_btn.setBounds(0,0,200,200);
		
		Panel root=new Panel();
		main_layout.add(root);
		
		root.add(download);
		root.add(user_btn);
		super.validate();

		main_layout.addWindowListener(new WindowAdapter()
		{
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
			}	
		});
	}
}

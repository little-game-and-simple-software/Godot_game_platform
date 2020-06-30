//package org.hh128;
import java.awt.*;
import java.io.*;
import javax.swing.*;
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
		main_layout.setSize(1024,800);
		main_layout.setTitle("godot游戏平台");
		//main_layout.setBackground(Color.yellow);
		
		Button user_btn=new Button("游客用户");
		
		Button download=new Button("下载客户端");
		download.addActionListener(new D());
		
		Button about=new Button("关于");
		about.addActionListener(new D());
		//user_btn.setBounds(0,0,200,200);
		
		//about.setBounds(0,0,200,200);
		//Panel root=new Panel();
		
		
		//f.setAlignment(FlowLayout.RIGHT);
		//f.addLayoutComponent("godot游戏平台",about);
		//加载界面
		//f.setBounds(0,0,200,200);
		//main_layout.add(f);
	

		//根界面
		//extends Object
		FlowLayout f=new FlowLayout();
				
		//main_layout.add(root);
		//滚动条
		//Scrollbar bar=new Scrollbar(Scrollbar.VERTICAL,0,1,0,100);
		//滚动panel
		ScrollPane gun_pane=new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
		
		//gun_pane.addImpl(about);
		main_layout.add(gun_pane);
		gun_pane.setBounds(0,0,500,500);
		gun_pane.add(new item("testGame"));
		
		gun_pane.validate();
		//
		//----------
		
		//---------
		

		main_layout.add(download);
		main_layout.add(user_btn);
		main_layout.add(about);
		
		main_layout.add(user_btn);

		main_layout.setLayout(f);
		//f.addLayoutComponent("goa",about);
		//main_layout.add(root);
		//main_layout.add(f);
		main_layout.addWindowListener(new WindowAdapter()
		{
		public void windowClosing(WindowEvent e)
		{
			System.exit(1);
			}	
		});
	}
}

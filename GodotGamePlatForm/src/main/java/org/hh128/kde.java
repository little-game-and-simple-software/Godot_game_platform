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
	//按钮--------
	static Button user_btn;
	static Button about;
	static Button download;
	//----------
	static FlowLayout flow;
	
	//初始化layout
	public static void init_layout()
	{
		download=new Button("下载");
		download.addActionListener(new D());
		
		//滚动panel
		ScrollPane gun_pane=new ScrollPane(ScrollPane.SCROLLBARS_AS_NEEDED);
		
		//gun_pane.addImpl(about);
		
		//gun_pane是ScrollVIew
		gun_pane.setBounds(0,0,500,500);
		//布局 _inPanel是scrollview的子viewGroup
		Panel _inPanel=new Panel();
		gun_pane.add(_inPanel);
		_inPanel.add(new item("aaa"));
		gun_pane.validate();
		
		Button about=new Button("关于");
		about.addActionListener(new D());
		FlowLayout f=new FlowLayout();		
		
	

		
	}
	//添加组件
	public static void  init_widget()
	{
		main_layout.add(download);
		main_layout.add(user_btn);
		main_layout.add(about);
		main_layout.add(user_btn);
		main_layout.add(gun_pane);
	}
	//初始化框架
	public static void init_Frame()
	{
		// cmd /k start
		kde main_layout=new kde();
		main_layout.setVisible(true);
		main_layout.setSize(1024,800);
		main_layout.setTitle("godot游戏平台");
		main_layout.setLayout(flow);
	}
	//main
	public static void main(String[] args) 
	{	
		init_Frame();
		init_layout();
		init_widget();
		main_layout.addNotify();
		main_layout.addWindowListener(new WindowAdapter()
		{
		public void windowClosing(WindowEvent e)
		{
			System.exit(1);
			}	
		});
	}
}

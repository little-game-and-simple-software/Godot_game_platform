//package org.hh128;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;
//import java.net.*;
//import org.hh128.download;
//65001 936gbk

public class kde extends JFrame
{	//主Frame
	static kde main_layout;
	//按钮--------
	static Button user_btn;
	static Button about;
	static Button download;
	//----------
	//布局
	static FlowLayout flow;
	static ScrollPane scroll;
	//初始化layout
	public static void init_layout()
	{
		download=new Button("下载");
		download.addActionListener(new D());
		user_btn=new Button("我");
			user_btn.setBounds(0,0,50,50);
		about=new Button("关于");
		about.setBounds(0,0,50,50);
		about.addActionListener(new D());
		scroll=new ScrollPane();
		
		scroll.setBounds(0,0,500,500);
		
		main_layout.add(scroll);
	//----------游戏大厅
		
		Toolkit tool=Toolkit.getDefaultToolkit();

		Image v=tool.getImage("a.jpg");
		Image vr=v.getScaledInstance(100,100,Image.SCALE_DEFAULT);
		ImageIcon ic=new ImageIcon(vr);
		Panel s=new Panel();
		scroll.add(s);
		JLabel Ja=new JLabel(ic);
		//Ja.setText("游戏名称");
		s.add(Ja);
		s.add(new Label("aaaa"));
		s.add(new Label("aaaa"));
		Easy.syso("aaa");
			
	}
	//添加组件
	public static void  init_widget()
	{
		main_layout.add(scroll);
		main_layout.add(download);
		main_layout.add(user_btn);
		main_layout.add(about);
		
	}
	
	public static void init_Frame()
	{
		// cmd /k start
		main_layout=new kde();
		main_layout.setVisible(true);
		main_layout.setSize(1024,800);
		main_layout.setTitle("godot游戏平台");
		flow=new FlowLayout();	
		main_layout.getContentPane(); 
		BoxLayout box=new BoxLayout(main_layout,BoxLayout.X_AXIS);
		main_layout.setLayout(flow);
		//main_layout.add(new Button("aaa"));
	}
	//main
	public static void main(String[] args) 
	{	
		init_Frame();
		init_layout();
		init_widget();
		main_layout.setVisible(true);
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

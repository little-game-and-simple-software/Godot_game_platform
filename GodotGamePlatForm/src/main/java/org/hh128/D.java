//package org.hh128;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import java.net.*;
public class D implements ActionListener
{		
	static String url1="ftp://6394195.host131.sanfengyun.cn/Data/Godot_v3.2.1-stable_win64.exe";

	static String url2="https://static.q-plants.com/Godot_v3.2.2-stable_win64.exe.zip";
	static File f=new File("/");
	static URL url;
	static URLConnection connection;
	public static void download() 
	{
		try{
		url=new URL(url2);
		String name=url.getFile();
		Easy.syso(name);
		int port =url.getPort();
		Easy.syso(port);
		
		}catch(MalformedURLException e2)
		{}
		try{
		URLConnection c=url.openConnection();
		Easy.syso("获得的内容",c);
		OutputStream out=c.getOutputStream();
		Easy.syso("得到输出流"+out);
		}
		catch(IOException e3)
		{
			Easy.syso("IOE异常",e3);
		}
	}
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			System.out.println(e);
			String btn_name=e.getActionCommand();
			if(btn_name.equals("下载客户端"))
			{
				download();
			}
		}
}
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
	static URLConnection c;
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
		c=url.openConnection();
		Easy.syso("��õ�����",c);
		
		
		
		}
		catch(IOException e3)
		{
			Easy.syso("IOE�쳣",e3);
		}
		//�������
		c.setDoInput(true);
		c.setDoOutput(true);
		try{
			OutputStream out=c.getOutputStream();
			Easy.syso("�õ������"+out);
			InputStream in=c.getInputStream();
			Easy.syso("�õ�������",in);
			int length=c.getContentLength();
			//д��������
			//byte[] tmp_in;
			//in.read()
			Easy.syso("����������",length);
			out.close();
		}catch(IOException e11)
		{
			
			Easy.syso("IOE�쳣",e11);
		}
	}
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			System.out.println(e);
			String btn_name=e.getActionCommand();
			if(btn_name.equals("���ؿͻ���"))
			{
				download();
			}
		}
}
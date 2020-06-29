//package org.hh128;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import java.net.*;
import java.awt.event.WindowEvent;
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
		Easy.syso("获得的内容",c);
		
		
		
		}
		catch(IOException e3)
		{
			Easy.syso("IOE异常",e3);
		}
		//允许输出
		c.setDoInput(true);
		c.setDoOutput(false);
		try{
		//	OutputStream out=c.getOutputStream();
			//Easy.syso("得到输出流"+out);
			InputStream in=c.getInputStream();
			Easy.syso("得到输入流",in);
			Integer my_length=c.getContentLength();
			
			byte my_byte_len=my_length.byteValue();
			Easy.syso("输入流长度int",my_length);
			Easy.syso("输入流长度byte",my_byte_len);
			
			//写入输入流
			download_Thread.in=in;
			new download_Thread().run();
			//Easy.syso("byte",tmp_in);
			//byte[] a=new byte[1024];
		//	in.read();
			
			
		//	out.close();
		}catch(IOException e11)
		{
			
			Easy.syso("IOE异常",e11);
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
			if(btn_name.equals("关于"))
			{
				Dialog dialog=new Dialog(kde.main_layout,"about");
				dialog.setTitle("About");
				dialog.setBounds(100,100,500,500);
				Label label=new Label();
				
				label.setText("我是本软件作者128hh,感谢开源游戏引擎Godot提供的核心技术 \n 联系微信:13023335265 \n qq:2439905184");
				dialog.add(label);
				dialog.setVisible(true);
				dialog.addWindowStateListener(new WindowStateListener()
				{
				
					@Override
					public void windowStateChanged(WindowEvent e)
					{
						Easy.syso("进入window");
						if(e.getNewState()==WindowEvent.WINDOW_CLOSING)
						{
							Easy.syso("new");
							dialog.remove(label);
						}
					}
				});
				
			}
		}
}
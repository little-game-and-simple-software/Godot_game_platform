//package org.hh128;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import java.net.*;
public class D implements ActionListener
{		
	String url1="ftp://6394195.host131.sanfengyun.cn/Data/Godot_v3.2.1-stable_win64.exe";

	String url2="https://static.q-plants.com/Godot_v3.2.2-stable_win64.exe.zip";
	File f=new File("/");
	URL url;
	URLConnection connection;
		@Override
		public void actionPerformed(ActionEvent e)
		{
			System.out.println(e);
		try{   url=new URL(url2);	}
		catch(MalformedURLException e2)
		{
			System.out.println(e);
			}
		}
		/*public static void main(String[] args)
		{
			ActionEvent e=null;
			new D().actionPerformed(e);
		}*/
}
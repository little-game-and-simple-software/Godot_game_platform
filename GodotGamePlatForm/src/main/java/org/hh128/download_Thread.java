import java.io.*;
public class download_Thread extends Thread
{
	//从Download下载器来的输入流
	static protected InputStream in;
	//tmp预读取int
	static Integer tmp_int;
	
	public static Integer tmp_in;
	public static byte to_process_inputByte_len;
	@Override 
	public void run()
	{try{
		while((tmp_int=in.read())!=null)
			{
				Easy.syso(tmp_int);
			}
	}catch(IOException e){}
			Easy.syso("完成");
	}
}
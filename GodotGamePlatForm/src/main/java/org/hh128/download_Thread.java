import java.io.*;
public class download_Thread extends Thread
{
	//��Download����������������
	static protected InputStream in;
	//tmpԤ��ȡint
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
			Easy.syso("���");
	}
}
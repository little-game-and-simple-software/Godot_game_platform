//游戏的封面展示类
/*-------------------
	---   游戏的封面 ---
	----                  --
	------下载按钮 ----
	-----是否需要积分:-----     

*/
import java.awt.*;
import java.awt.image.*;
import javax.accessibility.*;
import javax.swing.*;
public class item extends Canvas implements Accessible
{
	private Image img;
	private static String game_name;
//	private Image game_cover;
	//下载游戏的名称
	private Label game_label;
	//初始化下载积分 0为不需要积分
	private int need_score =0;
	@Override
	public void paint(Graphics g)
	{ 
	g.drawString(game_name,20,20);
	g.drawLine(20,40,40,40);
	g.drawString("需要积分0",20,60);
	//画图线程
	new Thread()
	{
		@Override 
		public void run()
		{
			while(true)
			{
			Easy.syso("开始绘画");
			
			Toolkit tool= Toolkit.getDefaultToolkit();
			 img=tool.getImage("a.jpg");
			Easy.syso("什么时候获得img",img);
			//BufferedImage image = new BufferedImage(300,400,BufferedImage.TYPE_3BYTE_BGR);
			Easy.syso("画图开始");
			g.drawImage(img,0,0,null);
			Easy.syso("画图结束");
			
			}//update(g);
		}
	}.run();

		
	}
	public item(String gameName)
	{
		Button download_btn=new Button("aa");
		Easy.syso("被创建了");
		Easy.syso(getName());
		setVisible(true);
		this.game_name=gameName;
		validate();
		
	}
	

	
	
}
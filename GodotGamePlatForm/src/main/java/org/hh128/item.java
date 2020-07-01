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
	g.drawString(game_name,0,0);
	g.drawLine(20,40,40,40);
	g.drawString("需要积分0",20,60);
	}
	public item(String gameName)
	{
		Button download_btn=new Button("aa");
		Easy.syso("被创建了");
		Easy.syso(getName());
		setVisible(true);
		
		this.game_name=gameName;
	}
	

	
	
}
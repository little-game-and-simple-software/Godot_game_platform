//游戏的封面展示类
/*-------------------
	---   游戏的封面 ---
	----                  --
	------下载按钮 ----
	-----是否需要积分:-----     

*/
import java.awt.*;
import javax.accessibility.*;
public class item extends Canvas implements Accessible
{
	private String game_name;
//	private Image game_cover;
	//下载游戏的名称
	private Label game_label;
	//初始化下载积分 0为不需要积分
	private int need_score =0;
	@Override
	public void paint(Graphics g)
	{
		g.drawString("hello",100,100);
		Easy.syso("开始绘画");
		//update(g);
	}
	public item(String game_name)
	{
		Button download_btn=new Button("aa");
		Easy.syso("被创建了");
		Easy.syso(getName());
		setVisible(true);
		//setBackground(Color.red);
		Easy.syso(getBackground());
		
	}
	

	
	
}
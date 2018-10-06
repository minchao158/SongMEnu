package test2;

import java.util.Scanner;

//import javax.swing.JOptionPane;

public class Player extends Song {
	@SuppressWarnings("null")
	public boolean addSong()
	{	
		System.out.println("请输入添加的歌曲：");
		Scanner s=new Scanner(System.in);
		String str;
		int i=0;
		Song song=new Song();
		Master.listSong.add(song);
		System.out.println("名称：");
		while((str=s.nextLine())!=null)
		{
			if(i%3==0)
			{
				song.setsongName(str);
				System.out.println("歌手：");
			}
			else if(i%3==1)
			{
				song.singer=str;
				System.out.println("时长：");
			}
			else
			{
				int j=0;
				while(j==0)
				{
					try{
						song.time=Double.parseDouble(str);
						j=1;
					}
					catch(Exception e)
					{
						System.out.printf("输入有误，请重新输入",e.getMessage());
//						JOptionPane.showMessageDialog(null, "输入的歌曲时长为double型，如20.2");
					}
				}
			}
			i++;
			if(i==3)
				break;
			}	
		System.out.println("请选择：添加歌曲:add,播放或查看：play,结束:end");
		return true;
	}
}

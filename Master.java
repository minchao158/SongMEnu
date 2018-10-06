package test2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class Master extends Song 
{
	static  List<Song>  listSong=new ArrayList<Song>();
	public Master()//构造函数
	{
	}
	public boolean play()//播放歌曲
	{
		System.out.println("歌单："+"\n"+listSong.toString());
		System.out.println("请选择\n1：按顺序播放\n2:选择歌曲\n3:返回上一级");
		try{
			Scanner sc=new Scanner(System.in);
			int in=sc.nextInt();
			if(in==1)
				System.out.println(listSong);
			else if(in==2)
			{
				System.out.println("请输入要播放的歌曲名称：");
				int j=0;		//作为判断是否找到歌曲的标志
				while(j==0)
				{
				Scanner s=new Scanner(System.in);
				String str=s.nextLine();
				for(int i=0;i<listSong.size()+1;i++)
				{
					if(str.equals(listSong.get(i).songName))
					{
						j=1;
						System.out.println(listSong.get(i).toString());	
						break;		
					}
				}
				if(j==0)
					System.out.println("未找到该歌曲，请重新输入：");
				}
			}
			else if(in==3)		//返回
			{}
		}
		catch(Exception e)
		{
			System.out.printf("请重新输入：n1：按顺序播放\\n2:选择歌曲\\n3:返回上一级",e.getMessage());
//			JOptionPane.showMessageDialog(null, "请选择\n1：按顺序播放\n2:选择歌曲\n3:返回上一级");
		}
		System.out.println("请选择：添加歌曲:add,播放或查看：play,结束:end");
		return true;
	}
}

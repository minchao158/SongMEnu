package test2;

import java.util.Scanner;

//import javax.swing.JOptionPane;

public class SongDrive extends Master{
	public Master master;//主持人
	public Player player;//点歌的
	public SongDrive()//初始化master和player
	{
		player=null;
		master=null;
	}
	public static void main(String[] args)
	{
		System.out.println("请选择：添加歌曲:add,播放或查看：play,结束:end");
		int j=0;
		while(j==0)
		{
			try{
				Scanner s=new Scanner(System.in);
				String str;
				String s1="add";
				String s2="play";
				String s3="end";
				while((str=s.nextLine())!=null)
				{
					if(str.equals(s1))
					{
						Player player=new Player();
						player.addSong();
						System.out.println("sdf");
					}
					else if(str.equals(s2))
					{
						Master master=new Master();
						master.play();
					}
					else if(str.equals(s3))
					{
						System.out.println("播放结束，欢迎下次光临！");
						break;
					}
				}
				j=1;
			}
			catch(Exception e)
			{
				System.out.printf("请重新输入：\n添加歌曲:add,播放或查看：play,结束:end",e.getMessage());
//				JOptionPane.showMessageDialog( null,"请选择：添加歌曲:add,播放或查看：play,结束:end");
			}
		}
	}
}
/*
Song//歌曲类
String songName;//歌曲名称
String singer;//歌手
double time;//歌曲时长
public Song(String songName,String singer,double time )//构造函数

Master//主持人类
static List<Song> listSong//歌曲列表
public Master()//构造函数，初始化list
public boolean play()//播放歌曲

Player//用户类
public boolean addSong()//点歌

SongDrive//程序控制类
public Master master;//主持人
public Player player;//点歌的
public SongDrive()//初始化master和player
public static void main()//入口函数
*/
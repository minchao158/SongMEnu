package test2;

import java.util.Scanner;

//import javax.swing.JOptionPane;

public class SongDrive extends Master{
	public Master master;//������
	public Player player;//����
	public SongDrive()//��ʼ��master��player
	{
		player=null;
		master=null;
	}
	public static void main(String[] args)
	{
		System.out.println("��ѡ����Ӹ���:add,���Ż�鿴��play,����:end");
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
						System.out.println("���Ž�������ӭ�´ι��٣�");
						break;
					}
				}
				j=1;
			}
			catch(Exception e)
			{
				System.out.printf("���������룺\n��Ӹ���:add,���Ż�鿴��play,����:end",e.getMessage());
//				JOptionPane.showMessageDialog( null,"��ѡ����Ӹ���:add,���Ż�鿴��play,����:end");
			}
		}
	}
}
/*
Song//������
String songName;//��������
String singer;//����
double time;//����ʱ��
public Song(String songName,String singer,double time )//���캯��

Master//��������
static List<Song> listSong//�����б�
public Master()//���캯������ʼ��list
public boolean play()//���Ÿ���

Player//�û���
public boolean addSong()//���

SongDrive//���������
public Master master;//������
public Player player;//����
public SongDrive()//��ʼ��master��player
public static void main()//��ں���
*/
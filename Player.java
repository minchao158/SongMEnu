package test2;

import java.util.Scanner;

//import javax.swing.JOptionPane;

public class Player extends Song {
	@SuppressWarnings("null")
	public boolean addSong()
	{	
		System.out.println("��������ӵĸ�����");
		Scanner s=new Scanner(System.in);
		String str;
		int i=0;
		Song song=new Song();
		Master.listSong.add(song);
		System.out.println("���ƣ�");
		while((str=s.nextLine())!=null)
		{
			if(i%3==0)
			{
				song.setsongName(str);
				System.out.println("���֣�");
			}
			else if(i%3==1)
			{
				song.singer=str;
				System.out.println("ʱ����");
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
						System.out.printf("������������������",e.getMessage());
//						JOptionPane.showMessageDialog(null, "����ĸ���ʱ��Ϊdouble�ͣ���20.2");
					}
				}
			}
			i++;
			if(i==3)
				break;
			}	
		System.out.println("��ѡ����Ӹ���:add,���Ż�鿴��play,����:end");
		return true;
	}
}

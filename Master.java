package test2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class Master extends Song 
{
	static  List<Song>  listSong=new ArrayList<Song>();
	public Master()//���캯��
	{
	}
	public boolean play()//���Ÿ���
	{
		System.out.println("�赥��"+"\n"+listSong.toString());
		System.out.println("��ѡ��\n1����˳�򲥷�\n2:ѡ�����\n3:������һ��");
		try{
			Scanner sc=new Scanner(System.in);
			int in=sc.nextInt();
			if(in==1)
				System.out.println(listSong);
			else if(in==2)
			{
				System.out.println("������Ҫ���ŵĸ������ƣ�");
				int j=0;
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
					System.out.println("δ�ҵ��ø��������������룺");
				}
			}
			else if(in==3)		//����
			{}
		}
		catch(Exception e)
		{
			System.out.printf("���������룺n1����˳�򲥷�\\n2:ѡ�����\\n3:������һ��",e.getMessage());
//			JOptionPane.showMessageDialog(null, "��ѡ��\n1����˳�򲥷�\n2:ѡ�����\n3:������һ��");
		}
		System.out.println("��ѡ����Ӹ���:add,���Ż�鿴��play,����:end");
		return true;
	}
}

package test2;

public class Song {
	String songName;//��������
	String singer;//����
	double time;//����ʱ��

	public String getsongName()
	{
		return songName;
	}
	public void setsongName(String songName)
	{
		this.songName=songName;
	}
	public String getsinger()
	{
		return singer;
	}
	public void setsinger(String singer)
	{
		this.singer=singer;
	}
	public double gettime()
	{
		return time;
	}
	public void settime(double time)
	{
		this.time=time;
	}
	public String toString() {
		StringBuffer a=new StringBuffer("");
		a.append("������:"+songName+" ����:"+singer+" ʱ��:"+time+"����\n");
		return a.toString();
	}
}

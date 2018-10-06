package test2;

public class Song {
	String songName;//歌曲名称
	String singer;//歌手
	double time;//歌曲时长

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
		a.append("歌曲名:"+songName+" 歌手:"+singer+" 时间:"+time+"分钟\n");
		return a.toString();
	}
}

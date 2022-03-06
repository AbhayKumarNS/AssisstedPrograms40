package p17;

@SuppressWarnings("serial")
public class Shaadi_Exception extends Exception
{
	String msg;
	public char[] getMessage;
	void Shaadi_Excpetion(String msg)
	{
		this.msg=msg;
	}
	
	public String getMessage()
	{
		return msg;
	}
}

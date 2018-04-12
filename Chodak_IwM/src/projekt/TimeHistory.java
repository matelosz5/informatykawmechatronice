package projekt;

public class TimeHistory<T> extends Sequence<T> {
	
	protected double sensitivity;
	
	public TimeHistory()
	{
		super();
		sensitivity = 1;
	}
	
	public TimeHistory(String devN, String desc, long dt, int chanNr, String un, double Res, T[] buf, double sens)
	{
		super(devN,desc,dt,chanNr,un,Res,buf);
		sensitivity = sens;
	}
	
	public String toString()
	{
		return super.toString() + " Sensitivity: " + sensitivity;
	}

}

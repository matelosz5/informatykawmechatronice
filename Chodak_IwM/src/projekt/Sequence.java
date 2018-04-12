package projekt;

public abstract class Sequence<T> extends Packet {
	
	protected int channelNr;
	protected String unit;
	protected double Resolution;
	protected T[] bufor; 
	
	public Sequence()
	{
		super();
		channelNr = 0;
		unit = " ";
		Resolution = 1;
	}
	
	public Sequence( String devN, String desc, long dt, int chanNr, String un, double Res, T[] tttt )
	{
		super(devN,desc,dt);
		channelNr = chanNr;
		unit = un;
		Resolution = Res;
		bufor = tttt;
		
	}
	public String toString()
	{
		String buforString = " ";
//	    for(T i : bufor) {
//			i.toString();
//		}
		for (int i = 0; i<bufor.length;i++)
		{
			buforString  = buforString  + bufor[i]+ " ";
		}
			
		return super.toString() + " Channel: " + channelNr + " Unit: " + unit + " Resolution: " + Resolution + " Buffer: " + buforString;
	}

}

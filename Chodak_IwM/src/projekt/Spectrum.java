package projekt;

public class Spectrum<T> extends Sequence<T> {
	
	protected String scaling;
	
	public Spectrum()
	{
		super();
		scaling = "line";
	}
	
	public Spectrum(String devN, String desc, long dt, int chanNr, String un, double Res, T[] buf, String scal)
	{
		super(devN,desc,dt,chanNr,un,Res,buf);
		scaling = scal;
	}
	
	public String toString()
	{
		return super.toString() + " Scaling: " + scaling;
	}

}
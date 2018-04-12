package projekt;

import java.io.Serializable;

public abstract class Packet implements Serializable {
	
	protected String device;
	protected String description;
	protected long date; 
	
	public Packet()
	{
		device = "empty";
		description = "No device";
		date = 0;
	}
	
	public Packet(String devN, String desc, long dt)
	{
		device = devN;
		description = desc;
		date = dt;
	}
	
	public String toString()
	{
		return "Device name: " + device + " Description: " + description + " Date: " + date;
	}
	
	public String getDevice()
	{
		return device;
	}

	public String getDescription()
	{
		return description;
	}
}

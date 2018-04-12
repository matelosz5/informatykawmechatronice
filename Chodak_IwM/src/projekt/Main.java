package projekt;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		String device = "Mateusz";
		String description = "student";
		long date = 1000; 
		int channelNr = 1;
		String unit = "st";
		double Resolution = 0.01;
		double sens = 0.1;
		Double[] ffff = new Double[2];
		String scaling = "log";
		double threshold = 0.4;
		int direction = 1;
		
		ffff[0] = 2.4;
		ffff[1] = 1.3;
		System.out.println(Arrays.toString(ffff));
		
				
		//Sequence<Double> test = new Sequence<Double>(device, description, date, channelNr, unit, Resolution,ffff);
		TimeHistory<Double> TimeHist = new TimeHistory<Double>(device, description, date, channelNr, unit, Resolution,ffff,sens);
		Spectrum<Double> Spect = new Spectrum<>(device, description, date, channelNr, unit, Resolution,ffff,scaling);
		Alarm Alarm = new Alarm(device, description, date, channelNr, threshold, direction);
		String name1, name2, name3;
		
		name1 = TimeHist.toString();
		System.out.println(name1);
		
		name2 = Spect.toString();
		System.out.println(name2);
		
		name3 = Alarm.toString();
		System.out.println(name3);
	}

}

package jags;
import edu.wpi.first.wpilibj.CANJaguar;

public class Jags extends CANJaguar
{
	public Jags(int speed) 
	{
		super(speed);
	
	}
	int index;
	int speed;
	CANJaguar jag1 = new CANJaguar(index);
	CANJaguar jag2 = new CANJaguar(index);
	CANJaguar jag3 = new CANJaguar(index);
	CANJaguar jag4 = new CANJaguar(index);
	
	public void voltageMode()
	{
		jag1.setVoltageMode();
		jag2.setVoltageMode();
		jag3.setVoltageMode();
		jag4.setVoltageMode();
	}
	public void percentMode()
	{
		jag1.setPercentMode();
		jag2.setPercentMode();
		jag3.setPercentMode();
		jag4.setPercentMode();
	}
	
	


	

}

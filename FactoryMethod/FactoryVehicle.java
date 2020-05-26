package FactoryMethod;
import vehicle.Bike;
import vehicle.Car;
import vehicle.vehicle;

public class FactoryVehicle {

	public vehicle getVehicle(String s)
	{
		vehicle v1=null;
		if(s.equalsIgnoreCase("car"))
		{
			v1=new Car();
		}
		else if(s.equalsIgnoreCase("bike"))
		{
			v1=new Bike();
		}
		return v1;
	}
}

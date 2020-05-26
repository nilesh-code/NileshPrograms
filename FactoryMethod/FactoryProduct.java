package FactoryMethod;

import vehicle.Laptop;
import vehicle.Mobile;
import vehicle.Product;

public class FactoryProduct {
Product p1=null;
	public Product getData(String s)
	{
		
		if(s.equalsIgnoreCase("mobile"))
		{
			p1=new Mobile();
		}
		else if(s.equalsIgnoreCase("laptop"))
		{
			p1=new Laptop();
		}
		return p1;
	}
}

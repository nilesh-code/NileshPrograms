package Product;
import java.util.Scanner;

public class Product_Operation {

	public static void main(String[] args) {
		
		ProductDetails p1=new ProductDetails();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a choice:");
		System.out.println("1:Maximum price");
		System.out.println("2:Minimum price");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
				p1.maxPrice();
			break;
		case 2:
			p1.minPrice();
			break;
		}
			
	}
}

package day2;

public class product {
	String Name;
	double price;
	float gst;
	float discount;
	int quantity;
public static void main(String[] args) {
	product p1=new product();
	p1.Name ="Car";
	p1.price=1000.00;
	p1.gst=(float) 10.0;
	p1.discount=(float) 5.0;
	p1.quantity=5;
	System.out.println("Product name : "+p1.Name);
	System.out.println("Prouct price : "+p1.price);
	System.out.println("Product gst : "+p1.gst);
	System.out.println("Product discount :  "+p1.discount);
	System.out.println("Product quantity : "+p1.quantity);
	product p2=new product();
	p2.Name ="Bike";
	p2.price=2000.00;
	p2.gst=20.0f;
	p2.discount=15.0f;
	p2.quantity=6;
	System.out.println("Product name : "+p2.Name);
	System.out.println("Prouct price : "+p2.price);
	System.out.println("Product gst : "+p2.gst);
	System.out.println("Product discount :  "+p2.discount);
	System.out.println("Product quantity : "+p2.quantity);
	product p3=new product();
	p3.Name ="Lorry";
	p3.price=3000.00;
	p3.gst=30.0f;
	p3.discount=153.0f;
	p3.quantity=9;
	System.out.println("Product name : "+p3.Name);
	System.out.println("Prouct price : "+p3.price);
	System.out.println("Product gst : "+p3.gst);
	System.out.println("Product discount :  "+p3.discount);
	System.out.println("Product quantity : "+p3.quantity);
}

}

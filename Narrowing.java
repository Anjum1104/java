package day2;

public class Narrowing {
	public static void main(String[] args) {
		double d=123.67;
		int i=99;
		
		System.out.println("d="+d);
		System.out.println("i="+i);
		//data Narrowing
		i=(int)d;
		System.out.println("d="+d);
		System.out.println("i="+i);
		
	}
	}

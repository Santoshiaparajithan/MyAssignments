package week1.day1;


public class Maths {

	private int add(int a,int b) {
		return a+b;
	}
	
	private int multiply(int a,int b) {
		return a*b;
	}
	
	public int divide(int a,int b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//classname objectname=new classname();
		Maths mat=new Maths();
		
		int add = mat.add(20, 30);
		System.out.println(add);
		
		int multiply = mat.multiply(10, 10);
		System.out.println(multiply);
		
		int divide = mat.divide(70, 10);
		System.out.println(divide);
		
	}

}

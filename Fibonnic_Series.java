package anushka.com;

public class Fibonnic_Series {
	public static void main(String[] args) {
		int i=0;
		int a=0;
		int b=1;
		int c;
		do {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
			i++;
			
		} while (i<=8);
	}

}

package anushka.com;

public class Count_Even {
	public static void main(String[] args) {
		int i=1;
		int count=0;
		do {
			if(i%2==0) {
				System.out.println(i);
				count++;
			}
			i++;
			
		} while (i<=25);
		System.out.println("Count of Even No="+count);
	}

}

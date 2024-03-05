package inherit.data;

public class C extends B {
	public void mC() {
		System.out.println("C=mC");
	}
	public static void main(String[] args) {
		
		C obj=new C();
		obj.mA();
		obj.mB();
		obj.mC();
		
		
	}

}

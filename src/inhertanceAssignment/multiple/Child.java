package inhertanceAssignment.multiple;

public class Child implements A,B{

	@Override
	public void fromB() {
	System.out.println("form B interFace");
		
	}

	/*@Override
	public void same(int sal) {
		System.out.println("from same method");
		
	}*/
	

	@Override
	public void fromA() {
		System.out.println("form A interFace");
		
	}

	/*@Override
	public void fun1() {
		A.super.fun1();
	}*/
	
	public static void main(String[] args){
		Child c = new Child();
		c.fromA();
		c.fromB();
		
	}

	@Override
	public void same(int sal) {
		System.out.println("from A with Sal input");
		
	}

	
}

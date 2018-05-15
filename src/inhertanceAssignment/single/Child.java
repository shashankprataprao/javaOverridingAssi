package inhertanceAssignment.single;

public class Child extends Parent{
	protected String add;
	
	public static void main(String[] args) {
		Child c = new Child();
		c.add="Pune";
		c.name="Shashank";
		c.num=939493489;
		System.out.println(" "+c.name);
		System.out.println(" "+c.add);
		System.out.println(" "+c.num);
		c.display();
		
	}

}

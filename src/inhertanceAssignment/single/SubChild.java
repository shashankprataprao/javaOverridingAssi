package inhertanceAssignment.single;

public class SubChild extends Child{

	public static void main(String[] args) {
		SubChild sc = new SubChild();
		
		sc.add="Pune";
		sc.name="Shashank";
		sc.num=939493489;
		System.out.println(" "+sc.name);
		System.out.println(" "+sc.add);
		System.out.println(" "+sc.num);
		sc.display();

	}

}

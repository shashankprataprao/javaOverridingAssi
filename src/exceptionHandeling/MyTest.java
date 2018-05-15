package exceptionHandeling;

import java.util.HashMap;
import java.util.Map;

public class MyTest {
	private int num1;
	private int num2;
	private int result;
	
	
	public MyTest() {
		this.num1=0;
		this.num2=0;
		this.result=0;
	}
	
	

	public MyTest(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

@SuppressWarnings("finally")
public int Divide()
{
	try {
		result = num1/num2;
		return result;
	} catch (Exception e) {
		
	System.out.println("from catch");
	return 0;
	}
	finally {
		System.out.println("from finally block");
		return 1;
	}
}

	@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + num1;
	result = prime * result + num2;
	return result = prime * result + this.result;

}



@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	MyTest other = (MyTest) obj;
	if (num1 != other.num1)
		return false;
	if (num2 != other.num2)
		return false;
	if (result != other.result)
		return false;
	return true;
}



	public static void main(String[] args) {
		MyTest m = new MyTest(10,0);
		//try {
			int res = m.Divide();
			System.out.println("result is "+res);
		/*}catch (Exception e) {
			
			System.out.println("hi from exception");
		}
		finally {
			System.out.println("from final block");
		}
*/
			
			Map<String, Integer> myMap = new HashMap<>();
			myMap.put("shruti", 10);
			
			System.out.println(myMap.containsKey("shruti"));
			
	}

}

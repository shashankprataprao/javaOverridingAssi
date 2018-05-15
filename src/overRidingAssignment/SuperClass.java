package overRidingAssignment;

public class SuperClass {
protected int num1;
protected int num2;
protected int result;

public SuperClass() {
	this.num1=0;
	this.num2=0;
	this.result=0;
}

public SuperClass(int num1, int num2) {
	super();
	this.num1 = num1;
	this.num2 = num2;
}

public int sum(int num1 , int num2){
	result = num1+num2;
	return result;
}

static public void Print() {
	System.out.println("print function of Superclass");
}

}

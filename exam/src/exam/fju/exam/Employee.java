package exam.fju.exam;

public class Employee {
	
	String name;
	int money;
	
	public Employee(String name, int money) {
		this.name= name;
		this.money = money;
		
	}
	
	public void print(){
		System.out.println(name + "\t"+ money);
	}

}

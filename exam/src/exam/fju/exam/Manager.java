package exam.fju.exam;

public class Manager extends Employee {

	int plus = 5000;

	public Manager(String name, int money) {
		super(name, money);

	}

	@Override
	public void print() {
		System.out.println(name + "\t" + (money + plus));
	}

}

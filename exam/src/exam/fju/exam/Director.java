package exam.fju.exam;

public class Director extends Manager {

	int bonus;

	public Director(String name, int money, int bonus) {
		super(name, money);
		this.bonus = bonus;

	}

	@Override
	public void print() {
		System.out.println(name + "\t" + (money + plus) + "(" + bonus + ")");
	}
}

package exam.fju.exam;

public class Niner {

	public static void main(String[] args) {
		for(int n =1; n <= 5; n++){
			for(int m=2; m<=5; m++){
				System.out.print(m + "x" + n + "=" + (n * m) + "\t" );
				if((m == 5)){
					System.out.println(" ");
				}
			}
		}

	}

}

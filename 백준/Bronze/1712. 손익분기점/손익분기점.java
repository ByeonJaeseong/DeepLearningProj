import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int A, B, C;
	A= sc.nextInt();
	B= sc.nextInt();
	C= sc.nextInt();
	if((C-B) >0) {
		System.out.println(A/(C-B)+1);
	}
	else {
		System.out.println(-1);
	}
	}

}

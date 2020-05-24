package thread;

import java.util.Scanner;

public class TestMyThread {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = in.nextInt();

		MyThread th = new MyThread(num);

	}

}

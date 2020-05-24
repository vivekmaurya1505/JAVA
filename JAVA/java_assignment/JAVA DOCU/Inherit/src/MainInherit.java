import java.util.Scanner;

import org.omg.CORBA.SystemException;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil.ToStringAdapter;

public class MainInherit {

	public static void main(String[] args) {
		System.out.println("enter id,name,date of birth,working hours,rate per hour");
		Scanner sc = new Scanner(System.in);
		Salesemployee we = new Salesemployee(sc.nextInt(),sc.nextLine()+sc.nextLine(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextFloat(),sc.nextInt(),sc.nextFloat());
		we.print();
		sc.close();
		int b=(byte)128;
		System.out.println(sc.equals(we));
		SystemException
	}

}

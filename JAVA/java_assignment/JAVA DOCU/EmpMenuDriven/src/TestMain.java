import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		EmployeeClass []e1=new EmployeeClass[10];
		Scanner sc = new Scanner(System.in);
		int ch,cnt=0;
		for(int i=0;i<e1.length;i++)
		{
			e1[i]=new EmployeeClass();
			
		}
		while(true) {
			System.out.println("Enter Choice : 1.Insert 2.Update Info 3.Display 4.Exit\n");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter id,name and salary\n");
				e1[cnt++].addemp(sc.nextInt(),sc.nextLine()+sc.nextLine(),sc.nextFloat());
				break;
			case 2:
				System.out.println("enter the employee id\n");
				int id=sc.nextInt();
				for(int i=0;i<10;i++) {
					if(id==e1[i].getId())
					{
						System.out.println("enter name and salary\n");
						e1[i].setName(sc.next());
						e1[i].setSalary(sc.nextFloat());
					}
					else
						System.out.println("enter correct id\n");
						break;
				}
				break;
			case 3:
				for(int i=0;i<cnt;i++)
					e1[i].print();
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("enter correct choice\n");
				break;
			
			}		
		
		}
	}

}

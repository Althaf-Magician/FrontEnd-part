import java.util.Scanner;
class Addition 
{
	public static void main(String[] args) 
	{
		System.out.println("MAin start");
		int c=add();
		System.out.println(c+" from main method");
		System.out.println("MAin End");
	}
	public static int add()
	{
		System.out.println("Add start");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Num1 :");
		int num1=sc.nextInt();
		System.out.println("ENter the Num2 : ");
		int num2=sc.nextInt();
		int sum=num1+num2;
		System.out.println("Add end");
		
		return sum;
		
	}
}

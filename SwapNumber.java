//Swaping the number
import java.util.Scanner;
class Swap{
	int a;
	int b;
	Swap(int a, int b){
		this.a=a;
		this.b=b;
	}
	void calculate() {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
	}
}class SwapNumber{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int a= sc.nextInt();
		int b= sc.nextInt();
		Swap s1= new Swap(a,b);
		System.out.println("The result is :");
		s1.calculate();
	}
}
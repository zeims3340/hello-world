//EstimatePI.java

import java.util.Scanner;

public class EstimatePI2{ //class header
	private int a;

	//constructor
	EstimatePI2 (int a) {this.a = a;}

	//method m(i)
	public static double m(int i) {
		double sum = 0.0;

		for (int x=1; x<=i; x++){
			if (x % 2 == 0)
				sum += -1/(2*x-1.0);
			else
				sum += 1/(2*x-1.0);
		}

		return sum*4;
	}//end m(i)


	//method printPI()
	public void printPI(){
		System.out.printf("%-10s%-10s", "i", "m(i)");
		System.out.print("\n-----------------------\n");

		for (int i=1; i<=(this.a+1)*100; i+= 100){
			System.out.printf("%-10d%-10.4f", i,(m(i)));
			System.out.println();}//end for

	}//end printPI()

	public static void main(String[] args){ //main method header
		Scanner input= new Scanner(System.in);

		System.out.print("Enter a positive integer: ");
		int x = input.nextInt();

		//decare and create an EstimatePI instance
		EstimatePI e = new EstimatePI(x);
		//calling printPI()
		e.printPI();

	}//end main

}//end EstimatePI class

package Pattern_practicebook;

import java.util.Scanner;

public class Ques36 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of lines");
		int n=sc.nextInt();
		int st=n/2+1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if((i==1||i==st||i==n)&&j<=n||j==1||j==st||j==n)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
			
		}
		

	}

}

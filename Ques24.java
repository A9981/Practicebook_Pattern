package Pattern_practicebook;

import java.util.Scanner;

public class Ques24 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of lines");
		int n=sc.nextInt();
		int x=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(x<9)
				{
				  System.out.print(x);
				  x++;
				}
				else {
					System.out.print(x);
					x=1;
			}
			}
			System.out.println();
		}
		

	}


	}



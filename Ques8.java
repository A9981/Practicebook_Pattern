package Pattern_practicebook;

import java.util.Scanner;

public class Ques8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of lines");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int x=i;
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				if(j<i) {
					System.out.print(x%2);
					x--;
				}
				else
				{
					System.out.print(x%2);
					x++;
				}
			}
			System.out.println();
		}
		

	}

}

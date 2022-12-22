package Pattern_practicebook;

import java.util.Scanner;

public class Ques5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of lines");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				if(i%2==1)
					System.out.print(i%2);
				else
					System.out.print(i%2);
			}
			System.out.println();
		}

	}

}

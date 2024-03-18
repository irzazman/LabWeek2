package Lab;

import java.util.Scanner;
import java.util.ArrayList;

public class Lab2_3 {

	public static void main(String[] args) 
	{	
		Scanner scn = new Scanner(System.in);
		System.out.println("How many mark you want to insert : ");
		int Num = scn.nextInt();
		
		float sum = 0;
		for(int i = 0; i < Num ; i++)
		{
			System.out.println("Please enter mark no "+(i+1));
			float mark = scn.nextFloat();
			sum = sum + mark;		
		}
		System.out.println("Total mark is : "+(sum));
	}

}

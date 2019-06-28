package com.bridgelab;
import java.io.PrintWriter;
import java.util.*;

public class Array {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter rows:");
		int r=s.nextInt();
		System.out.print("Enter columns:");
		int c=s.nextInt();
		
		int i[][] = new int[r][c];
		
		System.out.print("Enter integer array:");
		for(int j=0;j<r;j++)
		{
			for(int k=0;k<c;k++)
			{
				i[j][k]=s.nextInt();
			}
		}
		array(i,r,c);
	}

	private static void array(int[][] i, int r, int c) {
		PrintWriter pw = new PrintWriter(System.out,true); 
		
		pw.println("2 Dimentional array is:");
		for(int j=0;j<r;j++)
		{
			for(int k=0;k<c;k++)
			{
				pw.print(i[j][k]+"  ");
			}
			pw.println();
		}
		
	}
	

}

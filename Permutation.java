package com.bridgelab;

import java.util.Scanner;

public class Permutation {
	public static void main(String[]args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter no the elements for permutations");
		int str=s.nextInt();
		int[] a=new int[str];
		System.out.println("Enter the elements for permutations");
		for(int i=0;i<str;i++)
		{
			 a[i]=s.nextInt();
		}
		permute(str,a);
				
	}

	private static void permute(int str, int[] a) {
		System.out.println("here is your all permutation of elements having length 2");
		for(int i=0;i<str;i++)
		{
			for(int j=i+1;j<str;j++)
			{
				System.out.println(a[i]+""+a[j]);
				System.out.println(a[j]+""+a[i]);
			}
		}
		
	}



}

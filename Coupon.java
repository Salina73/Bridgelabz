package com.bridgelab;
import java.util.*; 
public class Coupon {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter how may coupons you want:");
		int n=s.nextInt();
	random(n);
		
	}

	private static void random(int n) {
		Random r = new Random();
		int [] a=new int[n];
		int [] b=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=r.nextInt(n+50);
			System.out.println((i+1)+":"+a[i]);
			
		}
		System.out.println();
		System.out.println();
		
		
	}
	
		
	}



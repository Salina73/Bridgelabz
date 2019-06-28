package com.bridgelab;
import java.util.*;
public class Stopwatch {
	public static void main(String[]args) {
	Scanner s=new Scanner(System.in);
	int a,s1;
	
	System.out.print("Press 1 for start:");
	 s1=s.nextInt();
	long start=elapsed(s1);
	System.out.print("Press 2 for stop:");
	s1=s.nextInt();
	long stop=elapsed1(s1);
	float result=(stop-start)/1000f;
	System.out.print("Elapsed time:"+result+" MilliSec");
	
	}

	private static long elapsed(int s1) {
		long start=System.currentTimeMillis();
		return start;
		
	}	
	private static long elapsed1(int s1) {
		long stop=System.currentTimeMillis();
		return stop;
	}
	
}

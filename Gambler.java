package com.bridgelab;
import java.util.*;

public class Gambler
{	
	public static void gambler(int a,int b,int c)
	{
		double h=0,t=0,i,d,e;
		for(i=0;i<c;i++)
        {
            if(Math.random()<0.5)
            {
                h++;
            }
            else
            {
                t++;
            }
        }
        d=(h/c)*100;
        e=(t/c)*100;
    
        System.out.println("Number of wins="+h);
        System.out.println("Winning rate="+d+"%");
        System.out.println("Losing rate="+e+"%");
	}
	
    public static void main(String[] args)
    {
        
        Scanner s = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter the stake amount:");
        a=s.nextInt();
    
        System.out.print("Enter the goal amount:");
        b=s.nextInt();
        
        System.out.print("Enter the chances you want:");
        c=s.nextInt();
        
        gambler(a,b,c);
  
    }
}

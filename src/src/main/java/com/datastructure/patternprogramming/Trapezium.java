/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatternProgramming;

/**
 *
 * @author AVINASH KUMAR
 */
/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Trapezium
{
	public static void main (String[] args) throws java.lang.Exception
	{int n=5;
	int p=7;
	
	for( int i=0;i<n;i++)
	{
		for(int j=0;j<n-i;j++)
		{
			System.out.print(" ");
			
			
		}
		for(int k=0;k<(p);k++)
		{
			System.out.print("*");
		}
		p+=2;
		System.out.print("\n");
	}
	}
}

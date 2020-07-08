
	
	import java.io.*;
	import java.util.Scanner;
	import java.util.*;
	public class Even {
		
		     public static int isEven(int input11){
			  if(input11%2==0){
				 return 2;}
				  else {
					  return 1;}
			       
			  	  }
	  
		     public static void main(String[] args){
				  Scanner s=new Scanner(System.in);
				  System.out.print("enter a number");
			      int input11=s.nextInt();
			       System.out.print(isEven(input11));
	}
		
	} 






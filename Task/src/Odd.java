import java.util.Scanner;
import java.io.*;
import java.util.Scanner;
import java.util.*;
public class Odd {
	public static int isOdd(int input1){
		 if(input1%2!=0)
			  return 2;
			  else 
				  return 1; 
	}
	public static void main(String args[]){
	      Scanner s=new Scanner(System.in);
	      int input1=s.nextInt();
			System.out.print(isOdd(input1));  
}
}
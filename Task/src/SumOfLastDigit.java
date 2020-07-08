import java.util.Scanner;
import java.io.*;
import java.util.*;
public class SumOfLastDigit {
	public static void main(String args[]){
	      Scanner s=new Scanner(System.in);
	      int input1=s.nextInt();
	      int input2=s.nextInt();
	      if(input1<0)
	    	  input1=(-1)*input1;
	      if(input2<0)
	    	  input2=(-1)*input2;
	      System.out.print((input1%10)+(input2%10));
}
}
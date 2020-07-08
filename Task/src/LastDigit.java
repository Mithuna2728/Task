import java.io.*;
import java.util.Scanner;
import java.util.*;

public class LastDigit {
	public static int isLastDigit(int input1){
		if(input1<0)
	    	  input1=(-1)*input1;
		return input1%10;
	}
	public static void main(String args[]){
	      Scanner s=new Scanner(System.in);
	      int input1=s.nextInt();
	      System.out.print(isLastDigit(input1%10));

}
}
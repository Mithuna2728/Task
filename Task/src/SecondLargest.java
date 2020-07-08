import java.util.Scanner;
import java.io.*;
import java.util.*;

public class SecondLargest {
	public static int isSecondLargest(int input1){
	
	      if(input1<0)
	    	  input1=(-1)*input1;
	      int c=0;
	      int l=Integer.toString(input1).length();
	      int r=0;
	      if(l==1)
	    	  System.out.print(-1);
	      else{
	    	  while(input1>0){
	    		  r=input1%10;
	    		  c++;
	    		  input1/=10;
	    		  if(c==2)
	    			  break;
	    		  
	    	  }
	    	  
	      }
		return r;
	}
	    	  public static void main(String args[]){
	    	      Scanner s=new Scanner(System.in);
	    	      int input1=s.nextInt();
	    	  System.out.print(isSecondLargest(input1));
	    	  }
	}
	      



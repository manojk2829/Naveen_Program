package java_Program;

import java.util.Scanner;

import org.testng.annotations.Test;

public class All_My_29_Program {
   @Test
   public void all() {
	   a();
   }
   
   public void a() {

	   
	   int n[]= {2345,342,32,5,67,3,45,7,3};
	   int temp;
	   for(int i=0;i<n.length;i++) {
		boolean isd=true;
		   for(int j=i+1;j<n.length;j++) {
		    
			   if(n[i]==n[j]){
				   isd=false;
				   break;
          }
			   
		   
	   }
		   if(isd)
		   System.out.print(n[i]+",");
	 
	     
	   
	  
	   /*int m1=n[0],m2=n[0];
	   for(int i=0;i<n.length;i++) {
		   if(n[i]>m1) {
			   m1=n[i];
		   }else if (n[i]<m2) {
			   m2=n[i];
		   }
       }
	   System.out.println(m1+"   "+m2);
	   
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter -- ");
	   String ss=s.nextLine();
	   System.out.println(ss.length());
	   int c=0;
	   for(int i=0;i<ss.length();i++) {
		   System.out.println();
		   if(ss.charAt(i)=='a') {
			   c++;
		   }
	   }if(c>0) {
		   System.out.println("Number of a is -- > "+ c);
	   }
	   StringBuffer sb=new StringBuffer(ss);
	   System.out.println(sb.reverse());
	   */
	   
   }
   
   }
  }

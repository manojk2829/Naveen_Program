package java_Program;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import org.testng.annotations.Test;

public class Interview_Program_Class {
	@Test
	public void all_Method() {
		//primenumber();
		//Print_primenumber();
		//swapProgram();
		//boobleSort();
		//ArmStrong_Number();
		//Palindrom_Number();
		//AlternetString();
		//count_NumberOf_A_in_String();
		//max_two_num();
		//Small_Large_Number();
		//distinct_Array_value();
		//duplicateNumberInArray();
		//max_Mun_Num();
		a();
	}
	
	public void a() {
		Random r=new Random();
		for(int i=0;i<10;i++) {
			if(i%2!=0)
				System.out.print(i+"  ");
		}	System.out.println("0000000000000000000000000000000000000000000000");
		System.out.println(r.nextInt(10));
		
		String newSs="manoj^%$*&(343&*(^&";
		String s= newSs.replaceAll("[^a-z3-4]", "");
		
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
		
		int n=12345;
		sb=new StringBuffer(String.valueOf(n));
		System.out.println(sb.reverse());
		System.out.println("*********************************************");
		
		int rev=0;
		while(n>0)
		{
			rev=rev*10+n%10;
			n=n/10;
		}
		System.out.println(rev);
		
		/*
		Scanner s=new Scanner(System.in);
		int sum=0,num=s.nextInt();
		for(int i=1;i<=num/2;i++) {
			if(num%i==0)
			sum=sum+i;
			
		}
		if(sum==num)
		System.out.print("Perfect ");
		else
			System.err.println("not");
		System.out.println("---------------------------------ssss");
		
		int n1=0,n2=1,n3;
		System.out.print(n1+" "+n2);
		for(int i=0;i<10;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		System.out.println("   ");
	
		
		
		int n[] = {32,5,34,567,8,3,6,5};
		int sum=0;
		for(int i=0;i<n.length;i++) {
			sum=sum+n[i];
		}
		System.out.println("  ");
		System.out.println(sum);
		for(int i=0;i<n.length;i++) {
			boolean isd=true;
			for(int j=0;j<i;j++){
				  if(n[i]==n[j]) {
					  isd=false;
					  break;
				  }
			}
			if(isd) {
				System.out.print(n[i]+" ");
			}
		}
		
		
		/*String sss="manojKushwaha";
		String sss1="Sarita";
		sss=sss+sss1;
		sss1=sss.substring(0,sss.length()-sss1.length());
		sss=sss.substring(sss1.length());
		System.out.println(sss+ "   "+sss1);
		
		//Perfect Number --
		int n=28,sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0){
				sum=sum+i;
			}
		}if(sum==n)
		System.out.println("Parfect");
		else{
			System.out.println("Not+");
		}
		
		String a="manoj";
		String b="sarita";
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println(b+" "+a);
		
		
			
		
		
	/*	int n[] = {1,2,3,5,6};
		for(int i=n.length-1;i>=0;i--) {
			System.out.print(n[i]+" ");
		}
		System.out.println();
		
		int p=12345;
		StringBuffer sb=new StringBuffer(String.valueOf(p));
		System.out.println(sb.reverse());
		
		int rev=0;
		while(p>0) {
			rev=rev*10+p%10;
			p=p/10;
		}
		System.out.println("********************************");
		System.out.println(rev);
		
		
		int sum=0,sum1=0;
		for(int i=0;i<n.length;i++) {
			sum=sum+n[i];
		}
		System.out.println(sum);
		
		for(int i=0;i<=6;i++) {
			sum1=sum1+i;
		}
		System.out.println(sum1);
		System.out.println(sum1-sum);
		
		
		/*String s[] = {"d","a","d","a","c","d"};
		  Set<String> store = new HashSet<String>();
		  for(String name:s) {
			  if(store.add(name)==false) {
				  System.out.println("Duplicate --- " + name);
			  }
			 
		   for(int i=0;i<s.length;i++) {
			   for(int j=i+1;j<s.length;j++) {
				   if(s[i]==s[j]) {
					   System.out.println("Duplicate -- > " +s[i]);  	  				   
				   }
				   
			   }
		   }
		//large and Small number --- 
		int n[] = {243,56,76,3,32,43,3,56};
		int s=n[0],l=n[0];
		for(int i=0;i<n.length;i++) {
			if(n[i]<s) {
				s=n[i];
			}else if(n[i]>l) {
				l=n[i];
			}
		}
		System.out.print(Arrays.toString(n)+" ");
		System.out.println(s + " "+ l);
		
		String ss="3242%#%$79manoj&^%$SAR%^12ITa";
		System.out.println(ss.replaceAll("[^a-zA-Z]", ""));
		*/
	}	
		
		
		/*int n1=0,n2=1,n3;
		System.out.print(n1+" "+n2);
		for(int i=0;i<10;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;*/
		/*int n=28,sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
			
		}if(sum==n) {
			System.out.println("parfact");
		}else {
			System.out.println("not");
		}*/
		
	  /* String s="24345@#%%&Manoj Kush&^$$ waha";
	   System.out.println(s.replaceAll("[^a-zA-Z0-9]",""));
	   System.out.println("8888888888888888888888888888888888888888888888");
	   
	   Random run=new Random();
	   for(int i=0;i<5;i++) { 
		   int n=run.nextInt(100);
	   System.out.println(n);
	   }
		
		int n[] = {52,4,76,53,34,554,3,6,33,10};
		System.out.print(Arrays.toString(n)+" ");
		System.out.println();
		for(int i=n.length-1;i>=0;i--) {
			System.out.print(n[i]+" "); 
			
			
		}
		*/
		
	
		/*int n[] = {52,4,76,53,34,554,3,6,33,10};
		int temp=0;
		for(int i=0;i<n.length;i++) {
		    temp=temp+n[i];
		    
		}
			System.out.print(temp);
			System.out.println();
		}
	
	    int n=100;
	    for(int i=1;i<=n;i++) {
	        if(i%2!=0)
	    	System.out.print(i+" ");
	    }*/
	    
		
		
		
		
		/*int n1=100,sum=0;
		for(int i=0;i<=n1;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		System.out.println("------------------------------------");
		int n=20;int sum=0;
		for(int i=2;i<n;i++) {
			boolean isp=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isp=false;
					break;
				}	
			}if(isp) {
				sum=sum+i;
			}
			System.out.println(sum);
		}
		
		
         /*String s="manojabbaaa";
         int count=0;
         for(int i=s.length()-1;i>=0;i--) {
        	 
        	 if(s.charAt(i)=='b')
        	 count++;
         }
         if(count>0) {
        	 System.out.println(count);
         }
         StringBuffer sb=new StringBuffer(s);
         System.out.println();
         System.out.println(sb.reverse());

         int n=2345;
         int rev=0;
         while(n>0) {
        	 rev=rev*10+n%10;
        	 n=n/10;
         }
         System.out.println(rev+"__________________");
         
         int nn=23456;
         StringBuffer ss=new StringBuffer(String.valueOf(nn));
         System.out.println(ss.reverse());
int n=120121,temp,sum=0,r;
		temp=n;
		while(n>0) {
			r=n%10;
			//sum=(r*r*r)+sum;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(sum==temp) {
			//System.out.println("ArmStrong");
			System.out.println("Palindrom");
		}else {
			System.out.println("Not");
		}
*/	

  public void max_Mun_Num() {
	 int n[]= {32,45,63,42,76,89,34,6,2,56};
	 System.out.print(Arrays.toString(n)+" ");
	 System.out.println("");
	 for(int i=n.length-1;i>=0;i--) {
		 System.out.print(n[i]+" ");
	 }
	 System.out.println();
	 int max1=0;
	 int max2=0;
	 for(int num:n) {
		 if(num>max1) {
			 max2=max1;
		 max1=num;
		 }
		 else if(num>max2) {
			 max2=num;
		 }
	 }
	 System.out.println(max1+"   "+max2);
 }
	
	
	
	public void duplicateNumberInArray() {
		int n[]= {324,65,423,7,17,76,34,76,8,21,12,8};
		for(int i=0;i<n.length;i++) {
			for(int j=i+1;j<n.length;j++) {
				if(n[i]==n[j]) {
					System.out.println("D - "+n[i]+" ");
				}
			}
		}
	}
	
	public void distinct_Array_value() {
		int n11[]= {324,65,423,7,7,7,34,76,8,21,12,8};
		System.out.println(n11.length);
		for(int k=n11.length-1;k>=0;k--) {
			System.out.print(n11[k]+",");
		}
    	for(int i=0;i<n11.length;i++) {
			boolean isd=true;
			for(int j=i+1;j<n11.length;j++) {
				if(n11[i]==n11[j]) {
					isd=false;
					break;
				}
			}
			if(isd) {
			    System.out.println("Duplicate number -- " + n11[i]);
			   		}
    }
    	
    	/*int[] d={1,21,2,1,21,3,34};
    	System.out.println(d.length);
		for(int i=0;i<d.length;i++){
			boolean isD=true;
			for(int j=0;j<i;j++){
				if(d[i]==d[j]){
					isD=false;
					break;
				}
			}if(isD){
				System.out.println(d[i]);
				System.out.println(d.length);
			}
		}
    */	
    	
	}
	
	public void max_two_num() {
		int n[] = {32,23,45,6,2,54,76,21,54,20,59,45,43};
		int m1=0,m2=0;
		for(int num:n) {
			if(num>m1) {
				m2=m1;
			    m1=num;
			}
			else if(num>m2)
				m2=num;
		}
		System.out.println(m1 +" = "+m2);
	}

	public void Small_Large_Number() {
		
		int n[]= {324,65,423,7,3,17,867,34,76,8,2,12,8};
		int s=n[0],l=n[0];
		for(int i=0;i<n.length;i++) {
			    	if(n[i]<s) {
			    		s=n[i];
			    	}
			    	else if(n[i]>l) {
			    		l=n[i];
			    	}
		}
			System.out.println(s+"   ---  "+l);
	}

	
	public void max_two_Number() {
		int max1=0,max2=0;
		int n[]= {324,65,423,7,3,17,867,34,76,8,2,12,8};
		for(int num:n) {
			if(max1<num) {
				max2=max1;
				max1=num;
			}else if(max2<num){
				max2=num;
			}
		}
			System.out.println(max1+"   ---  "+max2);
	}
	
	public void count_NumberOf_A_in_String(){
		String s="Manoj Kushwaha test a to z and apple";
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a') {
				count++;
			}
		}if(count>0) {
			System.out.println(count);
		}
	}
	
	
	public void AlternetString() {
		String s="manoj Kushwaha";
		System.out.println(s.length());
		for(int i=0;i<s.length();i+=2) {
			System.out.print(s.charAt(i)+" ");
		}
	}
	
	public void ArmStrong_Number() {
		int n=371,temp,sum=0,r;
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(r*r*r)+sum;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("Number is ArmStrong");
		}else {
			System.out.println("Not ArmStrong");
		}
	}

	public void Palindrom_Number() {
		int n=10101,temp,sum=0,r;
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("Number is Palindrom_Number");
		}else {
			System.out.println("Not Palindrom_Number");
		}
	}

	
	public void boobleSort() {
		int n[]= {2,43,23,5,8,13,7,17,23,57,9,4353,3};
		int temp;
		for(int i=0;i<n.length;i++) {
			for(int j=i+1;j<n.length;j++) {
				if(n[i]>n[j]) {
					temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				}
			}System.out.print(n[i]+" ");
		}
	}
	public void primenumber() {
		int n=17;boolean isp=true;
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				isp=false;
				break;
			}
		}if(isp) {
			System.out.println("Prime");
		}else {
			System.out.println("Not");
		}
	}

	public void Print_primenumber() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number -- ");
		int num=sc.nextInt();
		for(int i=2;i<=num;i++) {
		     boolean isp=true;
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				isp=false;
				break;
			}
		}if(isp) {
			System.out.print(i+" ");
		}
	}
   }
	
	public void swapProgram() {
		int a=10,b=20;
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println();
		System.out.println(a+"  "+b);
	}
}

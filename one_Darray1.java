package Array;

import java.util.Scanner;

public class one_Darray1 {

	public static void main(String[] args) {

             int a[]= {0,1,2,3,4,5,6,7};
             int i;
             for(i=0;i<a.length;i++)
             {
            	 System.out.println(a[i]);
             }
	//-------------------------------------------------------//
             int n;
             Scanner sc=new Scanner(System.in);
             System.out.println("enter the number of elements:");
             n=sc.nextInt();           
             
             
             int b[]= new int[n];
             System.out.println("enter the elements of teh array:");
             for (i=0;i<n;i++)
             {
            	 b[i]=sc.nextInt();
             }
             System.out.println("the array elements are:");
             for (i=0;i<n;i++)
             {
            	 System.out.println(b[i]);
             }
	}
	

}

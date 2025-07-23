import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner Sc=new Scanner(System.in);
		int N=Sc.nextInt();
		int X=Sc.nextInt();
		boolean found=false;
		int A[]=new int[N];
		for(int i=0;i<A.length;i++){
		    A[i]=Sc.nextInt();
		}
		for(int j=0;j<A.length;j++){
		    if(A[j]==X){
		        found=true;
		        break;
		    }
		}
		if(found){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}

	}
}

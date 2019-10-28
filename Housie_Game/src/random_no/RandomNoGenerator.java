package random_no;

import java.security.SecureRandom;

public class RandomNoGenerator
{
 static int[] getRandomNo(int min, int max) {
	 int n = max-min+1;  //no of integer need to generate
	 
	 //create an array to store all numbers in(min,max)
	 
	 int a[] = new int[n];
	 
	 for(int i=0; i<n; i++) {
		 a[i]=i;
	 }
	 
	 //an array to store the result
	 int[] result = new int[n];
	 int b =n;
	 
	 SecureRandom rd = new SecureRandom();
	 for(int i=0; i<n;i++) {
		 //k is a random index in (0,b);
		 int k = rd.nextInt(b);
		 
		 result[i] = a[k];
		  //we got value from a[k]. we replace its value by the value from last index
		 a[k] = a[b-1];
		 
		 //then we decrease b by 1 to get a random index from 0 to b only
		 b--;
	 }
	 return result;
 }
 
	 public static void main(String[] args) {
		int[] result = getRandomNo(1,90);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]+ " ");
			
		
	}
		 
 }
}

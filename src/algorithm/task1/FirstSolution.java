/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.task1;
/**
 *
 * @author Mohamed Adel
 */
public class FirstSolution {
    
	public int Solution(int arr[])
	{		
            int Size = arr.length ; // array size 
	    int i,j ; // counters for the nested loop    
            int intersections = 0 ; // counter for intersections 
               
	    for(i=0;i<Size-1;i++) // n 
	    { 
	        for(j=i+1;j<Size;j++) // n*n
	        {
	            if(arr[i]+arr[j]>j-i) 
	            {                        // O(n^2)
                        //T .. time Complexity is O(N^2)
                        // brute force Algorithm 
	                System.out.println(" there is intersection between disk number "+ j + " " + "and disk number " + i); //n*n
                        // printing which disks intersects with each others 
	                intersections++ ; // increment number of intersects while the condition is true 
	            }
	        }
	    }	    
		return intersections ; // number of intersections 
	}  
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.task1;
import java.util.*; 

/**
 *
 * @author Mohamed Adel
 */
public class SecondSolution {
    
   public static int solution(int[] A) {
        
        int[] lowerPoints = new int[A.length];                 
        int[] upperPoints = new int[A.length];                                
        int intersections = 0; // counter for intersections
        
        
        for(int i=0; i<A.length; i++){ 
            lowerPoints[i] = i - A[i];  
            upperPoints[i] = i + A[i];   
        } 
        
        // sort lower points & upper points
        Arrays.sort(upperPoints); // {1,4,,4,5,6,8}
        Arrays.sort(lowerPoints); // {-4,-1,0,0,2,5}
     
        
        int j = 0; // for the lower points 
        int i ; // Outer loop counter " upper Points "
        
        for(i=0; i<A.length; i++){  // O(N+1) ... ignore 1 
            while( j < A.length && upperPoints[i] >= lowerPoints[j]){ // n*log(n) 
                   
                    intersections = intersections +j ;
                    // increment count by j if one upper point >= one lower point after sorting them  
                    intersections = intersections -i ; // -1  -3 
                    // avoid double count .. repeated intersections "over flow"
                    j++ ;                  
                    // solution block of code to get number of intersections  
                    // the used algorithm is "merge sort Algorithm"
                    // T .. time complexity is O(nLogn)
            }             
        }

        for(i=0, j=i+1; i<=intersections ; i++){    
            while( j < A.length && upperPoints[i] >= lowerPoints[j]){   
                if ( i != j ) { // printing which disks intersects with each others
                    System.out.println("disk number " + j + " intersects with disk number " + i); // T .. O(NLogN)
                }
                j++ ; 
            }
            j = i+1;
        } 
        
        return intersections ; //total number of intersections      
    } 
}

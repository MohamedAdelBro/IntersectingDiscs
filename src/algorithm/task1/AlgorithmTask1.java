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
public class AlgorithmTask1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        	FirstSolution solution1 = new FirstSolution();
		SecondSolution solution2 = new SecondSolution() ;
		
		Scanner input = new Scanner(System.in);
		int Length ;
		System.out.println("please enter the number of disks");
		Length = input.nextInt();
		int arr[] = new int [Length] ;
		for(int i=0; i<Length; i++ ) {
			 System.out.println("please enter the radius of disk number "+ i);
	         arr[i] = input.nextInt();
	      }                
                
		//System.out.println(solution1.Solution(arr));
                System.out.println(solution2.solution(arr));

    }
    
}

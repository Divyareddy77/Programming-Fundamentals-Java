import java.util.Scanner; 
public class Solution { 
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in); 
        
        // Don’t write System.out.println() statements to enter the  data 
        
        // Write your code here 
        // Calculate and print the price according to the question
        double costPerDozen=sc.nextDouble();
        double numberOfDozens=sc.nextDouble();
        double discountPercentage=sc.nextDouble();
        double totalCost=numberOfDozens*costPerDozen;
        double discount=(totalCost*discountPercentage)/100;
        double finalCost=totalCost-discount;
        System.out.println((int)finalCost);

        sc.close(); 
    } 
}
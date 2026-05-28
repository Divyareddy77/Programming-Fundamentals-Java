import java.util.Scanner; 
public class Solution { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        
        // Write your code here to apply the compound assignment 
        //operators 
        int amount = sc.nextInt();
        int amount1 = sc.nextInt();
        int amount2 = sc.nextInt();
        amount += amount1;
        amount -= amount2;
        System.out.println(amount);
        sc.close(); 
    } 
}
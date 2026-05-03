import java.util.Scanner; 
public class Solution { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        double pricePerKg = scanner.nextDouble(); 
        int quantitySold = scanner.nextInt(); 
        
        // Write your code here
        if(pricePerKg>=0.0 && pricePerKg<=1000.0 && quantitySold>=0 && quantitySold<=100){
            double totalEarnings=pricePerKg*quantitySold;
                System.out.printf("%.2f",totalEarnings);
        }
        scanner.close(); 
    } 
}
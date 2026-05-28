import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // write your code here
        String membership = scanner.next();
        double amount = scanner.nextDouble();
        if(amount < 0){
            System.out.println("Invalid amount");
        }else if(membership.equals("Gold")){
            double totalAmount = amount - ((amount * 30)/100);
            System.out.println("Final Amount after Discount: "+totalAmount);
        }
        else if(membership.equals("Silver")){
            double totalAmount = amount - ((amount * 20)/100);
            System.out.println("Final Amount after Discount: "+totalAmount);
        }
        else if(membership.equals("Regular")){
            double totalAmount = amount - ((amount * 7)/100);
            System.out.println("Final Amount after Discount: "+totalAmount);
        }
        else{
            System.out.println("Invalid membership");
        }
        


        scanner.close();

    }

}
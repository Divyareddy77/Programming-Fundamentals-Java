import java.util.Scanner;

public class Solution {

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        // Your code to determine if 'number' is positive, negative, or zero goes here
        int number=scanner.nextInt();
        if(number<0)
            System.out.println("Negative");
        if(number>0)
            System.out.println("Positive");
        if(number==0)
            System.out.println("Zero");

        scanner.close();

    }

}
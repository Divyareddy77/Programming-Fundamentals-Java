import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Your code to check if 'year' is a leap year goes here
        int year  = scanner.nextInt();
    
            if((year % 400 == 0) || (year % 4 == 0 && year % 100 !=0))
                System.out.println("Leap year");
            else
                System.out.println("Not a leap year");

        scanner.close();

    }

}
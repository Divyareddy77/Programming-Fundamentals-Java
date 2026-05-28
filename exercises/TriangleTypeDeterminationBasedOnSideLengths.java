import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Your code to determine the type of triangle based on 'side1', 'side2', 'side3' goes here
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();
        if(side1 + side2 <= side3 || side2 + side3 <= side1 || side3 + side1 <= side2){
            System.out.println("Not a valid triangle");

        }
        else if(side1 == side2 && side2 == side3)
            System.out.println("Equilateral");
        else if(side1 == side2 || side2 == side3 || side3 == side1)
            System.out.println("Isosceles");
        else
            System.out.println("Scalene");

        scanner.close();

    }

}
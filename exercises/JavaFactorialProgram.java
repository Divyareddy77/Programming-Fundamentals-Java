import java.util.Scanner;


public class Solution{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Your code to calculate the factorial of 'n' using do-while loop goes here
        int n = scanner.nextInt();
        int factorial = 1;
        if(n==0){
            System.out.println(1);
        }else{
        do{
            factorial = factorial * n;
            n--;

        }while(n>0);
        System.out.println(factorial);

        scanner.close();
    }
    }

}
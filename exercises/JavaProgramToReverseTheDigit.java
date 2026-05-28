import java.util.Scanner; 

public class Solution { 

    public static void main(String[] args) { 

    Scanner scanner = new Scanner(System.in); 

    // Write your code here 
    int number = scanner.nextInt();
    int sign = 1;
    if(number < 0){
        sign = -1;
        number = -number;
    }
    int reversed = 0;
    while(number > 0){
        int digit = number % 10;
        reversed = reversed * 10 + digit;
        number = number / 10;
    }
    System.out.println(reversed * sign);
    

    scanner.close(); 
   } 

} 
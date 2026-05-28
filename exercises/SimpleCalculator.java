import java.util.Scanner; 
public class Solution { 
    public static void main(String[] args) { 
        // Take help of Scanner to take input 
        Scanner sc = new Scanner(System.in); 
        
        // Write your code here 
        // Display the result according to the given inputs
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        char operation = sc.next().charAt(0);
        if(number1 < -1000 || number1 > 1000 || number2 < -1000 || number2 > 1000 ){
            System.out.println("Invalid Input");
        }
        else{
        switch(operation){
            case '+' : System.out.println(number1 + number2);
                    break;
            case '-' : System.out.println(number1 - number2);
                    break;
            case '*' : System.out.println(number1 * number2);
                    break;
            case '/' : if(number2 == 0){
                System.out.println("Error: Division by zero");
            }
            else{
                    System.out.println(number1 / number2);
            }
                    break;
            default : System.out.println("Invalid operation");
                
        }
        }

        sc.close(); 
    } 
}
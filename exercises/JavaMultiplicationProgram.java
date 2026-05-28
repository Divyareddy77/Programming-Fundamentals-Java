import java.util.Scanner; 

    public class Solution { 

    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in); 

        // Your code here 
        int number = scanner.nextInt();
        if(number <= 0){
            System.out.println("Invalid Input");
        }
        else{
            System.out.println("Multiplication Table of "+number+":");
            for(int i = 1;i <= 10;i++ ){
                
                System.out.println(number+" * "+i+" = "+number*i);
        }
    }

        scanner.close(); 

    } 

} 
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // write your code here
        int subject1Marks=scanner.nextInt();
        int subject2Marks=scanner.nextInt();
        int subject3Marks=scanner.nextInt();
        int subject4Marks=scanner.nextInt();
        int subject5Marks=scanner.nextInt();
        if(subject1Marks<0 || subject1Marks>100 || subject2Marks<0 || subject2Marks>100 ||subject3Marks<0 || subject3Marks>100 ||subject4Marks<0 || subject4Marks>100 ||subject5Marks<0 || subject5Marks>100  ){
            System.out.println("Invalid Input");
        }
        int totalMarks=subject1Marks+subject2Marks+subject3Marks+subject4Marks+subject5Marks;
        System.out.println("Total Marks: "+totalMarks);
        if(totalMarks>=450)
            System.out.println("Grade: A");
        else if(totalMarks>=400 && totalMarks<450)
            System.out.println("Grade: B");
        else if(totalMarks>=350 && totalMarks<400)
            System.out.println("Grade: C");
        
        else if(totalMarks>=300 && totalMarks<350)
            System.out.println("Grade: D");
        
        else if(totalMarks<300)
            System.out.println("Grade: F");
        

        scanner.close();

    }  

}
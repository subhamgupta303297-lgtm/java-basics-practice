import java.util.*;

public class MenuDrivenMarks {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
int input;

     do {
        System.out.println("Enter 1 in input to get Student Marks. Enter 0 to Exit. ");
         input = sc.nextInt();

        if(input == 1) {
            System.out.println("Enter Marks between 0 to 100");
            int marks = sc.nextInt();

            if(marks >= 90) {
                System.out.println("This is too much Good");

            } else if(marks >= 60 && marks <= 89) {
                System.out.println("This is also Good");

            } else if(marks >= 0 && marks <= 59) {
                System.out.println("This is Good as Well");

            } else {
                System.out.println("Invalid Marks Typed. Please Enter correct Marks");

            }
System.out.println("Marks doesn't Matter, Efforts Does.");

        } else if(input == 0) {
            System.out.println("Thanks for Exiting the Program");

        } else {
            System.out.println("Invalid Key Tyuped. Enter 0 or 1");

        }

     } while(input == 1);

     sc.close();

    }
}

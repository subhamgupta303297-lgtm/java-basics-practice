import java.util.*;

public class Neighbour {
public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
    // User prompts
    System.out.print("Enter the first age: ");
    int age1 = sc.nextInt();
    System.out.print("Enter the second age: ");
    int age2 = sc.nextInt();

    // Logic to find the greater age
    int greaterAge = Math.max(age1, age2);
    System.out.println( "The greater age is: " + greaterAge);
sc.close();

    
}

}


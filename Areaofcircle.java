import java.util.*;


public class Areaofcircle{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        // given radius to user as input
        System.out.println("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        // Logic behnd to find area 
      double area = Math.PI * radius * radius;
        System.out.println("Area of the circle is:" + area);
sc.close();

    }
}
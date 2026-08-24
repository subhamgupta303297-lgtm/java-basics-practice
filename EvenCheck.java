import java.util.*;

public class EvenCheck {
    public static void main(String[]args) {
Scanner sc = new Scanner(System.in);

// Taking input for user to check number n is even or not

int n = sc.nextInt();

for(int i = 1; i <= n; i++) {
if(i % 2== 0) {
    System.out.println(i);

}
}
sc.close();

}
}
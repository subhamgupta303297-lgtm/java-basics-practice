public class ProblemSolution {
    public static void main(String[] args) {
        int n = 5;
        // outer loop -> for Row section
      for(int i=1; i<=n; i++) {
        // inner loop -> for Column section
        for(int j=1; j<=i; j++) {
            if((i+j)%2 == 0) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
      }
      System.out.println();
    }
}
}
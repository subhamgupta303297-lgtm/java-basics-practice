public class PRoblemSolvingPatternBased {
    public static void main(String[]args) {
int n = 5;

        // Outer loop -> Rows (1 to n)
        for (int i = 1; i <= n; i++) {
            // Inner loop -> Columns (1 to i)
            for (int j = 1; j <= j_limit(i); j++) { // j <= i
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    private static int j_limit(int i) {
        return i;
       
    }
}

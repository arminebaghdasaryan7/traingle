public class Main {

    public static void main(String[] args) {
        printTriangle(5);
    }

    static void printTriangle(int lines) {
        int num = 1;
        for (int i = 0; i < lines; i++) {
            for (int j = 1; j < lines - i; ++j) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == 0)
                    num = 1;
                else
                    num = num * (i - j + 1) / j;

                System.out.printf("%4d", num);
            }

            System.out.println();
        }
    }
}

import java.util.Scanner;

public class MosaicoCastelo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();

        System.out.println("--- DIMENSAO " + n + " x " + n + " ---");

        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) { 
                if ((i == 1 || i == n) && (j == 1 || j == n)) {
                    System.out.print("+");
                }
                else if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("#");
                }
                else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
        entrada.close();
    }
}
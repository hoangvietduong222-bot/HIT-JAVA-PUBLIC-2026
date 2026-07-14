import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        double Dai = scanner.nextDouble();
//*double Dai = scanner.nextDouble();
//scanner.nextLine();
//*/
        System.out.println("Nhap chieu rong: ");
        double Rong = scanner.nextDouble();

        double C = 2 * (Dai + Rong);
        double S = Dai * Rong;
        System.out.printf("Chu vi hcn = %.2f%n" , C);
        System.out.printf("Dien tich = %.2f%n" , S);

        scanner.close();
    }
}
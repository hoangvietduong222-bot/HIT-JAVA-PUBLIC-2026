import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap x1: ");
        Double x1 = Double.parseDouble(sc.nextLine());

        System.out.print("Nhap y1: ");
        Double y1 = Double.parseDouble(sc.nextLine());

        System.out.print("Nhap x2: ");
        Double x2 = Double.parseDouble(sc.nextLine());

        System.out.print("Nhap y2: ");
        Double y2 = Double.parseDouble(sc.nextLine());

        double d = Math.pow(x2-x1, 2) + Math.pow(y2- y1, 2);

        System.out.printf("Khoảng cách giữa hai điểm A và B là: %.2f%n", Math.sqrt(d) );
    sc.close();
    }
}

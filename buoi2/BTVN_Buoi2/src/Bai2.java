import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double a, b, c;
        do {
            System.out.print("Nhap canh a: ");
             a = Double.parseDouble(sc.nextLine());

            System.out.print("Nhap canh b: ");
             b = Double.parseDouble(sc.nextLine());

            System.out.print("Nhap canh c: ");
             c = Double.parseDouble(sc.nextLine());

            if (a <= 0 || b <= 0 || c <= 0 ||
                    a + b <= c || a + c <= b || b + c <= a){
                System.out.println("Ba cạnh đã nhập không tạo thành một tam giác hợp lệ. ");
            }
            if(a==b && b==c && a==c){
                System.out.println("Day la tam giac deu");
            }else if(a==b || a==c || b==c){
                System.out.println("Day la tam giac can");
            }else{
                System.out.println("Day la tam giac thuong");
            }
        }while (a <= 0 || b <= 0 || c <= 0 ||
                a + b <= c || a + c <= b || b + c <= a);

        double cv = a+b+c;
        System.out.printf("Chu vi: %.2f%n", cv);
        double p = cv / 2.0;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.printf("Diện tích: %.2f%n", s);

        sc.close();
    }
}

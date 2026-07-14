import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap nam: ");
        double nam = sc.nextDouble();
        if(nam % 4 == 0)
        {
            System.out.println("Nam nhuan");
        }
    }
}

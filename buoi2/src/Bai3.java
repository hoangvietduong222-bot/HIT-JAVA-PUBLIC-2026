import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mật khẩu: ");
        String password = sc.nextLine();

        String CleanedPassword = password.trim();
        int length = CleanedPassword.length();

        boolean HasDigit = false; //Có chứa chữ số ko
        boolean HasUpper = false; //Có chứa chữ hoa ko

        for(int i=0; i<length; i++){
            char c = CleanedPassword.charAt(i);

            if(c > '0' && c <= '9'){
                HasDigit = true;
            }

            if(c >= 'A' && c <= 'Z') {
                HasUpper = true;
            }
        }

        if(length>=8 && HasDigit && HasUpper){
            System.out.println("Mật khẩu hợp lệ.");
        }else{
            System.out.println("Mật khẩu không hợp lệ!");

            if(length < 8){
                System.out.println("- Mật khẩu phải có độ dài tối thiểu là 8 ký tự.");
            }
            if(!HasDigit){
                System.out.println("Mkhau phải chứa ít nhất 1 chữ số.");
            }
            if(!HasUpper){
                System.out.println("- Mật khẩu phải chứa ít nhất 1 chữ cái viết hoa.");
            }
        }
        sc.close();
    }
}

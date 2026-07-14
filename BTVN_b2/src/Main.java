//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Khởi tạo đối tượng Scanner để nhận dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CHƯƠNG TRÌNH TÍNH CHU VI & DIỆN TÍCH HÌNH CHỮ NHẬT ===");

        // 2. Nhập chiều dài (dùng nextLine() rồi ép kiểu để tránh trôi lệnh)
        System.out.print("Nhập chiều dài: ");
        double length = Double.parseDouble(scanner.nextLine());

        // 3. Nhập chiều rộng
        System.out.print("Nhập chiều rộng: ");
        double width = Double.parseDouble(scanner.nextLine());

        // 4. Tính toán chu vi và diện tích
        double perimeter = (length + width) * 2;
        double area = length * width;

        // 5. Xuất kết quả định dạng 2 chữ số thập phân
        System.out.println("\n--- KẾT QUẢ ---");
        System.out.printf("Chu vi hình chữ nhật: %.2f%n", perimeter);
        System.out.printf("Diện tích hình chữ nhật: %.2f%n", area);

        // Đóng scanner sau khi sử dụng
        scanner.close();
    }
}
import java.util.Scanner;

public class Bai5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập thông tin nhân viên: ");
        String Input = sc.nextLine();

        String[] parts = Input.trim().split("-");

        if (parts.length < 4) {
            System.out.println("Thông tin nhập ko đúng định dạng!");
            return;
        }

        String code = parts[0].trim();
        String rawName = parts[1].trim();
        String rawYear = parts[2].trim();
        String department = parts[3].trim();

        String formattedName = capitalizeName(rawName);

        if (department.toLowerCase().contains("Kỹ thuật") ||
                department.toLowerCase().contains("ky thuat")) {
            System.out.println("Phân loại: Nhân viên kỹ thuật");
        } else {
            System.out.println("Phân loại: Nhân viên nghiệp vụ");
        }
        int birthYear = Integer.parseInt(rawYear);
        int age = 2026 - birthYear;

        System.out.println("Mã nhân viên: " + code +
                " | Họ và tên: " + formattedName +
                " | Tuổi: " + age +
                " | Bộ phận: " + department);
    }

    public static String capitalizeName(String name) {
        String[] words = name.split("\\s+");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() > 0) {
                // Viết hoa chữ đầu, viết thường các chữ sau
                String firstChar = word.substring(0, 1).toUpperCase();
                String remaining = word.substring(1).toLowerCase();

                result += firstChar + remaining;
                if (i < words.length - 1) {
                    result += " "; // Thêm khoảng trắng giữa các từ
                }
            }
        }
        return result.trim();
    }
}

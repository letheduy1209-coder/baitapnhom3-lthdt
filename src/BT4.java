import java.util.Scanner;
public class BT4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Nhập dữ liệu
            System.out.print("Nhập số tiền gửi (VND): ");
            double soTienGui = scanner.nextDouble();
            scanner.nextLine(); // bỏ Enter thừa

            System.out.print("Nhập lãi suất hàng năm (vd 0.06 = 6%): ");
            double laiSuat = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Nhập số tháng gửi: ");
            int thang = scanner.nextInt();

            // Tính toán
            double tienLai = soTienGui * laiSuat / 12 * thang;
            double tongTien = soTienGui + tienLai;

            // Xuất kết quả
            System.out.println("\n------ KẾT QUẢ ------");
            System.out.println("Số tiền lãi: "+ tienLai);
            System.out.println("Tổng số tiền cuối kỳ: " + tongTien);
        }
    }

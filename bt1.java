import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten cua ban: ");
        String ten = scanner.nextLine(); 

        System.out.println("Hello " + ten);

        scanner.close();
    }
}

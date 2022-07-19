import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Control control = new Control();
        control.addLish();
        control.displayLish();
        System.out.println("sua lai thong tin san pham");
        control.updateProduct();
        control.displayLish();
        System.out.println("sua lai thong tin san pham");
        control.deleteProduct();
        System.out.println("danh sach san pham moi la:");
        control.displayLish();

    }

}

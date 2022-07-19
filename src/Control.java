import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Control {
    ArrayList<Product> lish = new ArrayList<>();
    // nhap danh sach san pham:
    public void addLish() {
        System.out.println("nhap vao so luong san pham:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            Product product = new Product();
            product.insertProduct();
            lish.add(product);
        }
    }
    // in ra danh sach san pham
    public void displayLish() {
        for (Product product:
             lish) {
            System.out.println(product);
        }
    }
    // sua thong tin san pham qua id
    public void updateProduct() {
        System.out.println("nhap ma san pham can cap nhat thong tin:");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        Product spFound = null;
        for (Product product:
             lish) {
            if (product.getId() == id) {
               spFound = product;
               break;
            }
        }
        if (spFound != null) {
            spFound.insertProduct();
        }else {
            System.out.println("khong tim thay san pham de cap nhat");
        }
    }

    // xoa san pham theo id
    public void deleteProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi nhap id de xoa san pham");
        int id = scanner.nextInt();
        for (Product product:
             lish) {
            if (product.getId() == id) {
                lish.remove(product);
                break;
            }else {
                System.out.println("khong co trong danh sach san pham");
            }
        }
    }

    // tim kiem san pham theo ten
    public void findProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi nhap ten san pham can tim kiem");
        String name = scanner.nextLine();
        for (Product product:
             lish) {
            if (product.getName().equals(name)) {
                System.out.println(product);
                break;
            }else {
                System.out.println("khong tim thay san pham");
            }
        }
    }

    // sap xep san pham theo thu tu tang dan
    public void ascendingProduct() {
        Collections.sort(lish, (sp1, sp2) -> (int) (sp1.getPrice() - sp2.getPrice()));
    }

    // sap xep san pham theo thu tu giam dan
    public void decreaseProduct() {
        Collections.sort(lish, (sp1, sp2) -> (int) (sp2.getPrice() - sp1.getPrice()));
    }

}

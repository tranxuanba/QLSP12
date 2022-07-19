import java.util.Scanner;

public class Product {
    public int id;
    public String name;
    public int price;

    public Product() {
    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void insertProduct() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("moi nhap id san pham");
        id = scanner.nextInt();
        System.out.println("moi nhap ten san pham");
        name = scanner1.nextLine();
        System.out.println("moi nhap gia san pham");
        price = scanner.nextInt();
    }

    public void displayProduct() {
        System.out.println("danh sach san pham la:");
        System.out.println(id + " - " + name + " - " + price);
    }

}

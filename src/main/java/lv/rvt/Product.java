package lv.rvt;

public class Product {
  private String name;
  private double price;
  private int quantity;

  public static void main(String[] args) {
    Product product = new Product("Banana", 1.1, 13);
    product.printProduct();
}

  public Product(String initialName, double initialPrice, int initialQuantity) {
      this.name = initialName;
      this.price = initialPrice;
      this.quantity = initialQuantity;
  }


  public void printProduct() {
      System.out.println(name + ", price " + price + ", " + quantity + " pcs");
  }
}

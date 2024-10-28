import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<MenuItem> items;

    public Order() {
        this.items = new ArrayList<>();
    }

    public void addItem(MenuItem item, int quantity) {
        for (int i = 0; i < quantity; i++) {
            items.add(item);
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void printReceipt() {
        System.out.println("===== Nota Pemesanan Restoran Lanang =====");
        for (MenuItem item : items) {
            System.out.println(item.getName() + " - Rp " + item.getPrice());
        }
        System.out.println("Total Harga: Rp " + calculateTotal());
    }
}

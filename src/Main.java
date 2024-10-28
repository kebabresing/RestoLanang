import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();

        // Daftar Menu
        MenuItem[] menuItems = {
                new MenuItem("Nasi Goreng", 20000),
                new MenuItem("Ayam Bakar", 25000),
                new MenuItem("Es Teh Manis", 5000),
                new MenuItem("Jus Jeruk", 7000)
        };

        // Tampilkan Menu
        System.out.println("===== Menu Restoran Lanang =====");
        for (int i = 0; i < menuItems.length; i++) {
            System.out.println((i + 1) + ". " + menuItems[i].getName() + " - Rp " + menuItems[i].getPrice());
        }

        // Proses Pemesanan
        while (true) {
            System.out.print("Masukkan nomor menu yang ingin dipesan (atau 0 untuk selesai): ");
            int menuNumber = scanner.nextInt();

            if (menuNumber == 0) {
                break; // Selesai memesan
            }

            if (menuNumber < 1 || menuNumber > menuItems.length) {
                System.out.println("Nomor menu tidak valid, coba lagi.");
                continue;
            }

            System.out.print("Masukkan jumlah yang ingin dipesan: ");
            int quantity = scanner.nextInt();

            // Tambahkan item ke pesanan
            MenuItem selectedItem = menuItems[menuNumber - 1];
            order.addItem(selectedItem, quantity);
            System.out.println(quantity + " " + selectedItem.getName() + " ditambahkan ke pesanan.\n");
        }

        // Cetak Nota
        order.printReceipt();
    }
}

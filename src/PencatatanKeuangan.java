import java.util.Scanner;

/**
 * Kelas PencatatanKeuangan digunakan untuk mencatat dan mengelola saldo keuangan.
 * Program ini memungkinkan pengguna untuk menambah, mengurangi, dan memeriksa saldo.
 */
public class PencatatanKeuangan {
    private double saldo;
    /**
     * Konstruktor untuk menginisialisasi saldo dengan nilai 0.
     */

    public PencatatanKeuangan() {
        this.saldo = 0;
    }
    /**
     * Metode utama untuk menjalankan program pencatatan keuangan.
     * Mengelola interaksi dengan pengguna dan menampilkan menu.
     *
     * @param args argumen command line
     */

    public static void main(String[] args) {
        PencatatanKeuangan pencatatanKeuangan = new PencatatanKeuangan();
        Scanner input = new Scanner(System.in);

        while (true) {
            pencatatanKeuangan.tampilkanMenu();
            int pilihan = input.nextInt();

            if (pilihan == 1) {
                pencatatanKeuangan.tambahSaldo(input);
            } else if (pilihan == 2) {
                pencatatanKeuangan.kurangSaldo(input);
            } else if (pilihan == 3) {
                pencatatanKeuangan.cekSaldo();
            } else if (pilihan == 4) {
                System.out.println("Terima kasih telah menggunakan program ini.");
                break;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }

        input.close();
    }
    /**
     * Menampilkan menu pilihan kepada pengguna.
     */

    private void tampilkanMenu() {
        System.out.println("Pilih menu:");
        System.out.println("1. Tambah Saldo");
        System.out.println("2. Kurang Saldo");
        System.out.println("3. Cek Saldo");
        System.out.println("4. Keluar");
    }
    /**
     * Menambah saldo dengan jumlah yang diberikan oleh pengguna.
     *
     * @param input Scanner untuk membaca input dari pengguna
     */

    private void tambahSaldo(Scanner input) {
        System.out.print("Masukkan jumlah saldo yang ingin ditambahkan: ");
        double jumlah = input.nextDouble();
        this.saldo += jumlah;
        System.out.println("Saldo berhasil ditambahkan.");
    }
    /**
     * Mengurangi saldo dengan jumlah yang diberikan oleh pengguna.
     * Jika jumlah yang ingin dikurangi melebihi saldo saat ini,
     * maka akan ditampilkan pesan bahwa saldo tidak cukup.
     *
     * @param input Scanner untuk membaca input dari pengguna
     */

    private void kurangSaldo(Scanner input) {
        System.out.print("Masukkan jumlah saldo yang ingin dikurangi: ");
        double jumlah = input.nextDouble();
        if (jumlah > this.saldo) {
            System.out.println("Saldo tidak cukup.");
        } else {
            this.saldo -= jumlah;
            System.out.println("Saldo berhasil dikurangi.");
        }
    }
    /**
     * Menampilkan saldo saat ini kepada pengguna.
     */

    private void cekSaldo() {
        System.out.println("Saldo saat ini: " + this.saldo);
    }
    /**
     * Mengambil nilai saldo saat ini.
     *
     * @return saldo saat ini
     */

    public double getSaldo() {
        return this.saldo;
    }
    /**
     * Mengatur nilai saldo dengan jumlah yang diberikan.
     *
     * @param saldo jumlah saldo yang ingin diatur
     */

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
public class hasil {

    public static void main(String[] args ){

        Menghitung object = new Menghitung();
        int penjumlahan1 = object.penjumlahan(200, 50);
        int penjumlahan2 = object.penjumlahan(300, 100, 400);
        double penjumlahan3= object.penjumlahan(10.9 , 20.3);

        System.out.println("Penjumlahan dengan 2 parameter=" +penjumlahan1);
        System.out.println("Penjumlahan dengan 3 parameter=" +penjumlahan2);
        System.out.println("Penjumlahan dengan 2 parameter beda tipe data=" +penjumlahan3);
    }
}

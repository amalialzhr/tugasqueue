import java.util.LinkedList;
import java.util.Queue;

public class materiqueue {
    public static void main(String[] args) {
        Queue<String> antrian = new LinkedList<String>();

        antrian.add("A01");
        antrian.add("A02");
        
        System.out.println("=================");
        System.out.println("Pukul : 17.00 WIB");
        System.out.println("ANTRIAN MOTOR TRAIL: "+ antrian);
        System.out.println("");

        //Perintah Enqueue --> menggunakan fungsi add
        antrian.add("A03");
        System.out.println("Pukul : 17.20 WIB");
        System.out.println("ANTRIAN MOTOR TRAIL: "+ antrian);
        System.out.println("");

        //Perintah Dequeue --> menggunakan fungsi poll
        System.out.println("====================================================");
        System.out.println("DIPANGGIL, pelanggan dengan Nomor Antrian : "+ antrian.poll());
        System.out.println("");

        //Perintah Pengecekan elemen teratas --> menggunakan fungsi peek
        System.out.println("Bersiap-siap Pelanggan dengan Nomor Antrian : "+ antrian.peek());
        System.out.println("====================================================");

        //Pengecekan ukuran Queue
        System.out.println("Jumlah Pelanggan : "+ antrian.size());
        System.out.println("");

        //Perintah Dequeue --> menggunakan fungsi poll
        System.out.println("====================================================");
        System.out.println("Selanjutnya, Pelanggan dengan Nomor Antrian : "+ antrian.poll());
        System.out.println("");

        //Perintah Pengecekan elemen teratas --> menggunakan fungsi peek
        System.out.println("Bersiap-siap Pelanggan dengan Nomor Antrian : "+ antrian.peek());
        System.out.println("ANTRIAN MOTOR TRAIL: "+ antrian);
        System.out.println("====================================================");
        System.out.println("");

        //pengecekan apakah antrian kosong --> menggunakan fungsi isEmpty()
        System.out.println("Apakah masih ada pelanggan yang tersisa?");
        if (antrian.isEmpty()) {
            System.out.println("Tidak ada Pelanggan yang tersisa");            
        } else {
            System.out.println("Tersisa "+ antrian.size()+" pelanggan lagi");
        }
        System.out.println("");

        //Perintah Dequeue --> menggunakan fungsi poll
        System.out.println("====================================================");
        System.out.println("Selanjutnya Pelanggan dengan Nomor Antrian : "+ antrian.poll());
        System.out.println("ANTRIAN MOTOR TRAIL:"+ antrian);
        System.out.println("====================================================");
        System.out.println("");

        //pengecekan apakah antrian kosong --> menggunakan fungsi isEmpty()
        System.out.println("Apakah masih ada pelanggan yang tersisa?");
        if (antrian.isEmpty()) {
            System.out.println("Tidak ada pelanggan yang tersisa");            
        } else {
            System.out.println("Tersisa "+ antrian.size()+" pelanggan lagi");
        }
    }
}
package if1.pkg10119032.latihan26.waktusaatini;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi program untuk menampilkan
 * waktu saat ini
 */
public class IF110119032Latihan26WaktuSaatIni {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat tanggal = new SimpleDateFormat("EEEE, d MMM yyyy");
        SimpleDateFormat jam = new SimpleDateFormat("HH:mm:ss");
        
        String getTanggal = tanggal.format(cal.getTime());
        String getJam = jam.format(cal.getTime());
        
        System.out.print("Hari ini adalah hari : ");
        System.out.println(getTanggal + " " + getJam);
    }
    
}

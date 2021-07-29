package tes_studi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class no_3 {
    public static void main(String[] args) {
        Date waktu = new Date();
        String setelah_konversi ="";
        SimpleDateFormat ft =
                new SimpleDateFormat ("hh:mm:ss a");

        System.out.println("waktu saat ini: " + ft.format(waktu));

        String m = ft.format(waktu).substring(9);

        int jam = Integer.parseInt(ft.format(waktu).substring(0,2));
        if (m.equals("PM")) {
            int time = 12;
            String konversi = String.valueOf(time + jam);
            String dikonversi = ft.format(waktu).substring(0,5);
            if (jam == 12){
                setelah_konversi = dikonversi.replace(String.valueOf(jam),String.valueOf(time));
            }else {
            setelah_konversi = dikonversi.replace(dikonversi.substring(0,2),konversi);

            }

            System.out.println(setelah_konversi);
        }else if(m.equals("AM")){
            int time = 0;
            String konversi = String.valueOf(time + jam);
            String dikonversi = ft.format(waktu).substring(0,5);
            if (jam == 12){
                setelah_konversi = dikonversi.replace(String.valueOf(jam),String.valueOf(time));
            }else {
                setelah_konversi = dikonversi.replace(dikonversi.substring(0,2),konversi);

            }

            System.out.println(setelah_konversi);
        }
    }
}



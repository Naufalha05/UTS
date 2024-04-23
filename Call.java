import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Call {

    public static void main(String[] args) {
        String file = "D:\\src\\Data.txt";
        List<Balok> c = new ArrayList<>();
        String coba;
        try {
            BufferedReader b = new BufferedReader(new FileReader(file));
            b.readLine();
            while ((coba = b.readLine()) != null) {
                String[] row = coba.split(",");
                Balok v = new Balok();
                v.panjang = Double.parseDouble(row[0]);
                v.lebar = Double.parseDouble(row[1]);
                v.tinggi = Double.parseDouble(row[2]);
                c.add(v);
            }

        } catch (IOException e) {
            System.err.println("File cannot is empty");
        }
        System.out.println(c.size());

        for (Balok n : c) {
            double Balok = n.volume();
            System.out.println("Volume balok adalah: " + Balok);
            }
         for (Balok m : c) {
             double Balok = m.luasPermukaan();
             System.out.println("Luas permukaan balok adalah: " + Balok);

             if (Balok > 20000) {
                 System.out.println("luas permukaan balok lebih dari 20000 cm^2");
             } else {
                 System.out.println(("luas permukaan balok kecil dari 20000 cm^2"));
             }

         }
    }
}

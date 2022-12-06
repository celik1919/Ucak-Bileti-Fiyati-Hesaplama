import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km, age, yon;
        double normalTutar, tutarYi, toplamTutar;
        Scanner mec = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        km = mec.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        age = mec.nextInt();


        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        yon = mec.nextInt();
        if (((yon == 1) || (yon == 2)) && (age > 0) && (km > 0)) {

            normalTutar = km * 0.10;

            if (age < 12) {
                tutarYi = normalTutar * 0.50;
            } else if ((age < 24) && (12 < age)) {
                tutarYi = normalTutar * 0.90;
            } else if (age > 65) {
                tutarYi = normalTutar * 0.70;
            } else {
                tutarYi = normalTutar;
            }
            if (yon == 1) {
                toplamTutar = tutarYi;
            } else {
                toplamTutar = (tutarYi * 0.8) * 2;
            }
            System.out.println("Toplam Tutar: " + toplamTutar);

        } else {
            System.out.print("Hatalı Veri Girdiniz !");
        }
    }
}

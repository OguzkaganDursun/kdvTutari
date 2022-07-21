import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Kullanicidan ucret girisi isteniyor ve girilen ucret bilgisi cekiliyor.
        double ucret, kdvliTutar , kdvOran = 0.18;
        Scanner scan = new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.print("Ucret Tutarini Giriniz : ");
        ucret = scan.nextDouble();

        // Girilen ucret kdv ile carpilarak kdv'li ucret olusturuluyor ve bilgiler kullaniciya veriliyor.
        double kdv;

        if (0 <= ucret && ucret <= 1000){
            kdv = ucret * kdvOran;
            kdvliTutar = ucret + kdv;
            System.out.println("-------------------------------------");
            System.out.println("KDV Orani : " + kdvOran);
            System.out.println("KDV Ucreti : " + kdv);
            System.out.println("KDV'li Tutar : " + kdvliTutar);
        }
        else if (ucret > 1000) {
            kdvOran = 0.08;
            kdv = ucret * kdvOran;
            kdvliTutar = ucret + kdv;
            System.out.println("-------------------------------------");
            System.out.println("KDV Orani : " + kdvOran);
            System.out.println("KDV Ucreti : " + kdv);
            System.out.println("KDV'li Tutar : " + kdvliTutar);
        }

        else System.out.println("-------------------------------------  \nLutfen Gecerli Bir Ucret Giriniz !");

    }
}

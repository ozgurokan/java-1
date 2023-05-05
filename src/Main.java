import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Değişken oluştur
        int mat,fizik,kimya,turkce,tarih,muzik;

        //scanner tanımladık
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notunuz : ");

        mat = input.nextInt();
        System.out.println(mat);

        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();
        System.out.println(fizik);

        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();
        System.out.println(kimya);

        System.out.print("Türkçe Notunuz : ");
        turkce = input.nextInt();
        System.out.println(turkce);

        System.out.print("Tarih Notunuz : ");
        tarih = input.nextInt();
        System.out.println(tarih);

        System.out.print("Müzik Notunuz : ");
        muzik = input.nextInt();
        System.out.println(muzik);

        int toplam = (mat +fizik+ kimya+ turkce + tarih + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız :" + sonuc);

        String gecmeKalma = (sonuc >= 50) ? "Geçtiniz" : "Geçemediniz" ;

        System.out.println("Sınıfı " + gecmeKalma);
    }
}
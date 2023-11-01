import java.util.Scanner;

public class Main {

    static int plus(int n1, int n2) {
        int result = n1 + n2;
        System.out.println("Toplam :" + result);
        return result;
    }

    static int minus(int n1, int n2) {
        int result = n1 - n2;
        System.out.println("Fark :" + result);
        return result;
    }

    static int times(int n1, int n2) {
        int result = n1 * n2;
        System.out.println("Çarpım :" + result);
        return result;
    }

    static int divided(int n1, int n2) {
        if (n2 == 0) {
            System.out.println("İkinci Sayıya Sıfırdan Farklı Değer Giriniz.");
        }
        int result = n1 / n2;
        return result;
    }

    static int power(int n1, int n2) {
        int result = 1;
        for (int i = 1; i <= n2; i++) {
            result *= n1;
        }
        return result;
    }

    static int mod(int n1, int n2) {
        return n1 % n2;
    }

    static void rectangle(int n1, int n2) {
        System.out.println("Çevresi :" + (2 * (n1 + n2)));
        System.out.println("Alanı :" + (n1 * n2));

    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme İşlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Mod Alma\n"
                + "7- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "8- Çıkış Yap";

        while (true) {
            System.out.println(menu);
            System.out.print("Bir işlem seçiniz :");
            select = inp.nextInt();

            if (select == 0) {
                break;
            }

            System.out.print("Birinci Sayıyı Giriniz :");
            int n1 = inp.nextInt();

            System.out.print("İkinci Sayıyı Giriniz :");
            int n2 = inp.nextInt();

            switch (select) {
                case 1:
                    plus(n1, n2);
                    break;

                case 2:
                    minus(n1, n2);
                    break;

                case 3:
                    times(n1, n2);
                    break;

                case 4:
                    divided(n1, n2);
                    break;

                case 5:
                    System.out.println("Üs Hesabı :" + power(n1, n2));
                    break;

                case 6:
                    System.out.println("Mod İşlemi :" + mod(n1, n2));
                    break;

                case 7:
                    rectangle(n1, n2);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem!");
            }
        }
        System.out.println("Güle Güle, Tekrar görüşmek üzere!");
    }
}
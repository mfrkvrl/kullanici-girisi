
import java.util.Scanner;
public class kullaniciGiris {
    public static void main(String[] args) {
        String Username = "", Password = "";
        boolean while_degeri = true;
        int islem;
        Scanner scanner = new Scanner(System.in);
        boolean giris_seferi = true;
        if (giris_seferi) {
            System.out.println("Kullanıcı adınızı ve şifrenizi belirleyin");
            System.out.println("Kullanıcı adı : ");
            Username = scanner.next();
            System.out.println("Şifre : ");
            Password = scanner.next();
            System.out.println("Kullanıcı kaydınız gerçekleştirildi!");
            giris_seferi = false;

        }
        while (while_degeri) {

            String kullaniciAdi, sifre;
            System.out.println("Yapmak istediğiniz işlemi seçiniz.");
            System.out.println("1 : Giriş yap\n2 : Şifremi unuttum : ");
            islem = scanner.nextInt();
            switch (islem) {
                case 1:
                    System.out.println("Kullanıcı adınızı giriniz : ");
                    kullaniciAdi = scanner.next();
                    if (Username.equals(kullaniciAdi)) {
                        System.out.println("Şifrenizi girin ");
                        sifre = scanner.next();
                        if (Password.equals(sifre)) {
                            System.out.println("Giriş yapıldı");
                            while_degeri = false;
                        } else {
                            System.out.println("Şifre hatalı!");
                        }

                    } else {
                        System.out.println("Kullanıcı adı bulunamadı ");
                    }
                    break;
                case 2:
                    boolean while_degeri2 = true;
                    while (while_degeri2) {
                        System.out.println("Kullanıcı adınızı giriniz : ");
                        kullaniciAdi = scanner.next();
                        if (Username.equals(kullaniciAdi)) {
                            System.out.println("Yeni şifrenizi giriniz : ");
                            String yeni_sifre = scanner.next();
                            if (yeni_sifre.equals(Password)) {
                                System.out.println("Eski şifrenizi kullanamazsınız!");
                            }
                            else {
                                Password = yeni_sifre;
                                System.out.println("Şifreniz başarıyla güncellendi!");
                                while_degeri2 = false;
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Geçerli bir değer giriniz!");
                    break;
            }
        }
    }

}


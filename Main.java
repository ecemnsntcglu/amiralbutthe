import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Play play = new Play();
        play.oyunaGiris();
        //Bilgisayar ve oyuncu hamlelerine başlıyor
        int hamleSayisi = 20;
        for (int i = 0; i <= hamleSayisi; i++) {
            AtışKontrolKullanıcı(Play.bilgisayarTahta);
            AtışKontrolBilgisayar(Play.kullanici1Tahta);
        }
    }

    //kullanıcının atışlarını kontrol eden fonksiyon
    public static void AtışKontrolKullanıcı(String[][] bilgisayarTahta) {
        Scanner input = new Scanner(System.in);
        System.out.println("Atış yapmak istediğiniz birimin satır koordinatlarını giriniz.");
        int hamleSatır = input.nextInt();
        System.out.println("Atış yapmak istediğiniz sütun koordinatlarını giriniz.");
        int hamleSütun = input.nextInt();
        if (Play.bilgisayarTahta[hamleSatır][hamleSütun] == "0 ") {
            System.out.println("İsabetsiz atış yaptınız!");
        } else if (Play.bilgisayarTahta[hamleSatır][hamleSütun] == "1 ") {
            System.out.println("Tebrikler,Başarılı atış!DENİZALTI BATIRILDI!");
            System.out.println("Hamle sırası tekrar sizin.");
            AtışKontrolKullanıcı(Play.bilgisayarTahta);
        } else if (Play.bilgisayarTahta[hamleSatır][hamleSütun] == "2 ") {
            System.out.println("Tebrikler,Başarılı atış!MAYIN GEMİSİ VURULDU");
            System.out.println("Hamle sırası tekrar sizin.");
            System.out.println("Atış yapmak istediğiniz birimin satır koordinatlarını giriniz.");
            int hamleSatırMG = input.nextInt();
            System.out.println("Atış yapmak istediğiniz sütun koordinatlarını giriniz.");
            int hamleSütunMG = input.nextInt();
            if (Play.bilgisayarTahta[hamleSatırMG][hamleSütunMG] == "2 " && ((hamleSatırMG == hamleSatır - 1) || (hamleSatırMG == hamleSatır + 1) || (hamleSütunMG == hamleSütun - 1) || (hamleSütunMG == hamleSütun + 1))) {
                System.out.println("Tebrikler,Başarılı atış!M>AYIN GEMİSİ BATIRILDI!");
                AtışKontrolKullanıcı(Play.bilgisayarTahta);
            }
        } else if (Play.bilgisayarTahta[hamleSatır][hamleSütun] == "3 ") {
            System.out.println("Tebrikler,Başarılı atış!KRUVAZÖR VURULDU");
            System.out.println("Hamle sırası tekrar sizin.");
            System.out.println("Atış yapmak istediğiniz birimin satır koordinatlarını giriniz.");
            int hamleSatırK = input.nextInt();
            System.out.println("Atış yapmak istediğiniz sütun koordinatlarını giriniz.");
            int hamleSütunK = input.nextInt();
            if (Play.bilgisayarTahta[hamleSatırK][hamleSütunK] == "3 " && ((hamleSatırK == hamleSatır - 1) || (hamleSatırK == hamleSatır + 1) || (hamleSütunK == hamleSütun - 1) || (hamleSütunK == hamleSütun + 1))) {
                System.out.println("Tebrikler.KRUVAZÖR TEKRAR VURULDU!BATIRMAYA ÇOK YAKINSIN!");
                System.out.println("Hamle sırası tekrar sizin.");
                System.out.println("Atış yapmak istediğiniz birimin satır koordinatlarını giriniz.");
                int hamleSatırK1 = input.nextInt();
                System.out.println("Atış yapmak istediğiniz sütun koordinatlarını giriniz.");
                int hamleSütunK1 = input.nextInt();
                if (Play.bilgisayarTahta[hamleSatırK1][hamleSütunK1] == "3 " && ((hamleSatırK1 == hamleSatırK - 1) || (hamleSatırK1 == hamleSatırK + 1) || (hamleSütunK1 == hamleSütunK - 1) || (hamleSütunK1 == hamleSütunK + 1))) {
                    System.out.println("Tebrikler.KRUVAZÖR BATIRILDI!");
                    System.out.println("Hmale sırası tekrar sizin.");
                    AtışKontrolKullanıcı(Play.bilgisayarTahta);
                }
            }
        } else if (Play.bilgisayarTahta[hamleSatır][hamleSütun] == "4 ") {
            System.out.println("Tebrikler,Başarılı atış!AMİRAL VURULDU");
            System.out.println("Hamle sırası tekrar sizin.");
            System.out.println("Atış yapmak istediğiniz birimin satır koordinatlarını giriniz.");
            int hamleSatırA = input.nextInt();
            System.out.println("Atış yapmak istediğiniz sütun koordinatlarını giriniz.");
            int hamleSütunA = input.nextInt();
            if (Play.bilgisayarTahta[hamleSatırA][hamleSütunA] == "4 " && ((hamleSatırA == hamleSatır - 1) || (hamleSatırA == hamleSatır + 1) || (hamleSütunA == hamleSütun - 1) || (hamleSütunA == hamleSütun + 1))) {
                System.out.println("Tebrikler.AMİRAL TEKRAR VURULDU!BATIRMAYA YAKINSIN!");
                System.out.println("Hamle sırası tekrar sizin.");
                System.out.println("Atış yapmak istediğiniz birimin satır koordinatlarını giriniz.");
                int hamleSatırA1 = input.nextInt();
                System.out.println("Atış yapmak istediğiniz sütun koordinatlarını giriniz.");
                int hamleSütunA1 = input.nextInt();
                if (Play.bilgisayarTahta[hamleSatırA1][hamleSütunA1] == "4 " && ((hamleSatırA1 == hamleSatırA - 1) || (hamleSatırA1 == hamleSatırA + 1) || (hamleSütunA1 == hamleSütunA - 1) || (hamleSütunA1 == hamleSütunA + 1))) {
                    System.out.println("Tebrikler.AMİRAL TEKRAR VURULDU!BATIRMAYA ÇOK YAKINSIN!");
                    System.out.println("Hamle sırası tekrar sizin.");
                    System.out.println("Atış yapmak istediğiniz birimin satır koordinatlarını giriniz.");
                    int hamleSatırA2 = input.nextInt();
                    System.out.println("Atış yapmak istediğiniz sütun koordinatlarını giriniz.");
                    int hamleSütunA2 = input.nextInt();
                    if (Play.bilgisayarTahta[hamleSatırA2][hamleSütunA2] == "4 " && ((hamleSatırA2 == hamleSatırA1 - 1) || (hamleSatırA2 == hamleSatırA1 + 1) || (hamleSütunA2 == hamleSütunA1 - 1) || (hamleSütunA2 == hamleSütunA1 + 1))) {
                        System.out.println("Tebrikler.AMİRAL BATIRILDI!");
                        System.out.println("Hamle sırası tekrar sizin.");
                        AtışKontrolKullanıcı(Play.bilgisayarTahta);
                    }
                }
            }
        }
    }

    //bilgisayarın atışlarını kontrol eden fonksiyon
    public static void AtışKontrolBilgisayar(String[][] kullanici1Tahta) {
        Random random = new Random();
        int hamleSatır = random.nextInt(0, Play.tahtaBuyuklugu);
        int hamlesütun = random.nextInt(0, Play.tahtaBuyuklugu);
        if (Play.kullanici1Tahta[hamleSatır][hamlesütun] == "0 ") {
            System.out.println("Bilgisayar isabetsiz atış yaptı.");
        } else if (Play.kullanici1Tahta[hamleSatır][hamlesütun] == "1 ") {
            System.out.println("Bilgisayar isabetli atış yaptı.DENİAZLTINIZ BATIRILDI!");
            AtışKontrolBilgisayar(Play.kullanici1Tahta);
        } else if (Play.kullanici1Tahta[hamleSatır][hamlesütun] == "2 ") {
            System.out.println("Bilgisayar isabetli atış yaptı.MAYIN GEMİNİZ VURULDU!");
            BilgisayarHamleAlgoritması(hamleSatır, hamlesütun, Play.kullanici1Tahta);
        } else if (Play.kullanici1Tahta[hamleSatır][hamlesütun] == "3 ") {
            System.out.println("Bilgisayar isabetli atış yaptı.KRUVAZÖR VURULDU!");
            BilgisayarHamleAlgoritması(hamleSatır, hamlesütun, Play.kullanici1Tahta);
        } else if (Play.kullanici1Tahta[hamleSatır][hamlesütun] == "4 ") {
            System.out.println("Bilgisayar isabetli atış yaptı.AMİRAL VURULDU!");
            BilgisayarHamleAlgoritması(hamleSatır, hamlesütun, Play.kullanici1Tahta);
        }
    }

    //başarılı atış sonrası,bilgisayara tekrar yapılacak atış sırasında algoritma kazandıran fonksiyon
    public static void BilgisayarHamleAlgoritması(int hamleSatır, int hamleSütun, String[][] kullanici1Tahta) {
        Random random = new Random();
        int hamleYonu = random.nextInt(1, 5);
        int vurulanBirim = 0;
        if (hamleYonu == 1) {
            while (Play.kullanici1Tahta[hamleSatır][hamleSütun] != "0 ") {
                hamleSütun++;
                vurulanBirim++;
            }
            BilgisayarHamleSonucu(hamleSatır, hamleSütun, Play.kullanici1Tahta, vurulanBirim);
        } else if (hamleYonu == 2) {
            while (Play.kullanici1Tahta[hamleSatır][hamleSütun] != "0 ") {
                hamleSatır--;
                vurulanBirim++;
            }
            BilgisayarHamleSonucu(hamleSatır, hamleSütun, Play.kullanici1Tahta, vurulanBirim);
        } else if (hamleYonu == 3) {
            while (Play.kullanici1Tahta[hamleSatır][hamleSütun] != "0 ") {
                hamleSütun--;
                vurulanBirim++;
            }
            BilgisayarHamleSonucu(hamleSatır, hamleSütun, Play.kullanici1Tahta, vurulanBirim);
        } else if (hamleYonu == 4) {
            while (Play.kullanici1Tahta[hamleSatır][hamleSütun] != "0 ") {
                hamleSatır++;
                vurulanBirim++;
            }
            BilgisayarHamleSonucu(hamleSatır, hamleSütun, Play.kullanici1Tahta, vurulanBirim);
        }
    }

    //Bilgisayardan random alınan yön sonrası bilgisayarın hamle sonucunu veren fonksiyon
    public static void BilgisayarHamleSonucu(int hamleSatır, int hamleSütun, String[][] kullanici1Tahta, int vurulanBirim) {
        if (vurulanBirim == 1) {
            System.out.println("Bilgisayarın 2. atışı başarısızlıkla sonuçlandı.");
        } else if (vurulanBirim == 2 && Play.kullanici1Tahta[hamleSatır][hamleSütun] == "2 ") {
            System.out.println("Bilgisayar isabetli atış yaptı.MAYIN GEMİNİZ BATIRILDI!");
            System.out.println("Hamle sırası tekrar bilgisayarın.");
            AtışKontrolBilgisayar(Play.kullanici1Tahta);
        } else if (vurulanBirim == 2 && Play.kullanici1Tahta[hamleSatır][hamleSütun] == "3 ") {
            System.out.println("Bilgisayar KRUVAZÖR'ÜN 2 birimini vurdu!");
            System.out.println("3. atış başarısızlıkla sonuçlandı.");
        } else if (vurulanBirim == 2 && Play.kullanici1Tahta[hamleSatır][hamleSütun] == "4 ") {
            System.out.println("Bilgisayar AMİRAL'İN 2 birimini vurdu!");
            System.out.println("3. atış başarısızlıkla sonuçlandı.");
        } else if (vurulanBirim == 3 && Play.kullanici1Tahta[hamleSatır][hamleSütun] == "3 ") {
            System.out.println("Bilgisayar 2 isabetli atış yaptı.KRUVAZÖR BATIRILDI!");
            System.out.println("Hamle sırası tekrar bilgisayarın.");
            AtışKontrolBilgisayar(Play.kullanici1Tahta);
        } else if (vurulanBirim == 3 && Play.kullanici1Tahta[hamleSatır][hamleSütun] == "4 ") {
            System.out.println("Bilgisayar AMİRAL'İN 3 birimini vurdu!");
            System.out.println("4. atış başarısızlıkla sonuçlandı.");
            BaşarısızBilgisayarHamle(hamleSatır, hamleSütun);
        } else if (vurulanBirim == 4 && Play.kullanici1Tahta[hamleSatır][hamleSütun] == "4 ") {
            System.out.println("Bilgisayar 3 isabetli atış yaptı.AMİRAL BATIRILDI!");
            System.out.println("Hamle sırası tekrar bilgisayarın.");
            AtışKontrolBilgisayar(Play.kullanici1Tahta);
        }
    }

}
    public static void BaşarısızBilgisayarHamle(int hamleSatır,int hamleSütun){
        AtışKontrolKullanıcı(Play.bilgisayarTahta);

    }
}

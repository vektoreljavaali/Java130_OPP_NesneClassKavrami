package com.vektorel;

import com.vektorel.entity.Kedi;

public class Runner {
    public static void main(String[] args) {

        // Değişken Tanımlama
        int sayi=5;
        int sayi2=56;
        int sayi3=8;
        // Değişken tanımlamak
        //Değişken tipi Değişkenin adı
        Kedi kedi;
        // Değer Atamak
        sayi = 5;
        // kedi değişkenine değer olarak bir nesne vermelisiniz.
        kedi = new Kedi(); // kalıptan nesne oluşturmak.
        Kedi kedi2 = new Kedi();
        Kedi kedi3 = new Kedi();
        // Nesneye ait özellikelere değer atama işlemi.
        kedi.ad="Maviş";
        kedi2.ad="Boncuk";
        kedi3.ad="Tekir";
        kedi.boyu = 45;
        kedi.yas=3;
        // Pekiiiiiii
        // Bir sınıfın içindeki değerlere direkt erişim
        // yapılabilir mi? yapılırsa/yapılamazsa neden???
        System.out.println("Kedi_1 Ad....: "+ kedi.ad);
        System.out.println("Kedi_1 Boy...: "+ kedi.boyu);
        System.out.println("Kedi_2 Ad....: "+kedi2.ad);
        System.out.println("Kedi_3 Ad....: "+kedi3.ad);
        System.out.println("KEdi1 uyku...: "+ kedi.uyaniklik);
        kedi.uyu();
        System.out.println("KEdi1 uyku...: "+ kedi.uyaniklik);
        kedi.uyandir();
        System.out.println("KEdi1 uyku...: "+ kedi.uyaniklik);


    }
}

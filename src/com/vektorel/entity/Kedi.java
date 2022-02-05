package com.vektorel.entity;

import java.util.Date;

public class Kedi {
    // 1- Değişkenler
    // 2- Methodlar
    // 3- InnerClass
    // sayısal, ifadesel
    // properties, fields
    // Bir varlık tanımı yapılırken varlığa ait;
    // ÖZellikler -> Değişkenler ile tanımlanır
    // Varlığın Aksiyonları-> Methodlar ile tanımlanır.
    public String tur;
    public String cins;
    public String renk;
    public int yas;
    public Date dogum;
    public int hiz;
    public String ad;
    /**
     * 1- Erkek
     * 2- Dişi
     */
    public int cinsiyet;
    public int boyu;
    public int canSayisi;
    public  boolean aclik;
    /**
     * true-> Uyanık
     * false-> uykuda
     */
    public boolean uyaniklik=true;

    public void uyu(){
        System.out.println("Kedi uyutuldu");
        uyaniklik=false;
    }
    public void uyandir(){
        System.out.println("Kedi uyandırıldı.");
        uyaniklik=true;
    }



}

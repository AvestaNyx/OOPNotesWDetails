package com.example.javaoopdetails;

public class Kopek implements Egitim {

    String isim;
    String gozRengi;
    String tuyRengi;

    public static String turIsmi = "canis";


    public Kopek() {

    }

    public Kopek(String isim, String gozRengi, String tuyRengi){
        this.isim = isim;
        this.gozRengi = gozRengi;
        this.tuyRengi = tuyRengi;
    }

    public static void konusKopekStatic() {
        System.out.println("Benim türüm: " + turIsmi);
    }

    public void konusKopek() {
        System.out.println("Benim ismim: " + this.isim + "Benim türüm: " + turIsmi);
    }

    @Override
    public boolean egitimAl() {
        System.out.println("Kopekler eğitim alır");
        return true;
    }
}

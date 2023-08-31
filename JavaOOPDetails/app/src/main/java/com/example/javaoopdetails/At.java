package com.example.javaoopdetails;

public class At extends Hayvan implements Egitim {

    public At() {


    }

    public At(String isim, String gozRengi, String tuyRengi) {
        super(isim, gozRengi, tuyRengi);
    }


    @Override
    public boolean egitimAl() {
        System.out.println("Atlar eğitim alır");
        return true;
    }

    @Override
    public boolean egitimAlBody() {
        System.out.println("Atlar eğitim de alır");
        return true;

    }
}

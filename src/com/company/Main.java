package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    }
}

class Gra {
    int iloscDomkow;
    int iloscHoteli;
    String komentarz;
    boolean aktywnyGracz;
    String listaGraczy;
    String listaKartStandardowych;
    String listaKartProtokoły;
    String listaKartBazy;
    String listaKartSzansa;
    String ListaKartKasaSpoleczna;

    public Gra(int iloscDomkow, int iloscHoteli, String komentarz, boolean aktywnyGracz,
               String listaGraczy, String listaKartStandardowych, String listaKartProtokoły,
               String listaKartBazy, String listaKartSzansa, String ListaKartKasaSpoleczna) {
        this.iloscDomkow = iloscDomkow;
        this.iloscHoteli = iloscHoteli;
        this.komentarz = komentarz;
        this.aktywnyGracz = aktywnyGracz;
        this.listaGraczy = listaGraczy;
        this.listaKartStandardowych = listaKartStandardowych;
        this.listaKartProtokoły = listaKartProtokoły;
        this.listaKartBazy = listaKartBazy;
        this.listaKartSzansa = listaKartSzansa;
        this.ListaKartKasaSpoleczna = ListaKartKasaSpoleczna;
    }

    public void Start() {
        System.out.println("Gracz 1 rzuca koścmi");

    }

    public void GameOver() {

        System.out.println("Wygrywa gracz ");

    }

    public void WypiszKomentarz() {
        System.out.println("Komentarz");

    }

}

class Gracz  {
    String imie;
    double kasa;
    String pionek;
    int miejscePostoju;


    public void PrzesunGracza() {


    }

    public void ZastawKarte() {
        Scanner wpisz = new Scanner(System.in);
        System.out.println("Podaj nazwe karty do zastawienia");
        String nameTheCard = wpisz.nextLine();
        System.out.println("Karte zastawiono, pieniądze na koncie");


    }

    public void WykupKarte() {
        Scanner wykup = new Scanner(System.in);
        System.out.println("Podaj nazwe karty, którą chcesz wykupić");
        String nameTheCard2 = wykup.nextLine();
        System.out.println("Karte wykupiono, pieniądze sciągnięte z konta");

    }

    public void Handluj() {
        Scanner handel = new Scanner(System.in);
        System.out.println("Z którym graczem chcesz handlować?");
        String handelOdp = handel.nextLine();
        System.out.println("Czy wybrany gracz akceptuje prośbe? (Y/N): ");



    }

    public void KupBudynki() {

    }

    public void SprzedajBudynki() {

    }

    public void KupKarte() {

    }

    public void SprzedajKarte() {

    }

    public void Zaplac() {

    }

    public void SprawdzCoMogeZrobic() {

    }

    public void Liytuj() {

    }


}

abstract class Karta {
    String nazwa;

}

class KartaNiespodzianka extends Karta {
    String komentarz;
    String RodzajKartyNiespodzianki;
    int ilosc1;
    int ilosc2;

}

abstract class KartaWartosciowa extends Karta {
    double wartoscDoZakupu;
    double wartoscZestawu;
    String wlasciciel;

    private void CzyZastawiona() {

    }

    private void ZastawKarte(boolean i) {

    }

}

class KartaProtokol extends KartaWartosciowa {
    double oplataZa1Karte;
    double oplataZa2Karty;
    double oplataZa3Karty;
    double oplataZa4Karty;
    Object logo;

}

class KartaBazaDanych extends KartaWartosciowa {
    String komentarz;
    int rodzajKartyNiespodzianki;
    int ilosc1;
    int ilosc2;

}

class KartaStandardowa extends KartaWartosciowa {
    double oplataBezZabudowań;
    double oplataZ1Domem;
    double oplataZ2Domami;
    double oplataZ3Domami;
    double oplataZ4Domami;
    double oplataHotelem;
    double cenaBudynku;
    String grupa;
    int iloscZabudowy;


}

class Plansza {
    public void RysujPlansze() {

    }

    public void PokazSzczegolowaKarte() {
        Scanner szczegol = new Scanner(System.in);
        System.out.println("Podaj nazwe karty");
        String szc = szczegol.nextLine();
        System.out.println("Karta: " + szc);

    }

    public void WypiszKomentarz() {
        Scanner komentarz = new Scanner(System.in);
        System.out.println("Wpisz komentarz");
        String kom = komentarz.nextLine();
        System.out.println("Komentarz: " + kom);

    }
}

class Pole {
    int numer;
    int lokalizajca;
    int ulozenie;
    Object logo;
    int rodzajPola;
}










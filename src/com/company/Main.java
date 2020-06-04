package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Gracz marcin = new Gracz("Marcin", 1000, "zielony", 0);
        Gracz michal = new Gracz("Michał", 4000, "niebieski", 3);
        Gracz ada = new Gracz("Ada", 2000, "biały", 12);
        Gracz ewa = new Gracz("Ewa", 3000, "czarny", 34);
        List<Gracz> gracze = new ArrayList<Gracz>();
        gracze.add(marcin);
        gracze.add(michal);
        gracze.add(ada);
        gracze.add(ewa);
        Gra nowagra = new Gra(64, 24, "przykladKomentarza1",
                true, gracze);
        nowagra.Start();

    }
}

class Gra {
    int iloscDomkow;
    int iloscHoteli;
    String komentarz;
    boolean aktywnyGracz;
    List<Gracz> listaGraczy;
    String listaKartStandardowych;
    String listaKartProtokoły;
    String listaKartBazy;
    String listaKartSzansa;
    String ListaKartKasaSpoleczna;


    public Gra(int iloscDomkow, int iloscHoteli, String komentarz, boolean aktywnyGracz,
               List<Gracz> listaGraczy) {
        this.iloscDomkow = iloscDomkow;
        this.iloscHoteli = iloscHoteli;
        this.komentarz = komentarz;
        this.aktywnyGracz = aktywnyGracz;
        this.listaGraczy = listaGraczy;

    }

    public void Start() {

        System.out.println("inicjacja graczy");
        for (Gracz gracz : listaGraczy) {
            System.out.println("Witaj w grze: " + gracz.imie + " twój pionek ma kolor " +
                    gracz.pionek + " Stan twojego konta to: " + gracz.kasa + " Zaczynasz na polu: " +
                    gracz.miejscePostoju);
        }
        System.out.println("inicjacja talii kart");
        List<KartaNiespodzianka> kartaNiespodziankaList;
        List<KartaStandardowa> kartaStandardowaList;
        List<KartaProtokol> kartaProtokolList;
        List<KartaBazaDanych> kartaBazaDanychList;
        System.out.println("inicjacja planszy");
        Plansza plansza;
        System.out.println("Start 1 rundy!!!");
        for (Gracz gracz : listaGraczy) {
            Random generator = new Random();
            int oczko = generator.nextInt(12) + 1;
            gracz.miejscePostoju += oczko;
            System.out.println("Rzuca gracz o imieniu: " + gracz.imie + " Wyrzucona ilość oczek to: " +
                    oczko + " Gracz przesuwa sie na pole: " + gracz.miejscePostoju);
        }


    }

    public void GameOver() {

        System.out.println("Wygrywa gracz ");

    }

    public void WypiszKomentarz() {
        System.out.println("Komentarz");

    }

}

class Gracz {
    String imie;
    double kasa;
    String pionek;
    int miejscePostoju;

    Gracz(String imie, double kasa, String pionek, int miejscePostoju) {
        this.imie = imie;
        this.kasa = kasa;
        this.pionek = pionek;
        this.miejscePostoju = miejscePostoju;
    }


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
    Pole pole;


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










package com.company;

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
    String getListaKartKasaSpoleczna;

    public void Start() {

    }

    public void GameOver() {

    }

    public void WypiszKomentarz() {

    }

}

class Gracz {
    String imie;
    double kasa;
    String pionek;
    int miejscePostoju;

    public void PrzesunGracza() {

    }

    public void ZastawKarte() {

    }

    public void WykupKarte() {

    }

    public void Handluj() {

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

abstract class Karta <Gra> {
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

    private void CzyZastawiona(){

    }
    private void ZastawKarte(boolean i){

    }

}

class KartaProtokol extends KartaWartosciowa {
    double oplataZa1Karte;
    double oplataZa2Karty;
    double oplataZa3Karty;
    double oplataZa4Karty;
    int logo;

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
class Plansza <Gra> {
    public void RysujPlansze(){

    }
    public void PokazSzczegolowaKarte() {

    }
    public void WypiszKomentarz() {

    }
}
class Pole <Plansza> {
    int numer;
    int lokalizajca;
    int ulozenie;
    int logo;
    int rodzajPola;
}










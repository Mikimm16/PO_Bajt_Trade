package pl.edu.mimuw.bajtTrade.zasoby;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Zasoby {
    private int jedzenie;
    private double diamenty;
    private ArrayList<Ubranie> ubrania;
    private ArrayList<Narzędzie> narzędzia;
    private int programyKomputerowe;

    public Zasoby() {
        jedzenie = 0;
        diamenty = 0;
        ubrania = new ArrayList<>();
        narzędzia = new ArrayList<>();
        programyKomputerowe = 0;
    }

    public Zasoby(int jedzenie, float diamenty, ArrayList<Ubranie> ubrania, ArrayList<Narzędzie> narzędzia, int programyKomputerowe) {
        this.jedzenie = jedzenie;
        this.diamenty = diamenty;
        this.ubrania = ubrania;
        this.narzędzia = narzędzia;
        this.programyKomputerowe = programyKomputerowe;
    }
    public boolean czyMa(Zasób.rodzaj rodzaj){return false; }//TODO
}

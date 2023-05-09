package pl.edu.mimuw.bajtTrade;

import pl.edu.mimuw.bajtTrade.giełda.TypGiełdy;
import pl.edu.mimuw.bajtTrade.robotnik.TypKariery;
import pl.edu.mimuw.bajtTrade.robotnik.strategiaKariery.StrategiaKarieryJson;
import pl.edu.mimuw.bajtTrade.robotnik.strategiaKupowania.StrategiaKupowaniaJson;
import pl.edu.mimuw.bajtTrade.robotnik.strategiaNauki.StrategiaNaukiJson;
import pl.edu.mimuw.bajtTrade.robotnik.strategiaProdukcji.StrategiaProdukcjiJson;
import pl.edu.mimuw.bajtTrade.spekulant.SpekulantKariera;
import pl.edu.mimuw.bajtTrade.zasoby.Zasób;

import java.util.List;
import java.util.Map;

public class JsonAdapter {

    public record InfoAdapter(
            Integer dzien,
            TypGiełdy gielda,
            Double kara_za_brak_ubran,
            Map<Zasób.rodzaj, Double> ceny_srednie,
            Map<Zasób.rodzaj, Double> ceny_max,
            Map<Zasób.rodzaj, Double> ceny_min
    ) {

    }

    public record KupowanieAdapter(
            StrategiaKupowaniaJson typ,
            Integer liczba_narzedzi
    ) {

    }

    public record UczenieAdapter(
            StrategiaNaukiJson typ,
            Integer zapas,
            Integer okres
    ) {

    }

    public record ProdukcjaAdapter(
            StrategiaProdukcjiJson typ
    ) {

    }

    public record SpekulantKarieraAdapter(
            SpekulantKariera kariera,
            Integer historia
    ) {

    }

    public record RobotnikAdapter(
            Integer id,
            Integer poziom,
            TypKariery kariera,
            KupowanieAdapter kupowanie,
            ProdukcjaAdapter produkcja,
            UczenieAdapter uczenie,
            StrategiaKarieryJson zmiana,
            Map<Zasób.rodzaj, Integer> produktywnosc,
            Map<Zasób.rodzaj, List<Integer>> zasoby
    ) {

    }

    public record SpekulantAdapter(
            Integer id,
            SpekulantKarieraAdapter kariera,
            Map<Zasób.rodzaj, List<Integer>> zasoby
    ) {

    }

    public record SymulacjaAdapter(
            
    ) {

    }
}

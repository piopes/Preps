package ProjectGit.PrepEx2;

public class Stonoga extends Zwierze implements DajacyGlos {
    public Stonoga(Integer wysokosc, Integer waga, Integer iloscLap) {
        super(wysokosc, waga, iloscLap);
    }

    @Override
    public String dajGlos() {
        return "tzz, tzz";
    }

    @Override
    public String przedstawSie() {
        return "cześć jestem stonogą";

    }
}

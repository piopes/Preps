package ProjectGit.PrepEx2;

public class Pies extends Zwierze implements DajacyGlos {

    public Pies(Integer wysokosc, Integer waga, Integer iloscLap) {
        super(wysokosc, waga, iloscLap);
    }

    @Override
    public String przedstawSie() {
        return "hej jestem psem";
    }

    @Override
    public String dajGlos() {
        return "hau hau";
    }

    @Override
    public Integer getIloscLap() {
        return super.getIloscLap();
    }

}

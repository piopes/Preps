package ProjectGit.PrepEx1;

public class Stonoga extends Zwierze {

    public Stonoga(Integer wysokosc, Integer waga, Integer iloscLap) {
        super(wysokosc, waga, iloscLap);
    }

    @Override
    public Integer getIloscLap() {
        return 100;
    }

    @Override
    public String dajGlos(String string) {
        return "tzz, tzz ;)";
    }

    @Override
    public String przedstawSie(String string) {
        return "cześć jesem stonogą";
    }

    public static Stonoga stonoga1 = new Stonoga(1, 2, 100);
    public static Stonoga stonoga2 = new Stonoga(1, 3, 102);
    public static Stonoga stonoga3 = new Stonoga(2, 4, 104);
}

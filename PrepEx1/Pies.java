package ProjectGit.PrepEx1;

public class Pies extends Zwierze {

    @Override
    public Integer getIloscLap() {
        return 4;
    }

    @Override
    public String dajGlos(String string) {
        return "hau, hau !!!";
    }

    public Pies(Integer wysokosc, Integer waga, Integer iloscLap) {
        super(wysokosc, waga, iloscLap);


    }

    @Override
    public String przedstawSie(String string) {
        return "hej jestem psem";
    }

    public static Pies pies1 = new Pies(20, 10, 4);
    public static Pies pies2 = new Pies(40, 55, 4);
    public static Pies pies3 = new Pies(80, 75, 4);


}

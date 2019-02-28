package ProjectGit.PrepEx2;

abstract class Zwierze implements DajacyGlos {

    private Integer wysokosc;
    private Integer waga;
    private Integer iloscLap;

    public Zwierze(Integer wysokosc, Integer waga, Integer iloscLap) {
        this.wysokosc = wysokosc;
        this.waga = waga;
        this.iloscLap = iloscLap;
    }

    public Integer getWysokosc() {
        return wysokosc;
    }

    public Integer getWaga() {
        return waga;
    }

    public Integer getIloscLap() {
        return iloscLap;
    }

    public String przedstawSie() {
        return "";
    }

    @Override
    public String dajGlos() {
        return null;
    }

    @Override
    public String toString() {
        return "Zwierze{" +
                "wysokosc=" + wysokosc +
                ", waga=" + waga +
                ", iloscLap=" + iloscLap +
                '}';
    }
}

package ProjectGit.PrepEx1;

abstract class Zwierze {

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

    public String przedstawSie(String string){
        return string;
    }
    public String dajGlos(String string){
        return string;
    }
}

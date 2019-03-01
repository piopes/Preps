package ProjectGit.PrepEx3;

public class Schody extends ElementDomu implements Wchodzalne {
    public Schody(Integer cena) {
        super(cena);
    }

    @Override
    public void wejdz() {
        System.out.println("jestem na górze");
    }

    @Override
    public void zejdz() {
        System.out.println("jestem na dole");
    }

}

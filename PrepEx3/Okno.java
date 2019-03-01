package ProjectGit.PrepEx3;

public class Okno extends ElementDomu implements Otwieralne {
    public Okno(Integer cena) {
        super(cena);
    }

    @Override
    public void otworz() {
        System.out.println("okno otwarte");
    }

    @Override
    public void zamknij() {
        System.out.println("okno zamknięte");
    }
}

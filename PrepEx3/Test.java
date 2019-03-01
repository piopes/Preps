package ProjectGit.PrepEx3;

public class Test {

    public static void main(String[] args) {

        ElementDomu okno1 = new Okno(900);
        ElementDomu okno2 = new Okno(550);
        ElementDomu okno3 = new Okno(1500);
        ElementDomu schody1 = new Schody(12000);
        ElementDomu schody2 = new Schody(24500);

        ElementDomu[] elementyDomu = {okno1, okno2, okno3, schody1, schody2};

        Integer suma = 0;
        for (ElementDomu x : elementyDomu) {
            suma = suma + x.getCena();
        }

        System.out.println("Całkowita cena elementów domu wynosi: "+ suma + " zł");
        ((Okno) okno1).zamknij();
        ((Schody) schody2).zejdz();

    }


}

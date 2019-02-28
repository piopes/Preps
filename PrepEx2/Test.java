package ProjectGit.PrepEx2;

public class Test {

    public static void main(String[] args) {

        Zwierze pies1 = new Pies(40, 25, 4);
        Zwierze pies2 = new Pies(45, 36, 4);
        Zwierze pies3 = new Pies(60, 71, 4);
        Zwierze stonoga1 = new Stonoga(1, 2, 106);
        Zwierze stonoga2 = new Stonoga(1, 3, 102);
        Zwierze stonoga3 = new Stonoga(2, 4, 104);

        Zwierze[] zwierzaki = {pies1, pies2, pies3, stonoga1, stonoga2, stonoga3};


        for (Zwierze zwierze : zwierzaki) {
            System.out.println( zwierze.przedstawSie() + ", " + zwierze.dajGlos() +
                    ", mam " + zwierze.getIloscLap() + " łapy" + ", ważę " + zwierze.getWaga() + " kg");


        }
    }
}

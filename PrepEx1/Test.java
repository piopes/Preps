package ProjectGit.PrepEx1;

public class Test  {
    public static void main(String[] args) {

        Zwierze[] zwierzaki = new Zwierze[6];

        zwierzaki[0] = Pies.pies1;
        zwierzaki[1] = Pies.pies2;
        zwierzaki[2] = Pies.pies3;
        zwierzaki[3] = Stonoga.stonoga1;
        zwierzaki[4] = Stonoga.stonoga2;
        zwierzaki[5] = Stonoga.stonoga3;



        for(int i =0; i <zwierzaki.length; i++){

            System.out.println(zwierzaki[i].przedstawSie("a")+" "+ zwierzaki[i].dajGlos("a") + ", mam "+ zwierzaki[i].getIloscLap()+" łapy" + ", ważę " + zwierzaki[i].getWaga()+ " kg");
        }




    }
}

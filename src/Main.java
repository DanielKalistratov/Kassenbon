public class Main {

    public static void main(String[] args) {

        double wurst = 0.99;
        double apfel = 2.49;
        double pizza = 1.99;

        int anzwurst = 3;
        int anzapfel = 2;
        int anzpizza = 4;
        double ergebnis;

        ergebnis = wurst * anzwurst;
        ergebnis = ergebnis + apfel * anzapfel;
        ergebnis = ergebnis + pizza * anzpizza;

        double geldbeutel = 50;
        double restgeld ;
        restgeld = geldbeutel -ergebnis;

        System.out.println("Es kostet " + ergebnis + "€");
        System.out.println("bezahlen . . . ");
        if (restgeld < 0) {
            System.out.println("Nicht genug Geld");
        }
        else{
            System.out.println("Das Restgeld ist " + restgeld + "€");
        }
    }
}

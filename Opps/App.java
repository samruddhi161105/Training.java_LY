package Opps;

public class App {
    public static void main(String[] args) {
        Maruti Baleno = new Maruti();

        Baleno.Model = 2026;
        Baleno.TopSpeed = 150.00;
        Baleno.color = "Pebble Blue";

        System.out.println(Baleno.Model + " " + Baleno.TopSpeed + " " + Baleno.color + " ");

        Baleno.StartEngine();

        Baleno.StopEngine();

        Baleno.drift();

        String variant = "vxi";
        Baleno.carVarient(variant);

        System.out.println(variant);

        // Maruti Brezza = new Maruti();

        // Brezza.color = "White";
        // Brezza.TopSpeed = 140.00;
        // Brezza.Model = 2025;

        // System.out.println(Brezza.Model + " " + Brezza.TopSpeed + " " + Brezza.color
        // + " ");

        // Brezza.StartEngine();
        // Brezza.StopEngine();
        // Brezza.drift();

        // Baleno.StartEngine();

        // Baleno.color = "blue";

        // System.out.println(Maruti.Cartyres);

        // Maruti.serverWater();

    }
}
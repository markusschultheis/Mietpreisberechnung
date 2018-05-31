public class TestMietpreis {

    public static void main (String[] args) {

        Mietpreisberechnung miete = new Mietpreisberechnung(1,10);
        miete.berechneMietpreis();
        System.out.println(miete.getMietpreis());

        Mietpreisberechnung miete2 = new Mietpreisberechnung(2,0);
        miete2.berechneMietpreis();
        System.out.println(miete2.getMietpreis());

        Mietpreisberechnung miete3 = new Mietpreisberechnung(4,200);
        miete3.berechneMietpreis();
        System.out.println(miete3.getMietpreis());

        Mietpreisberechnung miete4 = new Mietpreisberechnung(8,250);
        miete4.berechneMietpreis();
        System.out.println("4 Tage, 250 Kilometer: " + miete4.getMietpreis());

        Mietpreisberechnung miete5 = new Mietpreisberechnung(11,199);
        miete5.berechneMietpreis();
        System.out.println("11 Tage, 199 Kilometer: " + miete5.getMietpreis());

        Mietpreisberechnung miete6 = new Mietpreisberechnung(13,150);
        miete6.berechneMietpreis();
        System.out.println("13 Tage, 150 Kilometer: " + miete6.getMietpreis());

        Mietpreisberechnung miete7 = new Mietpreisberechnung(14,150);
        miete7.berechneMietpreis();
        System.out.println("14 Tage, 150 Kilometer: " + miete7.getMietpreis());

        Mietpreisberechnung miete8 = new Mietpreisberechnung(20,250);
        miete8.berechneMietpreis();
        System.out.println("20 Tage, 250 Kilometer: " + miete8.getMietpreis());


    }
}

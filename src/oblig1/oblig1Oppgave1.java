package oblig1;
class sirkel{
    //Lager static metode som beregner og returner sirkelens diameter.
    public static double diameter(double r){
        double diamter= r*2;
        return diamter;}

    //lager static metode som beregner og returner sirkelens omkrets
    public static double omkrets(double r){
        double omkrets=2*Math.PI*r;
        return omkrets;}

    //Lager static metode som beregner og returner sirkelens Areal
    public static double areal(double r){
        double areal=Math.PI*Math.pow(r,2);
        return areal;}



}



public class oblig1Oppgave1{
    public static void main(String[] args) {
        //Setter en variabel lik en verdi for radius
        double r=23.5;

        System.out.println("Areal av sirkel radius 23.5 er "+String.format("%.2f",sirkel.areal(r)));
        System.out.println("Omkrets av sirkel radius 23.5 er "+String.format("%.2f",sirkel.omkrets(r)));
        System.out.println("Diameter til sirkel radius 23.5 er "+String.format("%.2f",sirkel.diameter(r)));



    }

}

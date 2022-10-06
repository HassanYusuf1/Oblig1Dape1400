package oppgave2;

public class Vare {
    private String navn;
    private int antall;
    private double pris;

    public Vare (String navn,int antall, double pris){
        this.navn=navn;
        this.antall=antall;
        this.pris=pris;
    }

    public String GetNavn(){
        return navn;
    }
    public void setNavn(){
        this.navn=navn;
    }
    public int getAntall(){
        return antall;
    }
    public void setAntall(){
        if(antall>0){
            this.antall=antall;}
    }
    public double getPris(){

        return antall;
    }
    public void setPris(){
        if(pris>0){
            this.pris=pris;}
    }
    // // metode for å beregne totalpris (pris * antall)
    public double totalPris(double totalPris){
        totalPris=getPris()*getAntall();
        return totalPris;
    }


}

package oppgave2;

import static javax.swing.JOptionPane.showInputDialog;

public class Oppgave2 {

        public static void main(String[]args){
            //leser inn navn, antall og pris for vare
            String innVare=showInputDialog("skriv navn på varen her. ");
            String innAntall=showInputDialog("Skriv antall her. ");
            String innPris=showInputDialog("Skriv pris her. ");

            //Leser inn navn, antall og pris for vare 2
            String innVare2=showInputDialog("skriv navn på varen her. ");
            String innAntall2=showInputDialog("Skriv antall  her. ");
            String innPris2=showInputDialog("Skriv pris her. ");



            int antall; double pris; int antall2; double pris2;
            try{
                //vare1
                antall=Integer.parseInt(innAntall);
                pris=Integer.parseInt(innPris);
                //vare 2
                antall2=Integer.parseInt(innAntall2);
                pris2=Integer.parseInt(innPris2);
            }
            catch (Exception e){
                //vare1
                antall=0;
                pris=0;
                //vare2
                antall2=0;
                pris2=0;
                System.out.println("slutt");
            }

            Vare vare1=new Vare(innVare,antall,pris);
            Vare vare2=new Vare(innVare2,antall2,pris2);

            //skriver ut total pris for alle varer i System.out
            System.out.println("Totalpris er "+vare1.totalPris(antall)+
                    "\nTotalpris er "+vare2.totalPris(antall2));
        }
    }



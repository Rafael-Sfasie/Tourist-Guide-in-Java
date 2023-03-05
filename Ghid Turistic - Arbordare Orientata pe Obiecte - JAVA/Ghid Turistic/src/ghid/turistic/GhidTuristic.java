
package ghid.turistic;
import javax.swing.*;
import java.awt.*;

public class GhidTuristic {

    public static void main(String[] args) {
        String denumire,numeOras;
        denumire = JOptionPane.showInputDialog("Introduceti numele tarii=");
        final int NumarulDeOrase=2;
        final int NumarulDeTari=4;
        //Cehia
        switch(NumarulDeTari){
            numeOras=JOptionPane.showInputDialog("Introduceti numele orasului(Praga sau Litomysl):");
            Tara country1 = new Tara("Cehia",1234890);
            case 1:Castel castle1=new Castel("Castelul Karlstejn",234101,1348);
                       castle1.afisare();
                case 2:Biserica church1=new Biserica("Osuarul din Sedlec",145789,1400,"gotic");
                       church1.afisare();
                case 3:Statiune resort1=new Statiune("Băile Mariane",9876100,21);
                       resort1.afisare();
                while(numeOras.equals("Praga") || numeOras.equals("Litomysl")){
                    switch(NumarulDeOrase){
                        case 1: Oras city1=new Oras("Praga",900000,34);
                                city1.addAtraction("Casa care danseaza");
                                city1.addAtraction("Biserica Tyn");
                                city1.addAtraction("Ceasul Astronomic");
                                city1.addAtraction("Casteulul Regal");
                                city1.addAtraction("Centrul vechi");
                                String[] atractions=city1.getAtractions();
                                city1.afisare();
                                System.out.println("Numarul de atractii turistice: " + city1.getNrAtractii());
                                for(int i=0;i<city1.getNrAtractii();i++)
                                    System.out.println(atractions[i]);
                                System.out.println();
                
                        case 2:Oras city2=new Oras("Litomysl",789321,45);
                               city2.addAtraction("Castelul Litomysl");
                               city2.addAtraction("Gradinile manastirii");
                               city2.addAtraction("Portmoneum");
                               city2.addAtraction("Muzeul Regional");
                               city2.addAtraction("Alea Trabdafirilor");
                               String[] atractions2=city2.getAtractions();
                               city2.afisare();
                               System.out.println("Numarul de atractii turistice: " + city2.getNrAtractii());
                               for(int i=0;i<city2.getNrAtractii();i++)
                                  System.out.println(atractions2[i]);
                               System.out.println();
                    }
                }
                
            }
            numeOras=JOptionPane.showInputDialog("Introduceti numele orasului(Stockholm sau Goteborg):");
            Tara country2=new Tara("Suedia",10000000);
            switch(country2.getNrAtractii()){
                case 1:Castel castle2=new Castel("Palatul Sofiero",5000000,1865);
                       castle2.afisare();
                case 2:Biserica church2=new Biserica("Biserica Sfanta Ecaterina",300894,1695,"baroc");
                       church2.afisare();
                case 3:Statiune resort2=new Statiune("Vemdalez",709321,28);
                       resort2.afisare();
                while(numeOras.equals("Stockholm") || numeOras.equals("Goteburg")){
                    switch(NumarulDeOrase){
                        case 1:Oras city3=new Oras("Stockholm",5690211,4);
                               city3.addAtraction("Palatul Regal");
                               city3.addAtraction("Insula Djurgarden");
                               city3.addAtraction("Muzeul Vasa");
                               city3.addAtraction("Centrul veechi(Gamla Stan)");
                               city3.addAtraction("Muzeul Fotografiska");
                               String[] atractions3=city3.getAtractions();
                               city3.afisare();
                               System.out.println("Numarul de atractii turistice: " + city3.getNrAtractii());
                               for(int i=0;i<city3.getNrAtractii();i++)
                                   System.out.println(atractions3[i]);
                               System.out.println();
                        case 2:Oras city4=new Oras("Goteborg",7890345,14);
                               city4.addAtraction("Muzeul de Arta");
                               city4.addAtraction("Slottsskogen");
                               city4.addAtraction("Grădina botanică");
                               city4.addAtraction("Cartierul Haga");
                               city4.addAtraction("Universeum");
                               String[] atractions4=city4.getAtractions();
                               city4.afisare();
                               System.out.println("Numarul de atractii turistice: " + city4.getNrAtractii());
                               for(int i=0;i<city4.getNrAtractii();i++)
                                   System.out.println(atractions4[i]);
                               System.out.println();
                    }
                } 
            }
            numeOras=JOptionPane.showInputDialog("Introduceti numele orasului(Berlin,Koln,Stuttgard): ");
            Tara country3=new Tara("Germania",29000000);
            switch(country3.getNrAtractii()){
                case 1:Castel castle3=new Castel("Castelul Wartburg",6789311,1067);
                       castle3.afisare();
                case 2:Biserica church3=new Biserica("Marele Dom din Bamberg",4567890,1003,"gotic");
                       church3.afisare();
                case 3:Statiune resort3=new Statiune("Parcul National Padurea Neagra",6890213,4);
                       resort3.afisare();
                while(numeOras.equals("Berlin") || numeOras.equals("Koln") || numeOras.equals("Stuttgard")){
                    switch(NumarulDeOrase){
                        case 1:Oras city5=new Oras("Berlin",5678543,2);
                               city5.addAtraction("Arca Brandenburg");
                               city5.addAtraction("Palatul Parlamentului");
                               city5.addAtraction("Muzeul de Arta");
                               city5.addAtraction("Checkpoit Charlie");
                               city5.addAtraction("Coloana victoriei");
                               String[] atractions5=city5.getAtractions();
                               city5.afisare();
                               System.out.println("Numarul de atractii turistice: " + city5.getNrAtractii());
                               for(int i=0;i<city5.getNrAtractii();i++)
                                   System.out.println(atractions5[i]);
                               System.out.println();
                        case 2:
                    }
                }
            }
    }
}

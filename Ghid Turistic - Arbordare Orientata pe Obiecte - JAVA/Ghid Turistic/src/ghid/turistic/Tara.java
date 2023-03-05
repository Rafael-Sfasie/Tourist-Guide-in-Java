/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ghid.turistic;

/**
 *
 * @author Rafael Sfasie
 */
public class Tara {
    private String denumire;
    private String[] atractii_turistice = new String[200];
    private int nrAtractii,nrVizitatori;
    public Tara(String N,int vizitors){
        this.denumire=N;
        this.nrVizitatori=vizitors;
    }
    public String getDenumire(){
        return denumire;
    }
    public void setDenumire(String name){
        this.denumire=name;
    }
    public int getNrAtractii(){
        return nrAtractii;
    }
    public void setNrAtractii(int Nratractions){
        this.nrAtractii=Nratractions;
    }
    public int getVizitatori(){
        return nrVizitatori;
    }
    public void setVizitatori(int vizitors){
        this.nrVizitatori=vizitors;
    }
    public String[] getAtraction(){
        return atractii_turistice;
    }
    public void addAtraction(String atractie){
        atractii_turistice[nrAtractii]=atractie;
        nrAtractii++;
    }
    public void afisare(){
        System.out.println("Numele tarii: " + this.denumire);
        System.out.println("NUmarul de vizitatori: " + this.nrVizitatori);
    }
        
}

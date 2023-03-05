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

public class Castel extends Tara{
    private int anul_constructiei;
    public Castel(String N,int vizitors,int year){
        super(N,vizitors);
        this.anul_constructiei=year;
    }
    public int getYear(){
        return anul_constructiei;
    }
    public void setYear(int year){
        this.anul_constructiei=year;
    }
    public void afisare(){
        System.out.println("Denumire:" + this.getDenumire());
        System.out.println("NrVizitatori: " + this.getVizitatori());
        System.out.println("Anul constructiei: " + this.anul_constructiei);
    }
    
}

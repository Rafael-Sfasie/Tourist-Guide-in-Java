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

public class Oras extends Tara{
    private int locul_in_top;
    public Oras(String N,int vizitors,int clasament){
        super(N,vizitors);
        this.locul_in_top=clasament;
    }
    public int getClasament(){
        return locul_in_top;
    }
    public void setClasament(int clasament){
        this.locul_in_top=clasament;
    }
    @Override
    public void afisare(){
        super.afisare();
        System.out.println("Locul in clasament: " + this.locul_in_top);
    }

    String[] getAtractions() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

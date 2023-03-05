
package ghid.turistic;

public class Biserica extends Castel{
    private String stil_arhitectural;
    public Biserica(String N,int vizitors,int year,String style){
        super(N,vizitors,year);
        this.stil_arhitectural=style;
    }
    public String getStyle(){
        return stil_arhitectural;
    }
    public void setStyle(String style){
        this.stil_arhitectural=style;
    }
    @Override
    public void afisare(){
        super.afisare();
        System.out.println("Stilul arihetcural: " + this.stil_arhitectural);
    }
}

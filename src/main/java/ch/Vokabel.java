package ch;
enum Kategorie { VERB, ADJEKTIV, NOMEN } 

public class Vokabel {
    private String deutsch; 
    private String spanisch; 
    private Kategorie kategorie;


    public Vokabel(String deu, String span, int kat){
        this.deutsch = deu;
        this.spanisch = span; 
        this.kategorie = zuordnung(kat);
    }

    public void setDeutsch(String neudeu){
        this.deutsch = neudeu;
    }
    public void setSpanisch(String neuspa){
        this.spanisch = neuspa; 
    }
    public void setKategorie(Kategorie neukat){
        this.kategorie = neukat; 
    }

    public String getDeutsch(){
        return this.deutsch;
    }
    public String getSpanisch(){
        return this.spanisch;
    }
    public Kategorie getKategorie(){
        return this.kategorie;
    }


    private Kategorie zuordnung(int kat){
        switch (kat) {
            case 1:
                return Kategorie.VERB; 
            case 2: 
                return Kategorie.ADJEKTIV;
            default:
                return Kategorie.NOMEN;
        }
    }

    public String toString(){
        return deutsch +" - " + spanisch + " - " + kategorie; 
    }
    
}

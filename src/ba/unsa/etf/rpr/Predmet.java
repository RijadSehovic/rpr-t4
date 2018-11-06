package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Predmet {
    private String imePredmeta;
    private Integer brojECTS;
    private ArrayList<Student> studenti;
    private Boolean obavezan=true;


    public Predmet(String imePredmeta, Integer brojECTS) {
        this.imePredmeta = imePredmeta;
        this.brojECTS = brojECTS;
    }


    public String getImePredmeta() {
        return imePredmeta;
    }
    public Integer dodajStudenta(Student student){
        return 0;
    }
    public void izbaciStudenta(Integer redniBroj){    }

    public void setObavezan(Boolean obavezan) {
        this.obavezan = obavezan;
    }

    public Integer getBrojECTS() {
        return brojECTS;
    }
    public Integer vratiBrojStudenata(){return 0;}
    public Student vratiStudenta(Integer redniBroj){return studenti.get(redniBroj);}



}

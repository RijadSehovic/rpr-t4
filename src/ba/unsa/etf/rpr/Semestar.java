package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Semestar {
    private Integer godinaStudija = 1;
    private Parnost parnost = Parnost.Neparan;
    private ArrayList<Student> studenti;
    private ArrayList<Predmet> obavezniPredmeti;
    private ArrayList<Predmet> izborniPredmeti;


    public Semestar(ArrayList<Predmet> obavezniPredmeti, ArrayList<Predmet> izborniPredmeti) {
        this.obavezniPredmeti = obavezniPredmeti;
        this.izborniPredmeti = izborniPredmeti;
    }

    public Semestar(Integer godinaStudija, Parnost parnost, ArrayList<Predmet> obavezniPredmeti, ArrayList<Predmet> izborniPredmeti) {
        this.godinaStudija = godinaStudija;
        this.parnost = parnost;
        this.obavezniPredmeti = obavezniPredmeti;
        this.izborniPredmeti = izborniPredmeti;
    }
    private Integer dodajStudenta(Student student){return 0;}
    private void izbaciStudenta(Integer redniBroj){}
    private Integer dodajIzborniPredmet(Predmet predmet){return 0;}
    private Integer dodajObavezniPredmet(Predmet predmet){return 0;}
    private void izbaciIzborniPredmet(Integer redniBroj){}

    private void izbaciObavezniPredmet(Integer redniBroj){}
    private Integer vratiBrojPredmeta(){return 0;}

    private Integer vratiBrojStudenata(){return 0;}
}
package ba.unsa.etf.rpr;

public class Student {
    private String ime;
    private String prezime;
    private Integer brojIndeksa;
    private Semestar planStudija;

    public Student(String ime, String prezime, Integer brojIndeksa, Semestar planStudija) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
        this.planStudija = planStudija;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public Integer getBrojIndeksa() {
        return brojIndeksa;
    }

    public void izaberiIzborne(){};

}

package ba.unsa.etf.rpr;

import java.util.List;
import java.util.Set;

public class Fakultet {
    private List<Student> studenti;
    private List<Predmet> predmeti;
    private Set<Upis> upisani;


    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }

    public void setPredmeti(List<Predmet> predmeti) {
        this.predmeti = predmeti;
    }

    public void upisi(Upis upis) {
        this.upisani.add(upis);
    }
}

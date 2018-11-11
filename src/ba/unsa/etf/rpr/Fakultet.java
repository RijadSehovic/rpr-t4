package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Fakultet {
    private List<Student> studenti= new ArrayList<>(8);
    private List<Predmet> predmeti= new ArrayList<>(8);
    private Set<Upis> upisani=new HashSet<>(8);


    public void dodajStudenta(Student student) {
        this.studenti.add(student);
    }

    public void dodajPredmet(Predmet predmet) {
        this.predmeti.add(predmet);
    }

    public void upisi(Upis upis) {
        this.upisani.add(upis);
    }

    public Set<Upis> getUpisani() {
        return upisani;
    }
}

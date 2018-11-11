package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Fakultet f = new Fakultet();
        List<Student> listaStudenata= new ArrayList<Student>(1);
        Student s=new Student("Rijad", "Sehovic", 17887);
        listaStudenata.add(s);
        Predmet p = new Predmet("Razvoj programskih rjesenja", 5);
        f.dodajPredmet(p);
        f.dodajStudenta(s);
        PlanStudija plan = new PlanStudija();
        plan.setNazivPlanaStudija("Bolonja");
        plan.dodajPredmetuSemestar(5, p);
        Upis upis1 = new Upis(plan, s, p);
        f.upisi(upis1);
        System.out.print("Studenti koji slusaju RPR: ");
        for(Upis x:f.getUpisani()){
            if(x.getPredmet().equals(p)){
                System.out.print(x.getStudent().getIme());
            }
        }
    }
}

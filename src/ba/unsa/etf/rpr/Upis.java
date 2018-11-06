package ba.unsa.etf.rpr;

public class Upis {
    private PlanStudija planStudija;
    private Student student;
    private Predmet predmet;


    public Upis(PlanStudija planStudija, Student student, Predmet predmet) {
        this.planStudija = planStudija;
        this.student = student;
        this.predmet = predmet;
    }

    public PlanStudija getPlanStudija() {
        return planStudija;
    }

    public Student getStudent() {
        return student;
    }

    public Predmet getPredmet() {
        return predmet;
    }

    public void setPlanStudija(PlanStudija planStudija) {
        this.planStudija = planStudija;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setPredmet(Predmet predmet) {
        this.predmet = predmet;
    }
}

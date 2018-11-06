package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlanStudija {
    private Map<Integer, List<Predmet>> predmetiUSemestru = new HashMap<>();

    private void dodajPredmetuSemestar(Integer brojSemestra, Predmet predmet){

        List<Predmet> predmets = this.predmetiUSemestru.get(brojSemestra);
        if(predmets ==null)
            predmetiUSemestru.put(brojSemestra,new ArrayList<>());

        this.predmetiUSemestru.get(brojSemestra).add(predmet);

    }

}

package ba.unsa.etf.rpr;


public class Predmet {
    private String imePredmeta;
    private Integer brojECTS;
    private Boolean obavezan=true;


    public Predmet(String imePredmeta, Integer brojECTS) {
        this.imePredmeta = imePredmeta;
        this.brojECTS = brojECTS;
    }


    public String getImePredmeta() {
        return imePredmeta;
    }

    public void setObavezan(Boolean obavezan) {
        this.obavezan = obavezan;
    }

    public Integer getBrojECTS() {
        return brojECTS;
    }


    public void setImePredmeta(String imePredmeta) {
        this.imePredmeta = imePredmeta;
    }

    public void setBrojECTS(Integer brojECTS) {
        this.brojECTS = brojECTS;
    }

    public Boolean getObavezan() {
        return obavezan;
    }
}

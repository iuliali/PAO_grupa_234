package model;

import java.util.ArrayList;
import java.util.List;

public class FisaMedicala {

    private List<Vaccin> vaccinuri;
    private String numeMedic;


    public List<Vaccin> getVaccinuri() {
        return vaccinuri;
    }

    public void setVaccinuri(List<Vaccin> vaccinuri) {
        this.vaccinuri = vaccinuri;
    }

    public String getNumeMedic() {
        return numeMedic;
    }

    public void setNumeMedic(String numeMedic) {
        this.numeMedic = numeMedic;
    }

    public void addVaccin(Vaccin vaccin){
        if (vaccinuri == null || vaccinuri.isEmpty()) {
            this.vaccinuri = new ArrayList<>();
        }
        this.vaccinuri.add(vaccin);
    }

    @Override
    public String toString() {
        return "FisaMedicala{" +
                "vaccinuri=" + vaccinuri +
                ", numeMedic='" + numeMedic + '\'' +
                '}';
    }
}
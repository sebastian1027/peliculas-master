package movil.unicauca.peliculas.models;

import android.view.LayoutInflater;

import java.util.List;

import movil.unicauca.peliculas.adapters.EstrenoAdapter;

/**
 * Created by Sebastianl on 03/05/2017.
 */

public class ProximosEstrenos extends EstrenoAdapter {

    String namepe, dateofpremier, durationpe, gender, gender1, gender2, imagepe;

    public ProximosEstrenos(LayoutInflater layoutInflater, List<ProximosEstrenos> data) {
        super(layoutInflater, data);
    }

    /*public ProximosEstrenos(LayoutInflater inflater, List<Estrenos> data, OnEstrenoSelected onEstrenoSelected) {
        super(inflater, data, onEstrenoSelected);
    }*/


    public String getNamepe() {
        return namepe;
    }

    public void setNamepe(String namepe) {
        this.namepe = namepe;
    }

    public String getDateofpremier() {
        return dateofpremier;
    }

    public void setDateofpremier(String dateofpremier) {
        this.dateofpremier = dateofpremier;
    }

    public String getDurationpe() {
        return durationpe;
    }

    public void setDurationpe(String durationpe) {
        this.durationpe = durationpe;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender1() {
        return gender1;
    }

    public void setGender1(String gender1) {
        this.gender1 = gender1;
    }

    public String getGender2() {
        return gender2;
    }

    public void setGender2(String gender2) {
        this.gender2 = gender2;
    }

    public String getImagepe() {
        return imagepe;
    }

    public void setImagepe(String imagepe) {
        this.imagepe = imagepe;
    }
}

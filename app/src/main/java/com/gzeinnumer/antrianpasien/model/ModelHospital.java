package com.gzeinnumer.antrianpasien.model;

public class ModelHospital {
    private String idRs, namaRs;

    public ModelHospital(String idRs, String namaRs) {
        this.idRs = idRs;
        this.namaRs = namaRs;
    }

    public String getIdRs() {
        return idRs;
    }

    public void setIdRs(String idRs) {
        this.idRs = idRs;
    }

    public String getNamaRs() {
        return namaRs;
    }

    public void setNamaRs(String namaRs) {
        this.namaRs = namaRs;
    }
}

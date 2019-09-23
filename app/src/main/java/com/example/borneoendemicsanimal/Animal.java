package com.example.borneoendemicsanimal;

public class Animal {
    private String name, detail, nameLatin, filum, kelas, ordo, famili, genus;
    private int photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getNameLatin() {
        return nameLatin;
    }

    public String getFilum() {
        return filum;
    }

    public void setFilum(String filum) {
        this.filum = filum;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getOrdo() {
        return ordo;
    }

    public void setOrdo(String ordo) {
        this.ordo = ordo;
    }

    public String getFamili() {
        return famili;
    }

    public void setFamili(String famili) {
        this.famili = famili;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public void setNameLatin(String nameLatin) {
        this.nameLatin = nameLatin;
    }
}

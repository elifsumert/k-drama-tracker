package com.example.dizitakip;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Dizi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String diziAdi;
    private String tur;
    private int toplamBolum;
    private int izlenenBolum;
    private String durum;
    private int puan;
    
    // Fotoğrafların veritabanına kaydedilmesini sağlayacak yeni alan
    private String afisUrl; 

    // Boş Constructor (Spring Boot için gereklidir)
    public Dizi() {
    }

    // Getter ve Setter Metodları
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDiziAdi() {
        return diziAdi;
    }

    public void setDiziAdi(String diziAdi) {
        this.diziAdi = diziAdi;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public int getToplamBolum() {
        return toplamBolum;
    }

    public void setToplamBolum(int toplamBolum) {
        this.toplamBolum = toplamBolum;
    }

    public int getIzlenenBolum() {
        return izlenenBolum;
    }

    public void setIzlenenBolum(int izlenenBolum) {
        this.izlenenBolum = izlenenBolum;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    public int getPuan() {
        return puan;
    }

    public void setPuan(int puan) {
        this.puan = puan;
    }

    public String getAfisUrl() {
        return afisUrl;
    }

    public void setAfisUrl(String afisUrl) {
        this.afisUrl = afisUrl;
    }
}
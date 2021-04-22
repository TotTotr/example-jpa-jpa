package subd.model;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Zakazchik extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer zakazchikid;
    private String fioZakazchik;

    @ManyToOne
    private Zakaz zakaz;

    public Zakazchik(Integer zakazchikid, String fioZakazchik){
        this.zakazchikid = zakazchikid;
        this.fioZakazchik = fioZakazchik;
    }

    @Override
    public String toString() {

        return fioZakazchik+ ", ";
    }

    public Integer getZakazchikid(){

        return zakazchikid;
    }

    public void setZakazchikid(Integer zakazchikid){

        this.fioZakazchik = fioZakazchik;
    }

    public String getFioZakazchik(){

        return fioZakazchik;
    }

    public void setFioZakazchik(String fioZakazchik){

        this.fioZakazchik = fioZakazchik;
    }

    public Zakaz getZakaz() {

        return zakaz;
    }

    public void setZakaz(Zakaz zakaz) {
        this.zakaz = zakaz;
    }
}



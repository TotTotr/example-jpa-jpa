package subd.model;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Raboch extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer rabochid;
    private String fioRab;
    private Integer oplataZaKvM;

    @ManyToOne
    private Zakaz zakaz;

    public Raboch(Integer rabochid, String fioRab, Integer oplataZaKvM){
        this.rabochid = rabochid;
        this.fioRab = fioRab;
        this.oplataZaKvM = oplataZaKvM;
    }

    @Override
    public String toString() {
        return fioRab + ", "+ oplataZaKvM+ ", ";
    }

    public Integer getRabochid() {
        return rabochid;
    }

    public void setRabochid(Integer rabochid) {
        this.rabochid = rabochid;
    }

    public String getFioRab(){
        return fioRab;
    }
    public Integer getOplataZaKvM(){

        return  oplataZaKvM;
    }

    public void setFioRab(String fioRab){

        this.fioRab = fioRab;
    }
    public void setOplataZaKvM(Integer oplataZaKvM){

        this.oplataZaKvM = oplataZaKvM;
    }

    public Zakaz getZakaz() {

        return zakaz;
    }

    public void setZakaz(Zakaz zakaz) {

        this.zakaz = zakaz;
    }
}


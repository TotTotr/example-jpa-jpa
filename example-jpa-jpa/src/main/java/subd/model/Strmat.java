package subd.model;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Strmat extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer strmatid;
    private String strmatName;
    private Integer kol;

    @ManyToOne
    private Zakaz zakaz;

    public Strmat(Integer strmatid, String strmatName, Integer kol){
        this.strmatid = strmatid;
        this.strmatName = strmatName;
        this.kol= kol;
    }

    @Override
    public String toString() {

        return strmatName + ", "+ kol+ ", ";
    }

    public Integer getStrmatid() {
        return strmatid;
    }

    public void setStrmatid(Integer strmatidid) {
        this.strmatid = strmatid;
    }

    public String getStrmatName(){

        return strmatName;
    }
    public Integer getKol(){

        return  kol;
    }

    public void setStrmatName(String strmatName){

        this.strmatName = strmatName;
    }

    public void setKol(Integer kol){
        this.kol = kol;
    }

    public Zakaz getZakaz() {

        return zakaz;
    }

    public void setZakaz(Zakaz zakaz) {

        this.zakaz = zakaz;
    }
}


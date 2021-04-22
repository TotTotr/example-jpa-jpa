package subd.model;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;



@Entity
public class Jilpom extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer jilpomid;

    private Integer plPola;
    private Integer plSten;
    private Integer plPot;

    @ManyToOne
    private Zakaz zakaz;


    public Jilpom(Integer jilpomid, Integer plPola, Integer plSten, Integer plPot){
        this.jilpomid = jilpomid;
        this.plPola = plPola;
        this.plSten = plSten;
        this.plPot = plPot;
    }

    @Override
    public String toString() {
        return plPola + ", "+ plSten + ", "+ plPot+ ", ";
    }

    public Integer getJilpomid() {
        return jilpomid;
    }

    public void setJilpomid(Integer jilpomid) {
        this.jilpomid = jilpomid;
    }

    public Integer getPlPola(){

        return plPola;
    }
    public Integer getPlSten(){

        return  plSten;
    }
    public Integer getPlPot(){

        return  plPot;
    }

    public void setPlPola(Integer plPola){

        this.plPola = plPola;
    }
    public void setPlSten(Integer plSten){

        this.plSten = plSten;
    }
    public void setPlPot(Integer plPot) {
        this.plPot = plPot;
    }

    public Zakaz getZakaz() {

        return zakaz;
    }

    public void setZakaz(Zakaz zakaz) {
        this.zakaz = zakaz;
    }
}


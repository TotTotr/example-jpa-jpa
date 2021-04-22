package subd.model;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class VidRabot extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer vidRabotid;
    private String naimen;

    @ManyToOne
    private Zakaz zakaz;

    public VidRabot(Integer vidRabotid, String naimen){
        this.vidRabotid = vidRabotid;
        this.naimen= naimen;
    }

    @Override
    public String toString() {
        return naimen+ ", ";
    }

    public Integer getVidRabotid(){

        return  vidRabotid;
    }

    public void setVidRabotid(Integer vidRabotid){
        this.vidRabotid = vidRabotid;
    }

    public String getNaimen(){
        return  naimen;
    }

    public void setNaimen(String naimen){
        this.naimen = naimen;
    }

    public Zakaz getZakaz() {

        return zakaz;
    }

    public void setZakaz(Zakaz zakaz) {

        this.zakaz = zakaz;
    }
}


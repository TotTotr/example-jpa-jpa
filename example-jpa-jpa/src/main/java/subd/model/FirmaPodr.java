package subd.model;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class FirmaPodr extends BaseEntity{
    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer firmaPodrid;
    private String nazvanieFirm;
    private Integer stoimostUsl;

    @ManyToOne
    private Zakaz zakaz;

    public FirmaPodr(Integer firmaPodrid, String nazvanieFirm, Integer stoimostUsl){
        this.firmaPodrid = firmaPodrid;
        this.nazvanieFirm = nazvanieFirm;
        this.stoimostUsl = stoimostUsl;
    }

    @Override
    public String toString() {
        return nazvanieFirm + ", "+ stoimostUsl+ ", ";
    }

    public Integer getFirmaPodrid() {
        return firmaPodrid;
    }

    public void setFirmaPodrid(Integer firmaPodrid) {
        this.firmaPodrid = firmaPodrid;
    }

    public String getNazvanieFirm(){

        return nazvanieFirm;
    }

    public Integer getStoimostUsl(){

        return  stoimostUsl;
    }

    public void setNazvanieFirm(String nazvanieFirm){
        this.nazvanieFirm = nazvanieFirm;
    }

    public void setStoimostUsl(String StoimostUsl){
        this.stoimostUsl=stoimostUsl;
    }

    public Zakaz getZakaz() {

        return zakaz;
    }

    public void setZakaz(Zakaz zakaz) {
        this.zakaz = zakaz;
    }
}


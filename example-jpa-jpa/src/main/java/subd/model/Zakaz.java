package subd.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Zakaz extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer zakazid;
    private Integer firmaPodrid;
    private Integer jilpomid;
    private Integer rabochid;
    private Integer strmatid;
    private Integer zakazchikid;
    private Integer nomerDogovora;

    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private Date nach;

    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private Date con;

    @OneToMany
    private FirmaPodr firmaPodr;

    @OneToMany
    private Jilpom jilpom;

    @OneToMany
    private  Raboch raboch;

    @OneToMany
    private Strmat strmat;

    @OneToMany
    private Zakazchik zakazchik;

    public Zakaz(Integer zakazid, Integer nomerDogovora, Date nach, Date con, Integer firmaPodrid, Integer jilpomid,
                 Integer rabochid, Integer strmatid, Integer zakazchikid){
        this.zakazid=zakazid;
        this.nomerDogovora=nomerDogovora;
        this.nach=nach;
        this.con=con;
        this.firmaPodrid=firmaPodrid;
        this.jilpomid=jilpomid;
        this.rabochid= rabochid;
        this.strmatid=strmatid;
        this.zakazchikid=zakazchikid;
    }
    @Override
    public String toString() {

        return nomerDogovora +", " + nach+ ", ";
    }


    public Integer getZakazidid(){

        return zakazid;
    }

    public void setZakazid(Integer zakazid){
        this.zakazid = zakazid;
    }


    public Integer getNomerDogovora(){
        return nomerDogovora;
    }
    public Date getNach(){

        return  nach;
    }
    public Date getCon(){
        return  con;
    }

    public Integer getFirmaPodrid(){

        return firmaPodrid;
    }

    public void setFirmaPodrid(Integer firmaPodrid){
        this.firmaPodrid = firmaPodrid;
    }
    public Integer getStrmatid(){

        return strmatid;
    }

    public void setStrmatid(Integer strmatid){
        this.strmatid = strmatid;
    }
    public Integer getJilpomid(){

        return jilpomid;
    }

    public void setJilpomid(Integer jilpomid){
        this.jilpomid = jilpomid;
    }
    public Integer getZakazchikid(){

        return zakazchikid;
    }

    public void setZakazchikid(Integer zakazchikid){
        this.zakazchikid = zakazchikid;
    }

    public Integer getRabochid(){

        return rabochid;
    }

    public void setRabochid(Integer rabochid){
        this.rabochid = rabochid;
    }


}


package subd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import subd.service.*;
import subd.model.*;
import subd.repository.*;

import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Scanner;

@SpringBootApplication
public class JpaApplication {
    private FirmaPodrRepository firmaPodrRepository;
    private JilpomRepository jilpomRepository;
    private RabochRepository rabochRepository;
    private StrmatRepository strmatRepository;
    private VidRabotRepository vidRabotRepository;
    private ZakazchikRepository zakazchikRepository;
    private ZakazRepository zakazRepository;
    private FirmaPodrService firmaPodrService;
    private JilpomService jilpomService;
    private RabochService rabochService;
    private StrmatService strmatService;
    private VidRabotService vidRabotService;
    private ZakazchikService zakazchikService;
    private ZakazService zakazService;

    @Autowired
    public JpaApplication(FirmaPodrRepository firmaPodrRepository,
            JilpomRepository jilpomRepository,
            RabochRepository rabochRepository,
            StrmatRepository strmatRepository,
            VidRabotRepository vidRabotRepository,
            ZakazchikRepository zakazchikRepository,
            ZakazRepository zakazRepository){
        this.firmaPodrService = firmaPodrService;
        this.jilpomService = jilpomService;
        this.rabochService = rabochService;
        this.strmatService = strmatService;
        this.vidRabotService = vidRabotService;
        this.zakazchikService = zakazchikService;
        this.zakazService = zakazService;
    }

    public static void main(String[] args){

        SpringApplication.run(JpaApplication.class,args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void onStart() throws ParseException {

        zakazchikService.createZakazchik(5, "Иванов Иван");

        System.out.println(rabochRepository.getRabochName());

        System.out.println(zakazchikService.findAll().toString());

        rabochService.createRaboch(21, "Артем Артемович", 1000);
        rabochService.createRaboch(22, "Петр Петров", 1500);
        rabochService.createRaboch(23, "Сидр Сидоров", 1000);


        strmatService.createStrmat(32, "Дерево", 10);
        strmatService.createStrmat(3, "Гвозди", 100);
        strmatService.createStrmat(3, "Бетон", 1000);

        System.out.println(strmatService.findAll().toString());

        System.out.println(vidRabotService.findAll().toString());
        System.out.println(jilpomService.findAll().toString());


        zakazService.createZakaz(7,101,new Timestamp(1539547200000L) , new Timestamp(1539548200000L), 1, 1, 1, 1, 1);
        System.out.println(zakazRepository.getAllByDateBetween(new Timestamp(1539547200000L), new Timestamp(System.currentTimeMillis())));
    }

}

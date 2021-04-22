package subd.service;

import subd.model.PageableItems;
import subd.repository.ZakazRepository;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import subd.model.Zakaz;
import java.util.List;
import java.util.Date;
import java.util.Optional;
import subd.model.OffsetablePageRequest;

@Service
public class ZakazService {

    public ZakazRepository zakazRepository;

    public void createZakaz(Integer zakazid, Integer nomerDogovora, Date nach, Date con, Integer firmaPodrid, Integer jilpomid,
                            Integer rabochid, Integer strmatid, Integer zakazchikid) {
        Zakaz zakaz = new Zakaz(zakazid, nomerDogovora, nach, con, firmaPodrid, jilpomid,
                 rabochid, strmatid, zakazchikid);
        zakazRepository.save(zakaz);
    }

    public Optional<Zakaz> find(Integer id) {
        return zakazRepository.findById(id);
    }

    public Zakaz get(Integer id) {
        return zakazRepository.getOne(id);
    }

    public void deleteZakaz(Integer id) {
        zakazRepository.deleteById(id);
    }

    public void updateZakaz(Integer zakazid, Integer nomerDogovora, Date nach, Date con, Integer firmaPodrid, Integer jilpomid,
                            Integer rabochid, Integer strmatid, Integer zakazchikid) {
        Zakaz zakaz = new Zakaz(zakazid, nomerDogovora, nach, con, firmaPodrid, jilpomid,
                rabochid, strmatid, zakazchikid);
        zakazRepository.save(zakaz);
    }
    public List<Zakaz> findAll() {

        return zakazRepository.findAll();
    }
    public PageableItems<Zakaz> findAll(int offset, int count) {
        final Page<Zakaz> page = zakazRepository.findAll(new OffsetablePageRequest(offset, count));
        return new PageableItems<>(page.getTotalElements(), page.getContent());
    }

}
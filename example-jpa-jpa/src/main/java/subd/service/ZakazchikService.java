package subd.service;

import subd.model.PageableItems;
import subd.repository.ZakazchikRepository;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import subd.model.Zakazchik;
import java.util.List;
import java.util.Optional;
import subd.model.OffsetablePageRequest;

@Service
public class ZakazchikService {
    public ZakazchikRepository zakazchikRepository;

    public void createZakazchik(Integer zakazchikid, String fioZakazchik) {
        Zakazchik zakazchik = new Zakazchik(zakazchikid, fioZakazchik);
        zakazchikRepository.save(zakazchik);
    }

    public Optional<Zakazchik> find(Integer id) {
        return zakazchikRepository.findById(id);
    }

    public Zakazchik get(Integer id) {
        return zakazchikRepository.getOne(id);
    }

    public void deleteZakaz(Integer id) {
        zakazchikRepository.deleteById(id);
    }

    public void updateZakazchik(Integer zakazchikid, String fioZakazchik) {
        Zakazchik zakazchik = new Zakazchik(zakazchikid, fioZakazchik);
        zakazchikRepository.save(zakazchik);
    }
    public List<Zakazchik> findAll() {
        return zakazchikRepository.findAll();
    }
    public PageableItems<Zakazchik> findAll(int offset, int count) {
        final Page<Zakazchik> page = zakazchikRepository.findAll(new OffsetablePageRequest(offset, count));
        return new PageableItems<>(page.getTotalElements(), page.getContent());
    }

}
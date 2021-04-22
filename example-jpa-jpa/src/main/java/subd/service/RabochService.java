package subd.service;
import org.springframework.stereotype.Service;
import subd.model.PageableItems;
import subd.repository.RabochRepository;
import org.springframework.data.domain.Page;
import subd.model.Raboch;
import java.util.List;
import java.util.Optional;
import subd.model.OffsetablePageRequest;

@Service
public class RabochService {
    public RabochRepository rabochRepository;

    public void createRaboch(Integer rabochid, String fioRab, Integer oplataZaKvM) {
        Raboch raboch = new Raboch( rabochid, fioRab, oplataZaKvM);
        rabochRepository.save(raboch);
    }

    public Optional<Raboch> find(Integer id) {
        return rabochRepository.findById(id);
    }

    public Raboch get(Integer id) {
        return rabochRepository.getOne(id);
    }

    public void deleteZakaz(Integer id) {
        rabochRepository.deleteById(id);
    }

    public void updateRaboch(Integer rabochid, String fioRab, Integer oplataZaKvM) {
        Raboch raboch = new Raboch( rabochid, fioRab, oplataZaKvM);
        rabochRepository.save(raboch);
    }
    public List<Raboch> findAll() {
        return rabochRepository.findAll();
    }
    public PageableItems<Raboch> findAll(int offset, int count) {
        final Page<Raboch> page = rabochRepository.findAll(new OffsetablePageRequest(offset, count));
        return new PageableItems<>(page.getTotalElements(), page.getContent());
    }
}


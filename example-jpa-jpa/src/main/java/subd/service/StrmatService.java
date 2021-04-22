package subd.service;
import org.springframework.stereotype.Service;
import subd.model.PageableItems;
import subd.repository.StrmatRepository;
import org.springframework.data.domain.Page;
import subd.model.Strmat;
import java.util.List;
import java.util.Optional;
import subd.model.OffsetablePageRequest;

@Service
public class StrmatService {
    public StrmatRepository strmatRepository;

    public void createStrmat(Integer strmatid, String strmatName, Integer kol) {
        Strmat strmat = new Strmat(strmatid, strmatName,  kol);
        strmatRepository.save(strmat);
    }

    public Optional<Strmat> find(Integer id) {
        return strmatRepository.findById(id);
    }

    public Strmat get(Integer id) {
        return strmatRepository.getOne(id);
    }

    public void deleteZakaz(Integer id) {
        strmatRepository.deleteById(id);
    }

    public void updateZakaz(Integer strmatid, String strmatName, Integer kol) {
        Strmat strmat = new Strmat(strmatid, strmatName,  kol);
        strmatRepository.save(strmat);
    }

    public List<Strmat> findAll() {
        return strmatRepository.findAll();
    }
    public PageableItems<Strmat> findAll(int offset, int count) {
        final Page<Strmat> page = strmatRepository.findAll(new OffsetablePageRequest(offset, count));
        return new PageableItems<>(page.getTotalElements(), page.getContent());
    }

}

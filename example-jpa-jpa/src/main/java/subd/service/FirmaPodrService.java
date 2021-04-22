package subd.service;

import subd.model.PageableItems;
import subd.repository.FirmaPodrRepository;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import subd.model.FirmaPodr;
import java.util.List;
import java.util.Optional;
import subd.model.OffsetablePageRequest;

@Service
public class FirmaPodrService {

   public FirmaPodrRepository firmaPodrRepository;

    public void createFirmaPodr(Integer firmaPodrid, String nazvanieFirm, Integer stoimostUsl) {
        FirmaPodr firmaPodr = new FirmaPodr(firmaPodrid, nazvanieFirm, stoimostUsl);
        firmaPodrRepository.save(firmaPodr);
    }

    public Optional<FirmaPodr> find(Integer id) {
        return firmaPodrRepository.findById(id);
    }

    public FirmaPodr get(Integer id) {
        return firmaPodrRepository.getOne(id);
    }

    public void deleteZakaz(Integer id) {
        firmaPodrRepository.deleteById(id);
    }

    public void updateFirmaPodr(Integer firmaPodrid, String nazvanieFirm, Integer stoimostUsl) {
        FirmaPodr firmaPodr = new FirmaPodr(firmaPodrid, nazvanieFirm, stoimostUsl);
        firmaPodrRepository.save(firmaPodr);
    }
    public List<FirmaPodr> findAll() {
        return firmaPodrRepository.findAll();
    }
    public PageableItems<FirmaPodr> findAll(int offset, int count) {
        final Page<FirmaPodr> page = firmaPodrRepository.findAll(new OffsetablePageRequest(offset, count));
        return new PageableItems<>(page.getTotalElements(), page.getContent());
    }

}
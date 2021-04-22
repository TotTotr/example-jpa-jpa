package subd.service;

import org.springframework.stereotype.Service;
import subd.model.PageableItems;;
import subd.repository.JilpomRepository;
import org.springframework.data.domain.Page;
import subd.model.Jilpom;
import java.util.List;
import java.util.Optional;
import subd.model.OffsetablePageRequest;

@Service
public class JilpomService {
    public JilpomRepository jilpomRepository;

    public void createJilpom(Integer jilpomid, Integer plPola, Integer plSten, Integer plPot) {
        Jilpom jilpom = new Jilpom(jilpomid, plPola, plSten, plPot);
        jilpomRepository.save(jilpom);
    }

    public Optional<Jilpom> find(Integer id) {
        return jilpomRepository.findById(id);
    }

    public Jilpom get(Integer id) {
        return jilpomRepository.getOne(id);
    }

    public void deleteZakaz(Integer id) {
        jilpomRepository.deleteById(id);
    }

    public void updateJilpom(Integer jilpomid, Integer plPola, Integer plSten, Integer plPot) {
        Jilpom jilpom = new Jilpom(jilpomid, plPola, plSten, plPot);
        jilpomRepository.save(jilpom);
    }

    public List<Jilpom> findAll() {
        return jilpomRepository.findAll();
    }
    public PageableItems<Jilpom> findAll(int offset, int count) {
        final Page<Jilpom> page = jilpomRepository.findAll(new OffsetablePageRequest(offset, count));
        return new PageableItems<>(page.getTotalElements(), page.getContent());
    }
}


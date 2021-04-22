package subd.service;
import org.springframework.stereotype.Service;
import subd.model.PageableItems;
import subd.repository.VidRabotRepository;
import org.springframework.data.domain.Page;
import subd.model.VidRabot;
import java.util.List;
import java.util.Optional;
import subd.model.OffsetablePageRequest;

@Service
public class VidRabotService {
    public VidRabotRepository vidRabotRepository;

    public void createVidRabot(Integer vidRabotid, String naimen) {
        VidRabot vidRabot = new VidRabot(vidRabotid, naimen);
        vidRabotRepository.save(vidRabot);
    }

    public Optional<VidRabot> find(Integer id) {
        return vidRabotRepository.findById(id);
    }

    public VidRabot get(Integer id) {
        return vidRabotRepository.getOne(id);
    }

    public void deleteZakaz (Integer id) {
        vidRabotRepository.deleteById(id);
    }

    public void updateVidRabot (Integer vidRabotid, String naimen) {
        VidRabot vidRabot = new VidRabot(vidRabotid, naimen);
        vidRabotRepository.save(vidRabot);
    }
    public List<VidRabot > findAll() {
        return vidRabotRepository.findAll();
    }
    public PageableItems<VidRabot > findAll(int offset, int count) {
        final Page<VidRabot > page = vidRabotRepository.findAll(new OffsetablePageRequest(offset, count));
        return new PageableItems<>(page.getTotalElements(), page.getContent());
    }

}
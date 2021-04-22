package subd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import subd.model.VidRabot;

@Repository
public interface VidRabotRepository extends JpaRepository<VidRabot, Integer> {

}

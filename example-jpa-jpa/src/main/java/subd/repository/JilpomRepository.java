package subd.repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import subd.model.*;

@Repository
public interface JilpomRepository extends JpaRepository<Jilpom, Integer> {
    Page<Jilpom> findAll(Pageable pageable);
}

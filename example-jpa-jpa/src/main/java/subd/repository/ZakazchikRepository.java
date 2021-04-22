package subd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import subd.model.Zakazchik;

@Repository
public interface ZakazchikRepository extends JpaRepository<Zakazchik, Integer> {
}

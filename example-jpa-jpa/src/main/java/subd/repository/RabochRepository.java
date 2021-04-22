package subd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import subd.model.Raboch;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

@Repository
public interface RabochRepository extends JpaRepository<Raboch, Integer>{
    @Query("SELECT w FROM Raboch w  ORDER BY w.name DESC" )
    public List<Raboch> getRabochName();
}

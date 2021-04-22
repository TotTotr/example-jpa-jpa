package subd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import subd.model.Strmat;

@Repository
public interface StrmatRepository extends JpaRepository<Strmat, Integer> {
}

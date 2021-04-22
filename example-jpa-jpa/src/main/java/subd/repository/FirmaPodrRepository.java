package subd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import subd.model.FirmaPodr;

@Repository
public interface FirmaPodrRepository extends JpaRepository<FirmaPodr, Integer> {
    @Query("select b from FirmaPodr b where b.stoimostUsl = :stoimostUsl")
    FirmaPodr findByStoimostUsl(@Param("stoimostUsl") Integer stoimostUsl);
}
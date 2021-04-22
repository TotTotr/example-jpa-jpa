package subd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import subd.model.Zakaz;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import java.sql.Timestamp;

@Repository
public interface ZakazRepository extends JpaRepository<Zakaz, Integer> {
    @Query("SELECT w FROM Zakaz w  WHERE w.date BETWEEN :nach AND :con" )
    List<Zakaz> getAllByDateBetween(Timestamp fromDate, Timestamp toDate);

}

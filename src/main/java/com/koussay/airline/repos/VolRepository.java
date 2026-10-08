package com.koussay.airline.repos;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.koussay.airline.entities.Compagnie;
import org.springframework.data.jpa.repository.JpaRepository;
import com.koussay.airline.entities.Vol;

@RepositoryRestResource(path = "rest")
public interface VolRepository extends JpaRepository<Vol, Long> {
	List<Vol> findVolByNumero(String nv);
	List<Vol> findVolByNumeroContains(String nv);
	@Query("select v from Vol v where v.numero = ?1 and v.destination = ?2")
	List<Vol> findByNumeroDestination(String numero, String destination);
	@Query("select v from Vol v where v.numero = :numero and v.destination = :destination")
	List<Vol> findByNumeroDestination1(@Param("numero") String numero, @Param("destination") String destination);
	@Query("select v from Vol v where v.compagnie = ?1")
	List<Vol> findByCompagnie(Compagnie compagnie);
	List<Vol> findByCompagnieIdCompagnie(Long idcat);
	List<Vol> findByOrderByNumeroAsc();
	@Query("select v from Vol v order by v.numero ASC, v.dateDepart DESC")
	List<Vol> trierVolsNumeroDateDepart();
}

package com.example.demo.repository;



import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Cadena;
import com.example.demo.entity.Prices;


@Repository

public interface PricesRepository extends JpaRepository<Prices, Long> {
	
	//  @Query ("select l from Prices l where l.productId = :productId AND l.Cadena = :BRAND_ID AND l.startDate <= :date AND l.endDate >= :date")
	 
	  @Query("SELECT P "
	  		+ "    FROM Prices P "
	  		+ "        INNER JOIN (SELECT MAX(priority) AS MaxPriority "
	  		+ "                        FROM Prices l "
	  		+ "                        WHERE l.productId = :productId  AND l.Cadena = :BRAND_ID AND l.startDate <= :date AND l.endDate >= :date) q "
	  		+ "            ON  P.productId = :productId  AND P.Cadena = :BRAND_ID AND P.startDate <= :date AND P.endDate >= :date "
	  		+ "                AND P.priority = q.MaxPriority ")
	  
	  
	  List<Prices> findByBrand_Product(Cadena BRAND_ID, Integer productId,Date date);
	
	  /*
	   * Deducciones del enunciado
	   * 	-	SI no he entendido mal el enunciado... es posible que ocurra lo siguiente:
	   * 			-	En una misma fecha haya 2 productos (price_list) con la misma prioridad... 
	   * 				Yo lo que he hecho es hacer que se obtengan los que haya
	   * 			-	Entiendo que esto no ocurrirá a la hora de montar la tabla.. pero por si acaso
	   */
}

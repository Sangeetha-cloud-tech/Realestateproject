package com.example.realestate;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface Landdetailssalerepo extends JpaRepository<Landdetailssale,String> 
{
	@Query(nativeQuery=true,
			value="SELECT * FROM landdetailssale where landarea=:landarea")
	List<Landdetailssale> filter(@Param("landarea")String landarea);

}

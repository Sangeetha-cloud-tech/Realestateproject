package com.example.realestate;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Landdetailsrepo extends JpaRepository<Landdetails,String>
{
	@Query(nativeQuery=true,
			value="SELECT * FROM landdetails where landarea=:landarea")
	List<Landdetails> filter(@Param("landarea")String landarea);
}

package com.blackcoffer.datavis_dashboard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blackcoffer.datavis_dashboard.entity.Data;

@Repository
public interface DataRepository extends JpaRepository<Data, Integer>{

	List<Data> findByEndYear(int endyear);

	List<Data> findByCountry(String country);

	List<Data> findByTopic(String topic);

	List<Data> findByRegion(String region);

	List<Data> findByPestle(String pestle);

	List<Data> findBySource(String source);

	List<Data> findBySwot(String swot);

	List<Data> findByCity(String city);

	List<Data> findBySector(String sector);

	

}

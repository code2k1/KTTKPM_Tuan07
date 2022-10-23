package com.example.OnThiGKKTTKPM.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.OnThiGKKTTKPM.model.ChuyenBay;
@Repository
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String>{
//	@Query(value = "SELECT * FROM chuyenbay;",nativeQuery = true)
//	List<ChuyenBay> findAll();
}

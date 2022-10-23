package com.example.OnThiGKKTTKPM.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.OnThiGKKTTKPM.model.ChuyenBay;
import com.example.OnThiGKKTTKPM.repository.ChuyenBayRepository;

@RestController
@RequestMapping("/chuyenbay")
public class ChuyenBayController {
	@Autowired
	private ChuyenBayRepository  chuyenBayRepository;
	
	@GetMapping("/dschuyenbay")
	public List<ChuyenBay> getAllChuyenBay(){
		return chuyenBayRepository.findAll();
	}
	
	@GetMapping("/dschuyenbay/{id}")
	public Optional<ChuyenBay> getChuyenBayoByID(@PathVariable("id") String id){
		return   chuyenBayRepository.findById(id);
	}
	
	@PostMapping("/save")
	public ChuyenBay saveChuyenBay(@RequestBody ChuyenBay cb){
		ChuyenBay temp = new ChuyenBay(cb.getMaCB(), cb.getGaDi(), cb.getGaDen(), cb.getDoDai(), cb.getGioDi(),cb.getGioDen(), cb.getChiPhi());
		
		return   chuyenBayRepository.save(temp);
	}
	
}

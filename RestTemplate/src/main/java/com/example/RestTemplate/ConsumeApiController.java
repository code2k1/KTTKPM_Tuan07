package com.example.RestTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Api")

// Class
public class ConsumeApiController {

	@GetMapping("/{id}")
	public ResponseEntity<ChuyenBay> getChuyenBay(@PathVariable String id) {
		RestTemplateProvider restTemplate = new RestTemplateProvider();
		ResponseEntity<ChuyenBay> cb = restTemplate.getChuyenBayData(id);
		return cb;
	}

	@GetMapping("/customer/{id}")
	public ResponseEntity<Customer> getCustomer(@PathVariable String id) {
		RestTemplateProvider restTemplate = new RestTemplateProvider();
		ResponseEntity<Customer> cb = restTemplate.getCustomerData(id);
		return cb;
	}
	
	

	@PostMapping
	public ResponseEntity<ChuyenBay> saveChuyenBay(@RequestBody ChuyenBay cb) {
		RestTemplateProvider restTemplate = new RestTemplateProvider();
		ChuyenBay temp = new ChuyenBay(cb.getMaCB(), cb.getGaDi(), cb.getGaDen(), cb.getDoDai(), cb.getGioDi(),
				cb.getGioDen(), cb.getChiPhi());
		return restTemplate.post(temp);
	}
	
	@PostMapping("/customer")
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer c) {
		RestTemplateProvider restTemplate = new RestTemplateProvider();
		return restTemplate.postCus(c);
	}
	
	
	@GetMapping("/hello")
	  public ResponseEntity hello(){
	      return ResponseEntity.ok("hello");
	  }
	
}
package com.example.RestTemplate;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestTemplateProvider {
	RestTemplate rest = new RestTemplate();
	 
    // Method
    public ResponseEntity<ChuyenBay> getChuyenBayData(String id)
    {
        return rest.getForEntity(
            "http://localhost:8081/chuyenbay/dschuyenbay/{id}",
            ChuyenBay.class,id);
    }
 
    // Method
    public ResponseEntity<ChuyenBay> post(ChuyenBay cb)
    {
        return rest.postForEntity(
            "http://localhost:8081/chuyenbay/save", cb,
            ChuyenBay.class, "");
    }
    
    public ResponseEntity<Customer> getCustomerData(String id)
    {
        return rest.getForEntity(
            "http://localhost:8082/customer/{id}",
            Customer.class,id);
    }
 
    // Method
    public ResponseEntity<Customer> postCus(Customer c)
    {
        return rest.postForEntity(
            "http://localhost:8082/customer/save", c,
            Customer.class, "");
    }
    
}

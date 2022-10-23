//package com.example.RestTemplate;
//
//
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//@RestController
//@RequestMapping(path = "/chuyenbay",
//                produces = "application/json")
//@CrossOrigin(origins = "*")
//public class RestApiController {
//	
//	 @GetMapping("/dschuyenbay/{id}") public ChuyenBay get(@PathVariable String id)
//	    {
//	       
//	        return null;
//	    }
//	 
//	    // Annotation
//	    @PostMapping
//	    public ResponseEntity<ChuyenBay>
//	    post(@RequestBody ChuyenBay cb)
//	    {
//	        HttpHeaders headers = new HttpHeaders();
//	        return new ResponseEntity<>(cb, headers,
//	                                    HttpStatus.CREATED);
//	    }
//}

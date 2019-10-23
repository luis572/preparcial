package edu.eci.api.controller;

import edu.eci.api.services.contracts.IAppServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("airports")
public class Controller {

	@Autowired
	IAppServices appServices;
	
	@GetMapping("/{city}")
	public ResponseEntity<?> getAllLibraries(@PathVariable String city){
		try {
			return new ResponseEntity<>(appServices.getHttpConnection(city) ,  HttpStatus.ACCEPTED);
		} catch (Exception ex) {
			return new ResponseEntity<>("Error, no cinemas were found", HttpStatus.NOT_FOUND);
		}
	}
	
	
}


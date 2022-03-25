package com.mobile.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.entity.Mobile;
import com.mobile.service.MobileService;

@RestController
@RequestMapping("/mobile")
public class MobileController {

	@Autowired
	MobileService service;
	
	
	@PostMapping("/addMobile")                                  //http://localhost:4756/mobile/addMobile
	public Mobile addMobile(@RequestBody Mobile m) {
		return service.addMobile(m);
	}
	
	@PutMapping("/updateMobile")                                          //http://localhost:4756/mobile/updateMobile
	public Mobile updateMobile(@RequestBody Mobile m)
	{
		return service.updateMobile(m);
	}
	
	@GetMapping("/getMobile/{mobileId}")                                     //http://localhost:4756/mobile/getMobile/mobileId
	public Optional<Mobile> getMobile(@PathVariable("mobileId") int mobileId)
	{
		return service.getMobile(mobileId);
	}
	
	@GetMapping("/getAllMobile")                                             //http://localhost:4756/mobile/getAllMobile
	public Iterable<Mobile> getAllMobile(){
		return service.getAllMobile();
	}
	
	 
	@DeleteMapping("/deleteMobile/{mobileId}")                                     //http://localhost:4756/mobile/deleteMobile/mobileId
	public void deleteMobile(@PathVariable("mobileId") int mobileId)
	{
		service.deleteMobile(mobileId);
	}
}

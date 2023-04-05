package com.jbk.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.bank.entity.SBIBank;
import com.jbk.bank.service.SBIService;

@RestController
public class SBiController {

	@Autowired
	SBIService sbiservice;

	@GetMapping("/getalldata")
	public List<SBIBank> getAllCustomersData() {
		return sbiservice.getAllCustomersData();
	}

	@PostMapping("/insertdata")
	public String insertCustomersData(@RequestBody List<SBIBank> cuslist) {
		String msg = sbiservice.insertCustomersData(cuslist);
		return msg;
	}

	@PutMapping("/updatedata")
	public String updataCustomersData(@RequestBody List<SBIBank> cuslist) {
		String msg = sbiservice.updateCustomersData(cuslist);
		return msg;
	}

	@DeleteMapping("/deletedata/{id}")
	public String deleteCustomersData(@PathVariable int id) {
		String msg = sbiservice.deleteCustomersData(id);
		return msg;
	}

	@GetMapping("/get-data-by-id/{id}")
	public List<SBIBank> getCustomersDataByID(@PathVariable int id) {
		return sbiservice.getCustomersDataByID(id);

	}

	@GetMapping("/get-data-by-id1/{id1}")
	public SBIBank getCustomersDataByID1(@PathVariable int id1) {
		return sbiservice.getCustomersDataByID1(id1);

	}
}

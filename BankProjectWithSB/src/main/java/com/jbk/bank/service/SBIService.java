package com.jbk.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.bank.dao.SBIDao;
import com.jbk.bank.entity.SBIBank;

@Service
public class SBIService {
	@Autowired
	SBIDao sbidao;

	public List<SBIBank> getAllCustomersData() {
		return sbidao.getAllCustomersData();
	}

	public String insertCustomersData(List<SBIBank> cuslist) {
		String msg = sbidao.insertCustomersData(cuslist);
		return msg;

	}

	public String updateCustomersData(List<SBIBank> cuslist) {
		String msg = sbidao.upadteCustomersData(cuslist);
		return msg;
	}

	public String deleteCustomersData(int id) {
		String msg = sbidao.deleteCustomersData(id);
		return msg;
	}

	public List<SBIBank> getCustomersDataByID(int id) {
		return sbidao.getCustomersDataByID(id);

	}

	public SBIBank getCustomersDataByID1(int id1) {
		return sbidao.getCustomersDataByID1(id1);
	}
}

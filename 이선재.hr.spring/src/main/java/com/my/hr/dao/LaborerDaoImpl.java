package com.my.hr.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.hr.dao.map.LaborerMap;
import com.my.hr.domain.Laborer;
import com.my.hr.domain.NoneException;

@Repository
public class LaborerDaoImpl implements LaborerDao{
	@Autowired private LaborerMap laborerMap;
	
	@Override
	public List<Laborer> selectLaborers() {
		return laborerMap.selectLaborers();
	}
	
	@Override
	public void insertLaborer(String laborerName, LocalDate hireDate) {
		laborerMap.insertLaborer(laborerName, hireDate);
	}
	
	@Override
	public void updateLaborer(Laborer laborer) {
		if(laborerMap.updateLaborer(laborer) == 0)
			throw new NoneException("해당 노동자가 없습니다.");	
	}
	
	@Override
	public void deleteLaborer(int laborerId) {
		if(laborerMap.deleteLaborer(laborerId) == 0)
			throw new NoneException("해당 노동자가 없습니다.");
	}
}
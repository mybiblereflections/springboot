package com.simeon.h2demo.impl;

import java.util.List;
import com.simeon.h2demo.repositories.TODORepository;
import com.simeon.h2demo.models.TODO;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.simeon.h2demo.service.TODOService;
 
/**
 * @author Simeon
 *
 */
@Service
public class TODOServiceImpl implements TODOService{
 
 @Autowired
 private TODORepository TODORepository;
 
 public void setTODORepository(TODORepository TODORepository) {
  this.TODORepository = TODORepository;
 }
  
 public List<TODO> retrieveTODOs() {
  List<TODO> TODOs = (List<TODO>) TODORepository.findAll();
  return TODOs;
 }
  
 public TODO getTODO(Integer TODOId) {
  Optional<TODO> optEmp = TODORepository.findById(TODOId);
  return optEmp.get();
 }
  
 public void saveTODO(TODO TODO){
  TODORepository.save(TODO);
 }
  
 public void deleteTODO(TODO TODO){
  TODORepository.delete(TODO);
 }
  
 public void updateTODO(TODO TODO) {
  TODORepository.save(TODO);
 }

@Override
public TODO getTODO(Long Id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void deleteTODO(Long Id) {
	// TODO Auto-generated method stub
	
}
}

package com.simeon.h2demo.service;

import java.util.List;

import com.simeon.h2demo.models.TODO;
 
/**
 * @author Simeon
 *
 */
public interface TODOService {
 public List<TODO> retrieveTODOs();
  
 public TODO getTODO(Long Id);
  
 public void saveTODO(TODO TODO);
  
 public void deleteTODO(Long Id);
  
 public void updateTODO(TODO TODO);
}
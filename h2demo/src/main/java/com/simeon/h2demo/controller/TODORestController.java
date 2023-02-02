package com.simeon.h2demo.controller;

import java.util.List;
import com.simeon.h2demo.models.TODO;
import com.simeon.h2demo.service.TODOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

 
/**
 * @author Simeon
 *
 */
@RestController
public class TODORestController {
  
 @Autowired
 private TODOService TODOService;
  
 public void setTODOService(TODOService TODOService) {
  this.TODOService = TODOService;
 }
 
 @GetMapping("/api/TODOs")
 public List<TODO> getTODOs() {
  List<TODO> TODOs = TODOService.retrieveTODOs();
  return TODOs;
 }
  
 @GetMapping("/api/TODOs/{Id}")
 public TODO getTODO(@PathVariable(name="Id")Long Id) {
  return TODOService.getTODO(Id);
 }
  
 @PostMapping("/api/TODOs")
 public void saveTODO(TODO TODO){
  TODOService.saveTODO(TODO);
  System.out.println("TODO Saved Successfully");
 }
  
 @DeleteMapping("/api/TODOs/{Id}")
 public void deleteTODO(@PathVariable(name="Id")Long Id){
  TODOService.deleteTODO(Id);
  System.out.println("TODO Deleted Successfully");
 }
  
 @PutMapping("/api/TODOs/{Id}")
 public void updateTODO(@RequestBody TODO TODO,
   @PathVariable(name="Id")Long Id){
  TODO emp = TODOService.getTODO(Id);
  if(emp != null){
   TODOService.updateTODO(TODO);
  }
   
 }
 
}
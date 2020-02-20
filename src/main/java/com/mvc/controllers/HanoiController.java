package com.mvc.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.mvc.model.Hanoi;
import com.mvc.model.HanoiMovements;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@Controller
public class HanoiController {
	
  @RequestMapping(method = RequestMethod.GET, value="/disks/{Num}")
  
  @ResponseBody
  public List<Hanoi> getAllCars(@PathVariable("Num") int Num) {
      return HanoiMovements.getInstance().getMovements(Num);
  }
  
}


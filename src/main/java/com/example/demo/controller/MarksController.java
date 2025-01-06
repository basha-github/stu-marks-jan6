package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Marks;
import com.example.demo.service.MarksService;

@RestController
public class MarksController {
	
	@Autowired
	MarksService marksService;
	
	@PostMapping("/exam/marks/add")
	public Marks addNewStuMarks(@RequestBody Marks marks ) {
		return marksService.saveNewMarks(marks);
	}
	
	@PostMapping("/exam/marks/add/all")
	public List<Marks> addNewStuMarks(@RequestBody List<Marks> marks ) {
		return marksService.saveAllNewMarks(marks);
	}
	
	@GetMapping("/exam/marks/all")
	public List<Marks> getAllMarks(){
		
		return marksService.getAllMarks();
	}
	

	

}

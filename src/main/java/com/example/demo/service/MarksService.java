package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Marks;
import com.example.demo.repo.StuRepo;

@Service
public class MarksService {
	
	@Autowired
	StuRepo stuRepo;

	public Marks saveNewMarks(Marks marks) {
		
		return stuRepo.save(marks);
		
	}

	public List<Marks> getAllMarks() {
	
		return stuRepo.findAll();
	
	}

	public List<Marks> saveAllNewMarks(List<Marks> allMarks) {
		
		return stuRepo.saveAll(allMarks);
		
	}

	public Marks updateStuMarks(Marks marks) {
		try {
			Marks newMarks = stuRepo.findById(marks.getRoolNo()).get();
			if(newMarks != null) {
				return stuRepo.save(marks);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return new Marks();		
					
		
		
	}

	

}

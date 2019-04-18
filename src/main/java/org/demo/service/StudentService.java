package org.demo.service;

import java.util.LinkedList;
import java.util.List;

import org.demo.resource.Student;
import org.springframework.stereotype.Service;

/**
 * Fake service for tests
 *
 */
@Service
public class StudentService {

	private final static List<Student> list = new LinkedList<>();
	static {
		list.add(new Student(1L, "Bart", "GFT8765") );
		list.add(new Student(2L, "Omer", "YUT5433") );
	}
	
	public Student getById(long id) {
		for ( Student student : list ) {
			if ( id == student.getId()) {
				return student ; // Found
			}
		}
		return null ; // Not found 
	}
	
    public List<Student> getAll() {
    	return list ;
    }
}

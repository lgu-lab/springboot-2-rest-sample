package org.demo.rest.controller;

import java.util.List;

import org.demo.resource.Student;
import org.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
    private StudentService service = new StudentService() ;
	
	@GetMapping("/students")
    public List<Student> getAll() {
        return service.getAll() ;
    }

	@GetMapping("/students/{id}")
	public ResponseEntity<Student> getById(@PathVariable long id) {
		Student student = service.getById(id);
		if ( student != null ) {
			// Response : '200' OK with JSON IN PAYLOAD
			return new ResponseEntity<Student>(student, HttpStatus.OK);
		}
		else {
			// Response : '404' with 'Content-Length 0'
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
	} 
	
}

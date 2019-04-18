package org.demo.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
    /**
     * HTTP 'GET' 
     * Annotation '@GetMapping' is a shortcut for '@RequestMapping(method = RequestMethod.GET)' 
     * @return
     */
    @GetMapping(path = "/")
    public String get() {
        return "hello world";
    }
}

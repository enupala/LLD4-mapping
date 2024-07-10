package com.firstproject.springboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/greetppl")
    public String sayHello(@RequestParam("")String name) {
        System.out.println("my 1st API using SB");
        return "Hello " + name;
    }
       @GetMapping("/bye")
        public String  sayBye(){
            return "bye, the class is done!";
        }

        @PostMapping("/EmployeeDetails")
            public String  emplyeeDetails(@RequestBody Employee employee)
            {
                return employee.getEmail();
            }



}

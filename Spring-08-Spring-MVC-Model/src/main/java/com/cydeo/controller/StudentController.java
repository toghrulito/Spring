package com.cydeo.controller;

import com.cydeo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String hopePage(Model model){

         model.addAttribute("name","Cydeo");
         model.addAttribute("course","MVC");

        String subject ="Collections";
        model.addAttribute("subject",subject);
        int studentID= new Random().nextInt();
        model.addAttribute("id",studentID);

        List<Integer> numbers= Arrays.asList(1,2,3,4,56,7,84,45);
        model.addAttribute("numbers",numbers);

        Student student =new Student(1,"Mike","Smith");
        model.addAttribute("student",student);

        return "student/welcome";
    }



}

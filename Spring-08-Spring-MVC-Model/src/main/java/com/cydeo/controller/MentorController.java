package com.cydeo.controller;

import com.cydeo.model.Gender;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("mentor")
public class MentorController {
@RequestMapping("/list")
public String mentor(Model model){

    List<Mentor> mentorList= new ArrayList<>();

    mentorList.add(new Mentor("Toghrul","Jabarov","35", Gender.MALE));
    mentorList.add(new Mentor("Ziba","Mammadzade","21", Gender.FEMALE));
    mentorList.add(new Mentor("Javid","Khalilov","35", Gender.MALE));
    mentorList.add(new Mentor("Demet","Cakir","21", Gender.FEMALE));

    model.addAttribute("mentors",mentorList);



    return "mentor/mentor-list";
}
}

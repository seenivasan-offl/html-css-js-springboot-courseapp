package com.example.Course.Registration.System.controller;

import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegistry;
import com.example.Course.Registration.System.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://127.0.0.1:5500/")
@RestController
public class CourseController {

    @Autowired
    CourseService courseService;
    @GetMapping("/course")
    public List<Course> getllCourse(){
        return courseService.getAllCourse();
    }

    @PostMapping("/course")
    public void addCourse(@RequestBody Course course){
        courseService.addCorse(course);
    }
    @GetMapping("/course/enroll")
    public List<CourseRegistry> enrollname(){
        return courseService.enrolllist();
    }
    @PostMapping("/course/enroll")
    public void addCourseRegistry(@RequestParam("name") String name,
                                  @RequestParam("emailId") String emailId,
                                  @RequestParam("courseName") String courseName){
        courseService.courseServiceaddCourseRegistry(name,emailId,courseName);
    }
}

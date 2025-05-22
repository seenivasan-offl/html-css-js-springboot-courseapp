package com.example.Course.Registration.System.service;

import com.example.Course.Registration.System.CourseRegistrationSystemApplication;
import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegistry;
import com.example.Course.Registration.System.repository.CourseRegistryRepo;
import com.example.Course.Registration.System.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CourseRegistryRepo courseRegistryRepo;

    public List<Course> getAllCourse() {
        return courseRepository.findAll();
    }

    public void addCorse(Course corse) {
        courseRepository.save(corse);
    }

    public List<CourseRegistry> enrolllist() {
        return courseRegistryRepo.findAll();
    }

    public void courseServiceaddCourseRegistry(String name, String emailId, String courseName) {
        CourseRegistry courseRegistry=new CourseRegistry(name,emailId,courseName);
        courseRegistryRepo.save(courseRegistry);
    }

}

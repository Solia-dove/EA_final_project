package com.example.ea_final_project.service;

import com.example.ea_final_project.model.Course;
import com.example.ea_final_project.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService implements ICourseService{
    @Autowired
    private CourseRepository repository;

    @Override
    public Course create(Course course) {
        return repository.save(course);
    }

    @Override
    public List<Course> findAll() {
        return repository.findAll();
    }

    @Override
    public Course findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Course update(Integer id, Course course) {
        Course persistedCourse = findById(course.getId());
        if (persistedCourse != null) {
            persistedCourse.setName(course.getName());
            persistedCourse.setCode(course.getCode());
            persistedCourse.setDescription(course.getDescription());
            return repository.save(persistedCourse);
        }
        return  course;
    }
}

package com.example.ea_final_project.controller;

import com.example.ea_final_project.model.Course;
import com.example.ea_final_project.model.CourseOffering;
import com.example.ea_final_project.service.CourseOfferingService;
import com.example.ea_final_project.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/courseofferings")
public class CourseOfferingController {
    @Autowired
    CourseOfferingService service;
    @GetMapping
    @PreAuthorize("hasRole('STUDENT') or hasRole('ADMIN')")
    public List<CourseOffering> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasRole('STUDENT') or hasRole('ADMIN')")
    public CourseOffering findById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    @PreAuthorize("hasRole('STUDENT') or hasRole('ADMIN')")
    public CourseOffering create(@RequestBody CourseOffering course) {

        return service.create(course);
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasRole('STUDENT') or hasRole('ADMIN')")
    public CourseOffering update(@PathVariable Integer id, @RequestBody CourseOffering courseOffer) {
       return service.update(id, courseOffer);
    }
}

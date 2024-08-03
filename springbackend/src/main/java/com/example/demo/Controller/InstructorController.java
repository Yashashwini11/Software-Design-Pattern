package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Assignment;
import com.example.demo.Model.Course;
import com.example.demo.Model.LearningMaterial;
import com.example.demo.Model.SubModule;
import com.example.demo.Service.InstructorService;

@RestController
@RequestMapping("/instructor")
public class InstructorController {

    @Autowired
    private InstructorService is;

    @PostMapping("/addcourse")
    public Course addcourse(@RequestBody Course course) {
        return is.savecourse(course);
    }

    @DeleteMapping("/deletecourse/{id}")
    public String deleteCourse(@PathVariable int id) {
        return is.deletecourse(id);
    }

    @GetMapping("/getallcourses")
    public List<Course> getallcourses() {
        return is.allcourses();
    }

    @PostMapping("/addmaterial")
    public LearningMaterial addMaterial(@RequestBody LearningMaterial material) {
        return is.upload(material);
    }

    @GetMapping("/getallmaterial")
    public List<LearningMaterial> getall() {
        return is.getall();
    }

    @PostMapping("/addsubmodule")
    public SubModule addsubmodule(@RequestBody SubModule subModule) {
        return is.add(subModule);
    }

    @GetMapping("/getallsubmodules")
    public List<SubModule> getallsubmodules() {
        return is.getallsubmodule();
    }

    @PostMapping("/addassignment")
    public Assignment addassign(@RequestBody Assignment assignment) {
        return is.addassign(assignment);
    }

    @GetMapping("/getallassignments")
    public List<Assignment> getallassignments() {
        return is.getallassignment();
    }
}

package com.example.portfolio.controller;
import com.example.portfolio.model.Project;
import com.example.portfolio.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/projects")
@CrossOrigin
public class ProjectController {
    @Autowired private ProjectRepository repo;
    @GetMapping public List<Project> getProjects() { return repo.findAll(); }
}
package com.example.portfolio.controller;
import com.example.portfolio.model.ContactMessage;
import com.example.portfolio.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin
public class ContactController {
    @Autowired private ContactRepository repo;
    @PostMapping public ResponseEntity<String> submit(@RequestBody ContactMessage msg) {
        repo.save(msg);
        return ResponseEntity.ok("Message received");
    }
}
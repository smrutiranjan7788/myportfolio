package com.example.portfolio.repository;
import com.example.portfolio.model.ContactMessage;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ContactRepository extends JpaRepository<ContactMessage, Long> {}
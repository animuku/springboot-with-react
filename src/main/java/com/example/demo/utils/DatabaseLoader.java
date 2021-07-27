package com.example.demo.utils;

import com.example.demo.domain.Employee;
import com.example.demo.domain.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

  private EmployeeRepository repository;

  @Autowired
  public DatabaseLoader(EmployeeRepository repository) {
    this.repository = repository;
  }

  @Override
  public void run(String... strings) throws Exception {
    this.repository.save(new Employee("Frodo", "Baggins", "Ring-bearer"));
  }
}

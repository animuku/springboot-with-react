package com.example.demo.domain;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Employee {

  @Id
  @GeneratedValue
  @Getter
  @Setter
  private Long id;
  @Getter
  @Setter
  private String firstName;
  @Getter
  @Setter
  private String lastName;
  @Getter
  @Setter
  private String description;

  Employee() {}

  public Employee(String firstName, String lastName, String role) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.description = role;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    if (!(o instanceof Employee)) {
      return false;
    }
    Employee emp = (Employee) o;
    return Objects.equals(this.id, emp.id) && Objects.equals(this.firstName, emp.firstName)
        && Objects.equals(this.lastName, emp.lastName)
        && Objects.equals(this.description, emp.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.firstName, this.lastName, this.description);
  }

  @Override
  public String toString() {
    return "Employee{" + "id=" + this.id + ", firstName='" + this.firstName + ", lastName='"
        + this.lastName + '\'' + ", role='" + this.description
        + '\'' + '}';
  }
}

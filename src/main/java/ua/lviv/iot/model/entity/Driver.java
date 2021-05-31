package ua.lviv.iot.model.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="driver")
@Table(name = "driver")
public class Driver {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;

  @Column(name = "name", length = 40)
  private String name;

  @Column(name = "surname", length = 30)
  private String surname;

  public Driver(int id, String name, String surname) {
    this.id = id;
    this.name = name;
    this.surname = surname;
  }

  public Driver(String name, String surname) {
    this.name = name;
    this.surname = surname;
  }
  public Driver() {}
  
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }
  
  
  @Override
  public int hashCode() {
    return Objects.hash(id, name, surname);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Driver other = (Driver) obj;
    return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(surname, other.surname);
  }

  @Override
  public String toString() {
    return "Driver [id=" + id + ", name=" + name + ", surname=" + surname + "]";
  }
  
  
}
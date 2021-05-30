package ua.lviv.iot.model.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="stop")
@Table(name="stop")
public class Stop {
  
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="id")
  private Integer id;
  
  @Column(name="address")
  private String address;

  public Stop(int id, String address) {
    this.id = id;
    this.address = address;
  }

  public Stop(String address) {
    this.address = address;
  }
  
  public Stop() {   
  }
  
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

   
  
  @Override
  public int hashCode() {
    return Objects.hash(address, id);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Stop other = (Stop) obj;
    return Objects.equals(address, other.address) && Objects.equals(id, other.id);
  }

  @Override
  public String toString() {
    return "\nStop [id=" + id + ", address=" + address + "]";
  }
  
}

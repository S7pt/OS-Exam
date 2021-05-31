package ua.lviv.iot.model.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "bus")
@Table(name = "bus")
public class Bus {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;

  @Column(name = "driver_id")
  private Integer driverId;
  
  @Column(name="route_id")
  private Integer routeId;
  
  @Column(name="bus_model_id")
  private Integer busModelId;

  @Column(name = "age")
  private Integer age;

  @Column(name = "mileage")
  private Integer mileage;


  public Bus() {
  }

  public Bus(Integer driverId, Integer routeId, Integer busModelId, Integer age, Integer mileage) {
    super();
    this.driverId = driverId;
    this.routeId = routeId;
    this.busModelId = busModelId;
    this.age = age;
    this.mileage = mileage;
  }

  public Bus(Integer id, Integer driverId, Integer routeId, Integer busModelId, Integer age, Integer mileage) {
    super();
    this.id = id;
    this.driverId = driverId;
    this.routeId = routeId;
    this.busModelId = busModelId;
    this.age = age;
    this.mileage = mileage;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getDriverId() {
    return driverId;
  }

  public void setDriverId(Integer driverId) {
    this.driverId = driverId;
  }

  public Integer getRouteId() {
    return routeId;
  }

  public void setRouteId(Integer routeId) {
    this.routeId = routeId;
  }

  public Integer getBusModelId() {
    return busModelId;
  }

  public void setBusModelId(Integer busModelId) {
    this.busModelId = busModelId;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Integer getMileage() {
    return mileage;
  }

  public void setMileage(Integer mileage) {
    this.mileage = mileage;
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, busModelId, driverId, id, mileage, routeId);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Bus other = (Bus) obj;
    return Objects.equals(age, other.age) && Objects.equals(busModelId, other.busModelId)
        && Objects.equals(driverId, other.driverId) && Objects.equals(id, other.id)
        && Objects.equals(mileage, other.mileage) && Objects.equals(routeId, other.routeId);
  }

  @Override
  public String toString() {
    return "\nBus [id=" + id + ", driver=" + driverId + ", route=" + routeId + ", busModel=" + busModelId
        + ", age=" + age + ", mileage=" + mileage + "]";
  }

}
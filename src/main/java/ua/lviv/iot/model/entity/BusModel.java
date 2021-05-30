package ua.lviv.iot.model.entity;

import java.util.Objects;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="bus_model")
@Table(name = "bus_model")
public class BusModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;
  
  @Column(name="producer_id")
  private Integer producerId;
  
  @Column(name="color",length=12)
  private String color;
  
  @Column(name="capacity")
  private Integer capacity;
  
  @Column(name="model_name",length=45)
  private String modelName;

  
  public BusModel() {
  }

  public BusModel(Integer producerId, String color, Integer capacity, String modelName) {
    super();
    this.producerId = producerId;
    this.color = color;
    this.capacity = capacity;
    this.modelName = modelName;
  }

  public BusModel(Integer id, Integer producerId, String color, Integer capacity, String modelName) {
    super();
    this.id = id;
    this.producerId = producerId;
    this.color = color;
    this.capacity = capacity;
    this.modelName = modelName;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getProducerId() {
    return producerId;
  }

  public void setProducerId(Integer producerId) {
    this.producerId = producerId;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Integer getCapacity() {
    return capacity;
  }

  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }

  public String getModelName() {
    return modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacity, color, id, modelName, producerId);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    BusModel other = (BusModel) obj;
    return Objects.equals(capacity, other.capacity) && Objects.equals(color, other.color)
        && Objects.equals(id, other.id) && Objects.equals(modelName, other.modelName)
        && Objects.equals(producerId, other.producerId);
  }

  @Override
  public String toString() {
    return "BusModel [id=" + id + ", producer=" + producerId + ", color=" + color + ", capacity=" + capacity
        + ", modelName=" + modelName + "]";
  }
  
}
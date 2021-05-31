package ua.lviv.iot.model.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name ="producer")
@Table(name = "producer")
public class Producer {
  
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;
  
  @Column(name = "producer_name")
  private String producerName;

  public Producer(int id, String producerName) {
    this.id = id;
    this.producerName = producerName;
  }

  public Producer(String producerName) {
    this.producerName = producerName;
  }
  public Producer() {
  }
  
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getProducerName() {
    return producerName;
  }

  public void setProducerName(String producerName) {
    this.producerName = producerName;
  }


  @Override
  public int hashCode() {
    return Objects.hash(id, producerName);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Producer other = (Producer) obj;
    return Objects.equals(id, other.id) && Objects.equals(producerName, other.producerName);
  }

  @Override
  public String toString() {
    return "Producer [id=" + id + ", producerName=" + producerName + "]";
  }

  
  
}

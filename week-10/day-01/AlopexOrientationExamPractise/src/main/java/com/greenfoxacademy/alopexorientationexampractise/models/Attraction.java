package com.greenfoxacademy.alopexorientationexampractise.models;

import javax.persistence.*;


@Entity
@Table(name = "attractions")
public class Attraction {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "attr_name")
  private String attractionName;
  private String city;
  private String category;
  private Integer price;
  private Float longitude;
  private Float latitude;
  @Column(name = "recommended_age")
  private Float recommendedAge;
  private Integer duration;

  public Attraction() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getAttractionName() {
    return attractionName;
  }

  public void setAttractionName(String attractionName) {
    this.attractionName = attractionName;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public Float getLongitude() {
    return longitude;
  }

  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }

  public Float getLatitude() {
    return latitude;
  }

  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

  public Float getRecommendedAge() {
    return recommendedAge;
  }

  public void setRecommendedAge(Float recommendedAge) {
    this.recommendedAge = recommendedAge;
  }

  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }
}

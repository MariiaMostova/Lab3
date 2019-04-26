package ua.lviv.iot.filmstudio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Worker {
    
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  private String firstName;
  private String lastName;
  private String profession;
  private boolean deegre;
  private int workExperience;
  private int createdDocumentalFilms;
  private int wishSalary;

  public Worker() {
      
  }
  
  public Worker(final String firstName, final String lastName, final String profession, 
          final boolean deegre, final int workExperience, final int createdDocumentalFilms,
          final int wishSalary) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.deegre = deegre;
    this.workExperience = workExperience;
    this.createdDocumentalFilms = createdDocumentalFilms;
    this.wishSalary = wishSalary;
    this.profession = profession;
  }

 // public String getHeaders() {
   // return "First name, last name, profession, deegre, work experience, created documental films, "
   //         + "wish salary";
  //}
  
  public String toCSV() {
    return firstName  + ", " + lastName + ", " + profession + ", " + deegre  + ", " 
       + workExperience  + ", "  + createdDocumentalFilms + ", " + wishSalary;   
  }
  
  @Override
  public String toString() {
      return "Worker [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", profession=" + profession
              + ", deegre=" + deegre + ", workExperience=" + workExperience + ", createdDocumentalFilms="
              + createdDocumentalFilms + ", wishSalary=" + wishSalary + "]";
  }
  
  public Integer getId() {
    return id;
}

public void setId(Integer id) {
    this.id = id;
}

public String getFirstName() {
    return firstName;
  }

  public void setFirstName(final String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(final String lastName) {
    this.lastName = lastName;
  }

  public String getProfession() {
    return profession;
  }

  public void setProfession(final String profession) {
    this.profession = profession;
  }

  public boolean isDeegre() {
    return deegre;
  }

  public void setDeegre(final boolean deegre) {
    this.deegre = deegre;
  }

  public int getWorkExperience() {
    return workExperience;
  }

  public void setWorkExperience(final int workExperience) {
    this.workExperience = workExperience;
  }

  public int getCreatedDocumentalFilms() {
    return createdDocumentalFilms;
  }

  public void setCreatedDocumentalFilms(final int createdDocumentalFilms) {
    this.createdDocumentalFilms = createdDocumentalFilms;
  }

  public int getWishSalary() {
    return wishSalary;
  }

  public void setWishSalary(final int wishSalary) {
    this.wishSalary = wishSalary;
  }

}

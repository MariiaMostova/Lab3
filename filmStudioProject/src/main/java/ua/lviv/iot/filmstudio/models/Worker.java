package ua.lviv.iot.filmstudio.models;

public class Worker {

  private String firstName;
  private String lastName;
  private String profession;
  private boolean deegre;
  private int workExperience;
  private int createdDocumentalFilms;
  private int wishSalary;

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

  public String getHeaders() {
    return "First name, last name, profession, deegre, work experience, created documental films, "
            + "wish salary";
  }
  
  public String toCSV() {
    return firstName  + ", " + lastName + ", " + profession + ", " + deegre  + ", " 
       + workExperience  + ", "  + createdDocumentalFilms + ", " + wishSalary;   
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

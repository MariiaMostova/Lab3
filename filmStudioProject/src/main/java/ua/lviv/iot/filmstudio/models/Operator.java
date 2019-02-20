package main.java.ua.lviv.iot.filmstudio.models;

public class Operator extends Worker {

  private boolean ownCamera;

  public Operator(final String firstName, final String lastName, final String profession, 
          final boolean deegre, final int workExperience, final int createdDocumentalFilms, 
          final int wishSalary, final boolean ownCamera) {
    super(firstName, lastName, profession, deegre, workExperience, createdDocumentalFilms,
          wishSalary);
    this.ownCamera = ownCamera;
  }

  public boolean isOwnCamera() {
    return ownCamera;
  }

  public void setOwnCamera(final boolean ownCamera) {
    this.ownCamera = ownCamera;
  }

}

package ua.lviv.iot.filmstudio.models;

public class Actor extends Worker {

  private Roles role;

  public Actor(final String firstName, final String lastName, final String profession,
          final boolean deegre, final int workExperience, final int createdDocumentalFilms,
          final int wishSalary, final Roles role) {
    super(firstName, lastName, profession, deegre, workExperience, createdDocumentalFilms,
            wishSalary);
    this.role = role;
  }

  public Roles getRole() {
    return role;
  }

  public void setRole(final Roles role) {
    this.role = role;
  }

}

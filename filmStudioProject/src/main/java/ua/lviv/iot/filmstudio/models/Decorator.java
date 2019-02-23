package ua.lviv.iot.filmstudio.models;

public class Decorator extends Worker {

  private boolean makingLandscape;
  private boolean makingRoom;

  public Decorator(final String firstName, final String lastName, final String profession, 
          final boolean deegre, final int workExperience, final int createdDocumentalFilms, 
          final int wishSalary, final boolean makingLandscape, final boolean makingRoom) {
    super(firstName, lastName, profession, deegre, workExperience, createdDocumentalFilms, 
            wishSalary);
    this.makingLandscape = makingLandscape;
    this.makingRoom = makingRoom;
  }

  public boolean isMakingLandscape() {
    return makingLandscape;
  }

  public void setMakingLandscape(final boolean makingLandscape) {
    this.makingLandscape = makingLandscape;
  }

  public boolean isMakingRoom() {
    return makingRoom;
  }

  public void setMakingRoom(final boolean makingRoom) {
    this.makingRoom = makingRoom;
  }

}

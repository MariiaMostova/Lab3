package ua.lviv.iot.filmstudio.models;

public class Director extends Worker {

  private Scenario writtenScenario;

  public Director(final String firstName, final String lastName, final String profession,
          final boolean deegre, final int workExperience, final int createdDocumentalFilms,
          final int wishSalary, final Scenario writtenScenario) {
    super(firstName, lastName, profession, deegre, workExperience, createdDocumentalFilms, 
            wishSalary);
    this.writtenScenario = writtenScenario;
  }
  
  public String getHeaders() {
    return super.getHeaders() + ", written scenario";
  }

  public String toCSV() {
    return super.toCSV() + ", " + writtenScenario;   
  }
  
  public Scenario getWrittenScenario() {
    return writtenScenario;
  }

  public void setWrittenScenario(final Scenario writtenScenario) {
    this.writtenScenario = writtenScenario;
  }

}

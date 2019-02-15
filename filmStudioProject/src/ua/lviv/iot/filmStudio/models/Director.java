package ua.lviv.iot.filmStudio.models;

public class Director extends Worker {

	private Scenario writtenScenario;

	public Director(String firstName, String lastName, String profession, boolean deegre, int workExperience,
			int createdDocumentalFilms, int wishSalary, Scenario writtenScenario) {
		super(firstName, lastName, profession, deegre, workExperience, createdDocumentalFilms, wishSalary);
		this.writtenScenario = writtenScenario;
	}

	public Scenario getWrittenScenario() {
		return writtenScenario;
	}

	public void setWrittenScenario(Scenario writtenScenario) {
		this.writtenScenario = writtenScenario;
	}

}

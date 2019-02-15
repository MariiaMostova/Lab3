package ua.lviv.iot.filmStudio.models;

public class Actor extends Worker {

	private Roles role;

	public Actor(String firstName, String lastName, String profession, boolean deegre, int workExperience,
			int createdDocumentalFilms, int wishSalary, Roles role) {
		super(firstName, lastName, profession, deegre, workExperience, createdDocumentalFilms, wishSalary);
		this.role = role;
	}

	public Roles getRole() {
		return role;
	}

	public void setRole(Roles role) {
		this.role = role;
	}

}

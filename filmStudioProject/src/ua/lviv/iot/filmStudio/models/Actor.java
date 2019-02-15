package ua.lviv.iot.filmStudio.models;

public class Actor extends Worker {

	private Roles role;

	public Actor(String firstName, String lastName, String profession, boolean deegre, int workExperience,
			int createdDocumentalFilms, int wishSalary, Roles role) {
		super(firstName, lastName, profession, deegre, workExperience, createdDocumentalFilms, wishSalary);
		this.role = role;
	}

	public Actor(String firstName, String lastName, String profession, boolean deegre, int workExperience,
			int createdDocumentalFilms, int wishSalary) {
		this(firstName, lastName, profession, deegre, workExperience, createdDocumentalFilms, wishSalary, null);
	}

	public Actor() {
		this(null, null, null, false, 0, 0, 0, null);
	}

	public Roles getRole() {
		return role;
	}

	public void setRole(Roles role) {
		this.role = role;
	}

}

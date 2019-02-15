package ua.lviv.iot.filmStudio.models;

public class Worker {

	private String firstName;
	private String lastName;
	private String profession;
	private boolean deegre;
	private int workExperience;
	private int createdDocumentalFilms;
	private int wishSalary;

	public Worker(String firstName, String lastName, String profession, boolean deegre, int workExperience,
			int createdDocumentalFilms, int wishSalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.deegre = deegre;
		this.workExperience = workExperience;
		this.createdDocumentalFilms = createdDocumentalFilms;
		this.wishSalary = wishSalary;
		this.profession = profession;
	}

	public Worker() {
		this(null, null, null, false, 0, 0, 0);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public boolean isDeegre() {
		return deegre;
	}

	public void setDeegre(boolean deegre) {
		this.deegre = deegre;
	}

	public int getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(int workExperience) {
		this.workExperience = workExperience;
	}

	public int getCreatedDocumentalFilms() {
		return createdDocumentalFilms;
	}

	public void setCreatedDocumentalFilms(int createdDocumentalFilms) {
		this.createdDocumentalFilms = createdDocumentalFilms;
	}

	public int getWishSalary() {
		return wishSalary;
	}

	public void setWishSalary(int wishSalary) {
		this.wishSalary = wishSalary;
	}

}

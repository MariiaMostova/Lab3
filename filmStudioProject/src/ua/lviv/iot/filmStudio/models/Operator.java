package ua.lviv.iot.filmStudio.models;

public class Operator extends Worker {

	private boolean ownCamera;

	public Operator(String firstName, String lastName, String profession, boolean deegre, int workExperience,
			int createdDocumentalFilms, int wishSalary, boolean ownCamera) {
		super(firstName, lastName, profession, deegre, workExperience, createdDocumentalFilms, wishSalary);
		this.ownCamera = ownCamera;
	}

	public Operator(String firstName, String lastName, String profession, boolean deegre, int workExperience,
			int createdDocumentalFilms, int wishSalary) {
		this(firstName, lastName, profession, deegre, workExperience, createdDocumentalFilms, wishSalary, false);
	}

	public Operator() {
		this(null, null, null, false, 0, 0, 0, false);
	}

	public boolean isOwnCamera() {
		return ownCamera;
	}

	public void setOwnCamera(boolean ownCamera) {
		this.ownCamera = ownCamera;
	}

}

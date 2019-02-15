package ua.lviv.iot.filmStudio.models;

public class Decorator extends Worker {

	private boolean makingLandscape;
	private boolean makingRoom;

	public Decorator(String firstName, String lastName, String profession, boolean deegre, int workExperience,
			int createdDocumentalFilms, int wishSalary, boolean makingLandscape, boolean makingRoom) {
		super(firstName, lastName, profession, deegre, workExperience, createdDocumentalFilms, wishSalary);
		this.makingLandscape = makingLandscape;
		this.makingRoom = makingRoom;
	}

	public boolean isMakingLandscape() {
		return makingLandscape;
	}

	public void setMakingLandscape(boolean makingLandscape) {
		this.makingLandscape = makingLandscape;
	}

	public boolean isMakingRoom() {
		return makingRoom;
	}

	public void setMakingRoom(boolean makingRoom) {
		this.makingRoom = makingRoom;
	}

}
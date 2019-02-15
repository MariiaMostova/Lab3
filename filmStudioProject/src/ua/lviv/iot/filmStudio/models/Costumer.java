package ua.lviv.iot.filmStudio.models;

public class Costumer extends Worker {

	private Clothes typeClothes;
	private Style styleClothes;

	public Costumer(String firstName, String lastName, String profession, boolean deegre, int workExperience,
			int createdDocumentalFilms, int wishSalary, Clothes typeClothes, Style styleClothes) {
		super(firstName, lastName, profession, deegre, workExperience, createdDocumentalFilms, wishSalary);
		this.typeClothes = typeClothes;
		this.styleClothes = styleClothes;
	}

	public Costumer(String firstName, String lastName, String profession, boolean deegre, int workExperience,
			int createdDocumentalFilms, int wishSalary) {
		this(firstName, lastName, profession, deegre, workExperience, createdDocumentalFilms, wishSalary, null, null);
	}

	public Costumer() {
		this(null, null, null, false, 0, 0, 0, null, null);
	}

	public Clothes getTypeClothes() {
		return typeClothes;
	}

	public void setTypeClothes(Clothes typeClothes) {
		this.typeClothes = typeClothes;
	}

	public Style getStyleClothes() {
		return styleClothes;
	}

	public void setStyleClothes(Style styleClothes) {
		this.styleClothes = styleClothes;
	}

}

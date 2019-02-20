package main.java.ua.lviv.iot.filmstudio.models;

public class Costumer extends Worker {

  private Clothes typeClothes;
  private Style styleClothes;

  public Costumer(final String firstName, final String lastName, final String profession,
          final boolean deegre, final int workExperience, final int createdDocumentalFilms, 
          final int wishSalary, final Clothes typeClothes, final Style styleClothes) {
    super(firstName, lastName, profession, deegre, workExperience, createdDocumentalFilms,
            wishSalary);
    this.typeClothes = typeClothes;
    this.styleClothes = styleClothes;
  }

  public Clothes getTypeClothes() {
    return typeClothes;
  }

  public void setTypeClothes(final Clothes typeClothes) {
    this.typeClothes = typeClothes;
  }

  public Style getStyleClothes() {
    return styleClothes;
  }

  public void setStyleClothes(final Style styleClothes) {
    this.styleClothes = styleClothes;
  }

}

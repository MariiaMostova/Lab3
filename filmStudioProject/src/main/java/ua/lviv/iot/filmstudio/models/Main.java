package main.java.ua.lviv.iot.filmstudio.models;

import java.util.ArrayList;
import java.util.List;

import main.java.ua.lviv.iot.filmstudio.managers.FilmStudioManager;

public class Main {

  public static void main(final String[] args) {

    List<Worker> documentalFilmCasting = new ArrayList<Worker>();
    final FilmStudioManager mainManager = new FilmStudioManager(documentalFilmCasting);

    final Worker annaCinema = new Director("Anna", "Cinema", "Director", true, 5, 2, 50_000, 
            Scenario.INSOMNIA);
    final Worker andrewCoala = new Operator("Andrew", "Coala", "Operator", false, 10, 3, 45_000,
            true);
    final Worker evelinHolla = new Actor("Evelin", "Holla", "Actor", true, 12, 1, 70_000, 
            Roles.DETECTIVE);
    final Worker jackSmith = new Decorator("Jack", "Smith", "Decorator", false, 4, 0, 30_000, true, 
            true);
    final Worker maryParker = new Costumer("Mary", "Parker", "Costumer", true, 15, 7, 35_000, 
            Clothes.DRESS, Style.CASUAL);

    documentalFilmCasting.add(maryParker);
    documentalFilmCasting.add(annaCinema);
    documentalFilmCasting.add(andrewCoala);
    documentalFilmCasting.add(evelinHolla);
    documentalFilmCasting.add(jackSmith);

    mainManager.sortByExperienceDecrease(documentalFilmCasting);
    for (int i = 0; i < documentalFilmCasting.size(); i++) {
      System.out.println((i + 1) + " " + documentalFilmCasting.get(i).getFirstName() + " " 
          +  documentalFilmCasting.get(i).getLastName() + " " 
          + documentalFilmCasting.get(i).getProfession() + " " 
          + documentalFilmCasting.get(i).getWorkExperience());
    }
    System.out.println();
    
    mainManager.sortBySalaryIncrease(documentalFilmCasting);
    for (int i = 0; i < documentalFilmCasting.size(); i++) {
      System.out.println((i + 1) + " " + documentalFilmCasting.get(i).getFirstName() + " " 
          + documentalFilmCasting.get(i).getLastName() + " " 
          + documentalFilmCasting.get(i).getProfession() + " " 
          + documentalFilmCasting.get(i).getWishSalary());
    }
    System.out.println();
    
    documentalFilmCasting = mainManager.findWorkers(documentalFilmCasting, "Director");
    for (int i = 0; i < documentalFilmCasting.size(); i++) {
      System.out.println((i + 1) + " " + documentalFilmCasting.get(i).getFirstName() + " " 
          + documentalFilmCasting.get(i).getLastName() + " " 
          + documentalFilmCasting.get(i).getProfession()  + " " 
          + documentalFilmCasting.get(i).getCreatedDocumentalFilms());
    }
    System.out.println();
    
  }
  
}

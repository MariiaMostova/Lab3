package ua.lviv.iot.filmStudio.models;

import java.util.ArrayList;
import java.util.List;
import ua.lviv.iot.filmStudio.managers.*;

public class Main {

	public static void main(String[] args) {

		        List<Worker> documentalFilmCasting = new ArrayList <Worker>();
				FilmStudioManager mainManager = new FilmStudioManager(documentalFilmCasting);

				Worker AnnaCinema = new Director("Anna", "Cinema", "Director", true, 5, 2, 50000, Scenario.INSOMNIA);
				Worker AndrewCoala = new Operator("Andrew", "Coala", "Operator", false, 10, 3, 45000, true);
				Worker EvelinHolla = new Actor("Evelin", "Holla", "Actor", true, 12, 1, 70000, Roles.DETECTIVE);
				Worker JackSmith = new Decorator("Jack", "Smith", "Decorator", false, 4, 0, 30000, true, true);
				Worker MaryParker = new Costumer("Mary", "Parker", "Costumer", true, 15, 7, 35000, Clothes.DRESS, Style.CASUAL);

				documentalFilmCasting.add(MaryParker);
				documentalFilmCasting.add(AnnaCinema);
				documentalFilmCasting.add(AndrewCoala);
				documentalFilmCasting.add(EvelinHolla);
				documentalFilmCasting.add(JackSmith);

				mainManager.sortByExperienceDecrease(documentalFilmCasting);
				for (int i = 0; i < documentalFilmCasting.size(); i++) {
				System.out.println((i +1) + " " + documentalFilmCasting.get(i).getFirstName() + " " + 
				documentalFilmCasting.get(i).getLastName() + " " + documentalFilmCasting.get(i).getProfession() + " " 
						+ documentalFilmCasting.get(i).getWorkExperience());
				}
				System.out.println();
				mainManager.sortBySalaryIncrease(documentalFilmCasting);
				for (int i = 0; i < documentalFilmCasting.size(); i++) {
					System.out.println((i +1) + " " + documentalFilmCasting.get(i).getFirstName() + " " + 
				documentalFilmCasting.get(i).getLastName() + " " + documentalFilmCasting.get(i).getProfession() + " "
							+ documentalFilmCasting.get(i).getWishSalary());
					}
					System.out.println();
				mainManager.findWorkers(documentalFilmCasting, "Actor");
				for (int i = 0; i < documentalFilmCasting.size(); i++) {
					System.out.println((i +1) + " " + documentalFilmCasting.get(i).getFirstName() + " " 
				+ documentalFilmCasting.get(i).getLastName() + " " + documentalFilmCasting.get(i).getProfession() + " " 
							+ documentalFilmCasting.get(i).getCreatedDocumentalFilms());
					}
					System.out.println();

	}

}

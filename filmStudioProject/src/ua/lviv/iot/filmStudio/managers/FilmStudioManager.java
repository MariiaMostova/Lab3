package ua.lviv.iot.filmStudio.managers;

import ua.lviv.iot.filmStudio.models.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FilmStudioManager {

	private List<Worker> workers;

	public FilmStudioManager(List<Worker> workers) {
		this.workers = workers;
	}

	public FilmStudioManager() {
		this(null);
	}

	public List<Worker> sortByExperienceIncrease(List<Worker> workers) {
		Comparator<Worker> experienceComparator = (Worker worker1, Worker worker2) -> worker1.getWorkExperience()
				- worker2.getWorkExperience();
		workers.sort(experienceComparator.reversed());
		return workers;
	}

	public List<Worker> sortByExperienceDecrease(List<Worker> workers) {
		workers.sort((Worker worker1, Worker worker2) -> worker1.getWorkExperience() - worker2.getWorkExperience());
		return workers;
	}

	public List<Worker> sortBySalaryIncrease(List<Worker> workers) {
		Comparator<Worker> salaryComparator = (Worker worker1, Worker worker2) -> worker1.getWishSalary()
				- worker2.getWishSalary();
		workers.sort(salaryComparator.reversed());
		return workers;
	}

	public List<Worker> sortBySalaryDecrease(List<Worker> workers) {
		workers.sort((Worker worker1, Worker worker2) -> worker1.getWishSalary() - worker2.getWishSalary());
		return workers;
	}

	public List<Worker> findWorkers(List<Worker> workers, String profession) {
		List<Worker> professionalWorkers = new ArrayList<Worker>();
		for (int i = 0; i < workers.size(); i++) {
			if (workers.get(i).getProfession() == profession) {
				professionalWorkers.add(workers.get(i));
			}
		}
		return professionalWorkers;
	}

	public List<Worker> getWorkers() {
		return workers;
	}

	public void setWorkers(List<Worker> workers) {
		this.workers = workers;
	}

}

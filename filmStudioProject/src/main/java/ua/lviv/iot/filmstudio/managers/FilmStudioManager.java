package ua.lviv.iot.filmstudio.managers;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import ua.lviv.iot.filmstudio.models.Worker;

public class FilmStudioManager {

  private List<Worker> workers;

  public List<Worker> sortByExperienceDecrease(List<Worker> workers) {
    Collections.sort(workers, Comparator.comparing(Worker::getWorkExperience).reversed());
    return workers;
  }

  public List<Worker> sortByExperienceIncrease(List<Worker> workers) {
    Collections.sort(workers, Comparator.comparing(Worker::getWorkExperience));
    return workers;
  }

  public List<Worker> sortBySalaryDecrease(List<Worker> workers) {
    Collections.sort(workers, Comparator.comparing(Worker::getWishSalary).reversed());
    return workers;
  }

  public List<Worker> sortBySalaryIncrease(List<Worker> workers) {
    Collections.sort(workers, Comparator.comparing(Worker::getWishSalary));
    return workers;
  }

  public List<Worker> findWorkers(final List<Worker> workers, final String profession) {
    return workers.stream().filter(worker -> worker.getProfession()
           .equals(profession)).collect(Collectors.toList());
  }

  public List<Worker> getWorkers() {
    return workers;
  }

  public void setWorkers(final List<Worker> workers) {
    this.workers = workers;
  }

}

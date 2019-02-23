package ua.lviv.iot.filmstudio.managers;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.filmstudio.managers.FilmStudioManager;
import ua.lviv.iot.filmstudio.models.Actor;
import ua.lviv.iot.filmstudio.models.Clothes;
import ua.lviv.iot.filmstudio.models.Costumer;
import ua.lviv.iot.filmstudio.models.Decorator;
import ua.lviv.iot.filmstudio.models.Director;
import ua.lviv.iot.filmstudio.models.Operator;
import ua.lviv.iot.filmstudio.models.Roles;
import ua.lviv.iot.filmstudio.models.Scenario;
import ua.lviv.iot.filmstudio.models.Style;
import ua.lviv.iot.filmstudio.models.Worker;


public class FilmStudioManagerTest {
    
  private FilmStudioManager filmStudioManager;
  private List<Worker> workers;

  @BeforeEach
  public void setUp() {
    filmStudioManager = new FilmStudioManager();
    workers = new ArrayList<Worker>();
    workers.add(new Actor("Emma", "Coala", "Actor", false, 10, 3, 45_000,
            Roles.DETECTIVE));
    workers.add(new Director("Anna", "Cinema", "Director", false, 30, 3, 60_000,
            Scenario.DIRTY_HARRY));
    workers.add(new Decorator("Andrew", "Coala", "Decorator", false, 13, 3, 5_000,
            true, true));
    workers.add(new Costumer("Emma", "Cinema", "Costumer", false, 5, 3, 14_000,
            Clothes.JACKET, Style.CLASSIC));
    workers.add(new Operator("Andrew", "Coala", "Operator", false, 7, 3, 15_000,
            true));
    workers.add(new Operator("Emma", "Cinema", "Operator", false, 2, 3, 27_000,
            true));
  }
    
  @Test 
  public void testSortBySalaryIncrease() {
    List<Worker> resultList;
    resultList = filmStudioManager.sortBySalaryIncrease(workers);
    Assertions.assertEquals(5_000, resultList.get(0).getWishSalary());
    Assertions.assertEquals(14_000, resultList.get(1).getWishSalary());
    Assertions.assertEquals(15_000, resultList.get(2).getWishSalary());
    Assertions.assertEquals(27_000, resultList.get(3).getWishSalary());
    Assertions.assertEquals(45_000, resultList.get(4).getWishSalary());
    Assertions.assertEquals(60_000, resultList.get(5).getWishSalary());
  }
    
  @Test 
  public void testSortBySalaryDecrease() {
    List<Worker> resultList;
    resultList = filmStudioManager.sortBySalaryDecrease(workers);
    Assertions.assertEquals(60_000, resultList.get(0).getWishSalary());
    Assertions.assertEquals(45_000, resultList.get(1).getWishSalary());
    Assertions.assertEquals(27_000, resultList.get(2).getWishSalary());
    Assertions.assertEquals(15_000, resultList.get(3).getWishSalary());
    Assertions.assertEquals(14_000, resultList.get(4).getWishSalary());
    Assertions.assertEquals(5_000, resultList.get(5).getWishSalary());
  }
    
  @Test 
  public void testSortByExperienceIncrease() {
    List<Worker> resultList = new ArrayList<Worker>();
    resultList = filmStudioManager.sortByExperienceIncrease(workers);
    Assertions.assertEquals(2, resultList.get(0).getWorkExperience());
    Assertions.assertEquals(5, resultList.get(1).getWorkExperience());
    Assertions.assertEquals(7, resultList.get(2).getWorkExperience());
    Assertions.assertEquals(10, resultList.get(3).getWorkExperience());
    Assertions.assertEquals(13, resultList.get(4).getWorkExperience());
    Assertions.assertEquals(30, resultList.get(5).getWorkExperience());
  }
    
  @Test 
  public void testSortByExperienceDecrease() {
    List<Worker> resultList = new ArrayList<Worker>();
    resultList = filmStudioManager.sortByExperienceDecrease(workers);
    Assertions.assertEquals(30, resultList.get(0).getWorkExperience());
    Assertions.assertEquals(13, resultList.get(1).getWorkExperience());
    Assertions.assertEquals(10, resultList.get(2).getWorkExperience());
    Assertions.assertEquals(7, resultList.get(3).getWorkExperience());
    Assertions.assertEquals(5, resultList.get(4).getWorkExperience());
    Assertions.assertEquals(2, resultList.get(5).getWorkExperience());
  }
    
  @Test 
  public void testfindWorkers() {
    Assertions.assertEquals(0, filmStudioManager.findWorkers(workers, "Manager").size());
    Assertions.assertEquals(1, filmStudioManager.findWorkers(workers, "Director").size());
    Assertions.assertEquals(2, filmStudioManager.findWorkers(workers, "Operator").size());
  }
}

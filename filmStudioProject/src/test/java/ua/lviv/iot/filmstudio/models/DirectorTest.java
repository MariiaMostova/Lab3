package ua.lviv.iot.filmstudio.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DirectorTest {

  private Director director;

  @BeforeEach
   void setUp() {
    director = new Director("John", "Smith", "Director", true, 3, 2, 40_000, Scenario.INSOMNIA);
  }
              
  @Test
  public void testGetHeaders() {
    Assertions.assertEquals(director.getHeaders(), "First name, last name, profession, deegre, "
                + "work experience, created documental films, wish salary, written scenario");
  }
              
  @Test
  public void testToCSV() {
    Assertions.assertEquals(director.toCSV(), "John, Smith, Director, true, 3, 2, 40000, INSOMNIA");
  }
    
}

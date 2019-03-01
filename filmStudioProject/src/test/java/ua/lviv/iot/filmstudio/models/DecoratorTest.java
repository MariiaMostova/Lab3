package ua.lviv.iot.filmstudio.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DecoratorTest {

  private Decorator decorator;

  @BeforeEach
    void setUp() {
    decorator = new Decorator("Max", "Black", "Decorator", true, 3, 2, 35_000, true, true);
  }
            
  @Test
  public void testGetHeaders() {
    Assertions.assertEquals(decorator.getHeaders(), "First name, last name, profession, deegre, "
              + "work experience, created documental films, wish salary, making landscape,"
              + " making room");
  }
            
  @Test
  public void testToCSV() {
    Assertions.assertEquals(decorator.toCSV(), "Max, Black, Decorator, true, 3, 2, 35000, true,"
            + " true");
  }
    
}

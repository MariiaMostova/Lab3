package ua.lviv.iot.filmstudio.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CostumerTest {    
    
  private Costumer costumer;

  @BeforeEach
  public void setUp() {
    costumer = new Costumer("Anna", "Hola", "Costumer", true, 3, 2, 30_000, Clothes.DRESS,
            Style.CLASSIC);
  }
          
  @Test
  public void testGetHeaders() {
    Assertions.assertEquals(costumer.getHeaders(), "First name, last name, profession, deegre, "
              + "work experience, created documental films, wish salary, type of clothes,"
              + " style of clothes");
  }
          
  @Test
  public void testToCSV() {
    Assertions.assertEquals(costumer.toCSV(), "Anna, Hola, Costumer, true, 3, 2, 30000, DRESS,"
            + " CLASSIC");
  }
  
}

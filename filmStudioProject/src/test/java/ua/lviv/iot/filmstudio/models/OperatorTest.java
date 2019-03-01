package ua.lviv.iot.filmstudio.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OperatorTest {

  private Operator operator;

  @BeforeEach
   void setUp() {
    operator = new Operator("Kate", "Middle", "Operator", true, 3, 2, 45_000, true);
  }
                
  @Test
  public void testGetHeaders() {
    Assertions.assertEquals(operator.getHeaders(), "First name, last name, profession, deegre, "
                  + "work experience, created documental films, wish salary, own camera");
  }
                
  @Test
  public void testToCSV() {
    Assertions.assertEquals(operator.toCSV(), "Kate, Middle, Operator, true, 3, 2, 45000, true");
  }
    
}

package ua.lviv.iot.filmstudio.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WorkerTest {

  private Worker worker;

  @BeforeEach
  public void setUp() {
    worker = new Worker("Andrew", "Camel", "Manager", false, 1, 2, 20_000);
  }
    
  @Test
  public void testGetHeaders() {
    Assertions.assertEquals(worker.getHeaders(), 
            "First name, last name, profession, deegre, work experience, created documental films,"
            + " wish salary");
  }
    
  @Test
  public void testToCSV() {
    Assertions.assertEquals("Andrew, Camel, Manager, false, 1, 2, 20000", worker.toCSV());
  }
    
}

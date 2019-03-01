package ua.lviv.iot.filmstudio.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ActorTest {
    
  private Actor actor;

  @BeforeEach
  public void setUp() {
    actor = new Actor("Anna", "Hola", "Actor", true, 3, 2, 30_000, Roles.DETECTIVE);
  }
        
  @Test
  public void testGetHeaders() {
    Assertions.assertEquals(actor.getHeaders(), "First name, last name, profession, deegre, "
            + "work experience, created documental films, wish salary, role");
  }
        
  @Test
  public void testToCSV() {
    Assertions.assertEquals(actor.toCSV(), "Anna, Hola, Actor, true, 3, 2, 30000, DETECTIVE");
  }
        
}

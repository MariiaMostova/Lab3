package ua.lviv.iot.filmstudio.models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WorkerWriterTest {

  private List<Worker> workers;
  private WorkerWriter workerWriter;
  
  @BeforeEach
  public void setUp() {
    workers = new ArrayList<Worker>();
    workerWriter = new WorkerWriter("workpath");
    workers.add(new Actor("Anna", "Hola", "Actor", true, 3, 2, 30_000, Roles.DETECTIVE));
    workers.add(new Costumer("Anna", "Hola", "Costumer", true, 3, 2, 30_000, Clothes.DRESS,
            Style.CLASSIC));
    workers.add(new Decorator("Max", "Black", "Decorator", true, 3, 2, 35_000, true, true));
    workers.add(new Director("John", "Smith", "Director", true, 3, 2, 40_000, Scenario.INSOMNIA));
    workers.add(new Operator("Kate", "Middle", "Operator", true, 3, 2, 45_000, true));  
  }
      
  @Test
  public void testWriteToFile() throws IOException {
    workerWriter.writeToFile(workers);
    File file = new File("workersList");
    
    try (FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader bufReader = new BufferedReader(isr);) {
        
        String headerLine;
        String csvLine;
        int i = 0;
        while((headerLine = bufReader.readLine()) != null
                && (csvLine = bufReader.readLine()) != null) {
            Assertions.assertEquals(workers.get(i).getHeaders(), headerLine);
            Assertions.assertEquals(workers.get(i).toCSV(), csvLine);
            i++;
        }
      
      } 
    
  }
      
}

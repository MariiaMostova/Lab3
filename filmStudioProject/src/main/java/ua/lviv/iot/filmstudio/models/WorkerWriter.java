package ua.lviv.iot.filmstudio.models;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

public class WorkerWriter {
    
  private String path;

  public WorkerWriter(String path) {
      this.path = path;
  }

public void writeToFile(List<Worker> workers) throws IOException {
      
    File workerFile = new File(path); 
    
    try (FileOutputStream fos = new FileOutputStream(workerFile);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bufWriter = new BufferedWriter(osw);) {
        
      for (int i = 0; i < workers.size(); i++) {
        bufWriter.write(workers.get(i).getHeaders());
        bufWriter.newLine();
        bufWriter.write(workers.get(i).toCSV());
        bufWriter.newLine();
      }
      
    }
  }
    
}

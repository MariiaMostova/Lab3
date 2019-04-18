package ua.lviv.iot.filmstudio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.filmstudio.models.Worker;

@RestController
public class WorkerController {
 
 @Autowired
 private WorkerRepository workerRepository;

 @RequestMapping(value = "/worker", method = RequestMethod.GET)
 public List<Worker> getWorkers() {
  return (List<Worker>) workerRepository.findAll();
 }
 
 @RequestMapping(value = "//{id}", method = RequestMethod.GET)
 public Worker getWorker(@PathVariable Integer id) {
  return workerRepository.findById(id).get();
 }

 @RequestMapping(value = "/worker", method = RequestMethod.POST)
 public void postWorker(@RequestBody Worker worker) {
     workerRepository.save(worker);
 }
 
 @RequestMapping(value = "/worker/{id}", method = RequestMethod.PUT)
 public void updateWorker(@RequestBody Worker worker, @PathVariable Integer id) {
     workerRepository.save(worker);
 }
 
 @RequestMapping(value = "/worker/{id}", method = RequestMethod.DELETE)
 public void deleteWorker(@PathVariable Integer id) {
     workerRepository.deleteById(id);;
 }
}


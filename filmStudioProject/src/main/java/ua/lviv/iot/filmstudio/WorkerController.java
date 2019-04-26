package ua.lviv.iot.filmstudio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.filmstudio.models.Worker;

@RestController
public class WorkerController {

    @Autowired
    private WorkerRepository workerRepository;

    @GetMapping(value = "/worker")
    public List<Worker> getWorker() {
        return (List<Worker>) workerRepository.findAll();
    }

    @GetMapping(value = "/worker/{id}")
    public Worker getWorker(@PathVariable Integer id) {
        return workerRepository.findById(id).get();
    }

    @PostMapping(value = "/worker")
    public void postWorker(@RequestBody Worker worker) {
        workerRepository.save(worker);
    }

    @PutMapping(value = "/worker/{id}")
    public Worker updateWorker(@RequestBody Worker newWorker, @PathVariable Integer id) {
        Optional<Worker> workerOne = workerRepository.findById(id);
        Worker worker = workerOne.get();
        worker.setFirstName(newWorker.getFirstName());
        worker.setLastName(newWorker.getLastName());
        worker.setProfession(newWorker.getProfession());
        worker.setDeegre(newWorker.isDeegre());
        worker.setCreatedDocumentalFilms(newWorker.getCreatedDocumentalFilms());
        worker.setWishSalary(newWorker.getWishSalary());
        worker.setWorkExperience(newWorker.getWorkExperience());
        return workerRepository.save(newWorker);
    }

    @DeleteMapping(value = "/worker/{id}")
    public void deleteWorker(@PathVariable Integer id) {
        workerRepository.deleteById(id);
        ;
    }
}

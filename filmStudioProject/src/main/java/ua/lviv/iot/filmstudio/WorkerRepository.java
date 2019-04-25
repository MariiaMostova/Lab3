package ua.lviv.iot.filmstudio;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import ua.lviv.iot.filmstudio.models.Worker;

public interface WorkerRepository 
    extends CrudRepository<Worker, Integer> {

    Optional<Worker> findById(Long id);
}

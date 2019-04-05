package ua.lviv.iot.filmstudio;

import org.springframework.data.repository.CrudRepository;
import ua.lviv.iot.filmstudio.models.Worker;

public interface WorkerRepository 
    extends CrudRepository<Worker, Integer> {

}

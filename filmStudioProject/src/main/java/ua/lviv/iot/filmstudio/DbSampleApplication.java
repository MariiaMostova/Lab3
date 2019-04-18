package ua.lviv.iot.filmstudio;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ua.lviv.iot.filmstudio.models.Worker;

@SpringBootApplication
public class DbSampleApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(DbSampleApplication.class, args);
    }

    @Bean
    public CommandLineRunner filmStudioProject(WorkerRepository repository) {
        return (args) -> {
            repository.save(new Worker("Anna", "Cinema", "Director", false, 30, 3, 60_000));
            repository.save(new Worker("Kate", "Richy", "Operator", true, 40, 1, 75_000));
            repository.save(new Worker("Iryna", "Royal", "Actor", false, 30, 3, 40_000));
            repository.findAll().forEach(Worker -> System.out.println(Worker));
        }; 
        
    }
}
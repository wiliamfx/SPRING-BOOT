package TareaApp.Tarea1;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Casa.Casa;


@SpringBootApplication
public class Tarea1Application {

	public static void main(String[] args) {
		SpringApplication.run(Tarea1Application.class, args);
         Casa chicosATE=new Casa();
		
		chicosATE.realizar_prueba();
	}
	
	
	
	

}

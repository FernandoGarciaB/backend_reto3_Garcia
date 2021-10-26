<<<<<<< HEAD
//1. Modelo
//2. Interface
//3. Repositorio
//4. Servicios
//5. Controlador o Web


// Categoria, Finca,Cliente,Mensaje y Reservacion

package Reto3;


=======
package Reto3;

>>>>>>> 008d51bb633db8d7a6933dc669e49c314ce2abf8
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"Reto3.Modelo"})
public class Reto3Application {

    public static void main(String[] args) {
        SpringApplication.run(Reto3Application.class, args);
    }

}

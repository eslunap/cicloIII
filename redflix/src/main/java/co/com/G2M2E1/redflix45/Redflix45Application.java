package co.com.G2M2E1.redflix45;

import co.com.G2M2E1.redflix45.vistas.RedflixFrame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("co.com.G2M2E1.redflix45")
public class Redflix45Application {

	public static void main(String[] args) {
		//
               // System.out.println("Hello World");
               new RedflixFrame().setVisible(true);
	}
        
        public static void runSpringServer(String[] args) {
            /*
            ConfigurableApplicationContext ctx = new SpringApplicationBuilder(Application.class)
                    .headless(false).run(args);
            */
            SpringApplication.run(Redflix45Application.class, args);
            //SpringApplication.run(ArtApplication.class, args);
        }

}

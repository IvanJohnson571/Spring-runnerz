package johnson.ivan.runnerz;

import johnson.ivan.runnerz.run.Location;
import johnson.ivan.runnerz.run.Run;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.*;
import java.time.temporal.*;

@SpringBootApplication
public class RunnersApplication {

	private static final Logger log = LoggerFactory.getLogger(RunnersApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(RunnersApplication.class, args);

	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			Run run = new Run(1, "First Run",
					LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS),
					5, Location.OUTDOOR);
            log.info("Run{}", run);
		};
	}

}

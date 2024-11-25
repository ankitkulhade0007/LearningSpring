package com.LearningSpring;

import com.LearningSpring.config.ApplicationConfiguration;
import com.LearningSpring.model.Song;
import com.LearningSpring.service.VehicleService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		var context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		/*var vehicleServices = context.getBean(VehicleService.class);
		System.out.println(vehicleServices.getClass());
		Song song = new Song();
		song.setTitle("Blank Space");
		song.setSingerName("Taylor Swift");
		boolean vehicleStarted = true;
		String moveVehicleStatus = vehicleServices.moveVehicle(vehicleStarted);
		String playMusicStatus = vehicleServices.playMusic(vehicleStarted,song);
		String applyBrakeStatus = vehicleServices.applyBrake(vehicleStarted);*/
	}

}

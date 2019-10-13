package com.example.demo;

import com.example.demo.Models.Game;
import com.example.demo.Models.GamerGroup;
import com.example.demo.Models.GamerGroupGame;
import com.example.demo.Models.dbtest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);




		Game test = new Game();
		test.setName("test");
		test.setDescription("hope this works");
		GamerGroup gamerGroup = new GamerGroup();
		GamerGroupGame test123 = new GamerGroupGame(test,gamerGroup);
		test123.setPlaystyle("fun");
		dbtest dbtest = new dbtest();
		dbtest.getRepogames().save(test123);


	}

}

package com.example.gitActionCICDTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitActionCicdTestApplication {

	@GetMapping("/hello")
	public String helloWorld(){
		return "Hello World";
	}

//	echo "# gitActionCICDTest" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/Ahaz-code/gitActionCICDTest.git
//	git push -u origin main
	public static void main(String[] args) {
		SpringApplication.run(GitActionCicdTestApplication.class, args);
	}

}

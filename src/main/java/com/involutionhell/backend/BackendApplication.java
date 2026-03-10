package com.involutionhell.backend;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		// 读取项目根目录下的 .env.local 文件并加载到系统环境变量中
		Dotenv dotenv = Dotenv.configure()
				.filename(".env.local")
				.ignoreIfMissing()
				.load();
		dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(), entry.getValue()));

		SpringApplication.run(BackendApplication.class, args);
	}

}

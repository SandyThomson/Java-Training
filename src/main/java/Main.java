package main.java;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Main {

	final Logger logger = LoggerFactory.getLogger(Main.class);

	@Autowired
	private FileObfuscatorService service;

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-config.xml");

		Main m = context.getBean(Main.class);
		m.start(args);
	}

	private void start(String[] args) {
		String inputFile = args[0];
		String outputFile = args[1];

		if (!new File(inputFile).exists()) {

		}

		service.obfuscateFile(inputFile, outputFile);

	}

}

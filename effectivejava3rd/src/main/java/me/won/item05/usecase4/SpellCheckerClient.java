package me.won.item05.usecase4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpellCheckerClient {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
		SpellChecker spellChecker = applicationContext.getBean(SpellChecker.class);
		spellChecker.isValid("hello");
	}

}

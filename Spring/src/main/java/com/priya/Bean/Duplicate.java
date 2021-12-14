package com.priya.Bean;
import org.springframework.stereotype.Component;

@Component
public class Duplicate implements MobileProcessor {

	public void process() {
		System.out.println("Duplicate");
	}

}

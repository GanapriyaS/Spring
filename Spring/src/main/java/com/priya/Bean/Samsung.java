package com.priya.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// Annotation Component Autowired Primary Qualifier
@Component("samsung")
public class Samsung {
	
//	Autowired check return type of bean, Qualifier to use inplace of primary
	@Autowired
	@Qualifier("duplicate")
	MobileProcessor cpu;
	
	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config() {
		System.out.println("Samsung");
		cpu.process();
	}

}
package com.priya.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// mixed configuration as tyre xml and car annotations
// id will be car => non qualified and non capitalised
@Component
public class Car implements Vehicle{
//	Autowired annotation
	
	@Autowired
	private Tyre tyre;
	
	
	public Tyre getTyre() {
		return tyre;
	}


	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}


	public void drive() {
		System.out.println(tyre);
	}
}

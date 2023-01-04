package kr.co.ch02;

import org.springframework.stereotype.Component;

@Component
public class Speaker {
	
	public void soundUp() {
		System.out.println("Speaker sountUp...");
	}
	
	public void soundDown() {
		System.out.println("Speaker sountDown...");
	}
	
}

package com.developia.projectA;

import com.developia.projectB.HelloWorld;
import com.developia.projectC.HelloYoutube;

public class Main {
	public static void main(String[] args) {
		
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.print();
		
		HelloYoutube helloYoutube = new HelloYoutube();
		helloYoutube.print();
	}
}

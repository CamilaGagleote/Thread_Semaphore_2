package view;

import java.util.concurrent.Semaphore;

import controller.ThreadIntegra;

public class Main{ 

	public static void main(String[]args){
		Semaphore semaforo = new Semaphore(1);
		for(int i = 1; i < 22; i++){
			Thread tIntegra = new ThreadIntegra(i,semaforo) ;
			tIntegra.start();
		}
	}
}
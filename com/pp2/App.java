package com.pp2;

//Uso de interfaces
//Clase Runner1 implementa de Runnable
//run() metodo que ejecuta el hilo de la clase Runner1
class Runner1 implements Runnable {
	public void run() {
		for(int i=0; i<10;i++) {
			System.out.println("Runner 1: "+ i); 
			
		}
	}
}

//Clase Runner2 implementa de Runnable
//run() metodo que ejecuta el hilo de la clase Runner2
class Runner2 implements Runnable {
	public void run(){
		for(int i=0; i<10;i++) {
			System.out.println("Runner 2: "+ i); 
			
		}
	}
}

public class App {
	
	//Creacion de Hilos de las calses Runner1 y Runner1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1= new Thread(new Runner1());
		Thread t2= new Thread(new Runner2());
		
		/*.start() llama al metodo run() y permite el control de ejecucion
		 * de los hilos a partir de un tiempo de espera
		 */
		t1.start();
		t2.start();
	}

}

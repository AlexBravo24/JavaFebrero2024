package com;

public interface ITermometro {
	
	//Interface es un listado de metodos asbtractos
	//que una clase tendra implementar y definir
	//La interface por si sola ya es "abstracta y no necesita
	//el modificador "abstract"
	
	public void tomarTemperatura();{
		System.out.println("Temperatura normal");
		
		//Las interfaces nos sirven para simular la multiherencia en 
		//java 
		
		//De donde toman comportamiento los objetos?
		//1. De metodos propios de la clase
		//2.De metodos heredados de otra clase convencional o abstracta
		//3.De las interfaces
	
	}


}

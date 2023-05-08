package com.salesianostriana.dam.ejemplo01HolaMundo;

/*
 * Creamos un pequeño servicio que nos de algun producto o listado
 * como si estuvieramos consultando una base de datos que tdv no tenemos
 */
public class DummyService {

	public Producto getProducto() {
		return new Producto("Camiseta","¡Wena de verdad!",15.0f, 87, 91.1f);
	}
	
	public Producto getProductoSinAlgunosValores() {
		return new Producto("Otro producto", null, 1.0f);
	}
}

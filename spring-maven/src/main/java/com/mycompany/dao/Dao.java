package com.mycompany.dao;

import java.util.List;

/**
 * 
 * @author Enoque Felipe 
 * Interface dao genérica para todas as entidades
 */
public interface Dao<T> {

	/**
	 * 
	 * Método responsável por salvar os registros
	 * 
	 * @param Object
	 */
	public void cadastrar(T t);

	/**
	 * 
	 * Método responsável por editar os registros
	 * 
	 * @param Object
	 */
	public void editar(T t);

	/**
	 * 
	 * Método responsável por buscar uma lista de registros
	 * 
	 * @return List<Object>
	 */
	public List<T> listar();

	/**
	 * 
	 * Método responsável por remover um registro
	 * 
	 * @param Object
	 */
	public void remover(T t);

}
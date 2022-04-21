package com.alex.atos;

import java.util.List;

import com.alex.atos.*;

// TODO: Auto-generated Javadoc
/**
 * The Interface IClienteService.
 */
public interface IClienteService {

	/**
	 * Find all.
	 *
	 * @return the list
	 */
	public List<Cliente> findAll();
	
	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the cliente
	 */
	public Cliente findById(Long id);
	
	/**
	 * Save.
	 *
	 * @param cliente the cliente
	 * @return the cliente
	 */
	public Cliente save(Cliente cliente);
	
	/**
	 * Delete.
	 *
	 * @param id the id
	 */
	public void delete(Long id);

}

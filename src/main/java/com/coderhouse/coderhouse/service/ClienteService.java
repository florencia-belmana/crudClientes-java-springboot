package com.coderhouse.coderhouse.service;

import com.coderhouse.coderhouse.model.Cliente;

import java.util.List;

//DECLARAR LO QUE VOY A HACER EN EL SERVICE IMPLEMENT. crearr, listar etc
public interface ClienteService {



    Cliente buscarPorDni(Long dni);
    List<Cliente> buscarTodos();
    Cliente crear(Cliente cliente) throws Exception;
    Cliente actualizar(Cliente cliente) throws Exception;

}


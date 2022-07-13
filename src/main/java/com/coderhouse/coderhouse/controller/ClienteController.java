package com.coderhouse.coderhouse.controller;

import com.coderhouse.coderhouse.model.Cliente;
import com.coderhouse.coderhouse.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("coderhouse/clientes")
@RestController
public class ClienteController {

    @Autowired
    private ClienteService clienteService;


    @GetMapping("/all")
    public List<Cliente> obtenerClientes() {
        return clienteService.buscarTodos();
    }

    @GetMapping("/{dni}")
    public Cliente buscarClientePorDni(@PathVariable Long dni) {
        return clienteService.buscarPorDni(dni);
    }

    @PostMapping("/actualizar")
    public Cliente actualizarCliente(@RequestBody Cliente cliente) throws Exception {
        return clienteService.actualizar(cliente);
    }

    @PostMapping("/crear")
    public Cliente crearCliente(@RequestBody Cliente cliente) throws Exception {
        return clienteService.crear(cliente);
    }





}

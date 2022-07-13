package com.coderhouse.coderhouse.service;

import com.coderhouse.coderhouse.model.Cliente;
import com.coderhouse.coderhouse.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.List;


//ACA IMPLEMENTO LO QUE DECLARE EN EL CLIENTE SERVICE.
@Service
public class ClienteServiceImpl implements ClienteService {


    //NECESITO IMPLEMENTAR ESTA VAR DE INTERFACE CLIENTE(CLIENTEREPOSITORY)
    //UNA VEZ IMPLEMENTADO ESTO VOY A PODER UTILIZARLA Y SUS METODOS, ES DECIR .ClienteRepository
    @Autowired
    private ClienteRepository repository;


    @Override
    public Cliente buscarPorDni(Long dni) {
        return repository.findById(dni).orElse(null);
    }

    @Override
    public List<Cliente> buscarTodos() {
        return repository.findAll();
    }

    @Override
    public Cliente crear(Cliente cliente) throws Exception {
        if (buscarPorDni(cliente.getDni()) == null) {
            LocalDate anioNac = cliente.getFechaNacimiento().toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalDate();
            LocalDate anioActual = LocalDate.now();
            cliente.setEdad(Period.between(anioNac, anioActual).getYears());
            return repository.save(cliente);
        }
        else {
            throw new Exception( "Cliente ya existe");
        }
    }
    @Override
    public Cliente actualizar(Cliente cliente) throws Exception {
        if (buscarPorDni(cliente.getDni()) != null) {
            return repository.save(cliente);
        } else {
            throw new Exception( "Cliente no existe" );
        }

    }
}
package com.administracion.ganado.service;

import com.administracion.ganado.model.Productor;
import com.administracion.ganado.repository.ProductorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductorService {
    @Autowired
    private ProductorRepository repository;

    public List<Productor> listarTodos(){
        return repository.findAll();
    }

    public Productor guardar(Productor productor){
        if (productor.getSuperficie() == null || productor.getSuperficie()<=0){
            throw new RuntimeException("El productor debe tener una superficie valida.");
        }
        return repository.save(productor);
    }
}

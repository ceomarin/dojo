package com.ceomarin.listaestudiantes.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ceomarin.listaestudiantes.models.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact,Long>{

}

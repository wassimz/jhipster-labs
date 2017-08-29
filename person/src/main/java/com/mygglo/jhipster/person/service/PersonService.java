package com.mygglo.jhipster.person.service;

import com.mygglo.jhipster.person.domain.Person;
import com.mygglo.jhipster.person.service.dto.PersonDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Service Interface for managing Person.
 */
public interface PersonService {

    /**
     * Save a person.
     *
     * @param personDTO the entity to save
     * @return the persisted entity
     */
    PersonDTO save(PersonDTO personDTO);

    /**
     *  Get all the people.
     *
     *  @param pageable the pagination information
     *  @return the list of entities
     */
    Page<PersonDTO> findAll(Pageable pageable);

    /**
     *  Get the "id" person.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    PersonDTO findOne(Long id);

    /**
     *  Delete the "id" person.
     *
     *  @param id the id of the entity
     */
    void delete(Long id);

    void delete(List<Person> peoples);
}

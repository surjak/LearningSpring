package com.application.clinic.services;

import com.application.clinic.model.Owner;

import java.util.List;


public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
    List<Owner> findAllByLastNameLike(String lastName);


}

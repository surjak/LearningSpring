package com.application.clinic.services;

import com.application.clinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);


}

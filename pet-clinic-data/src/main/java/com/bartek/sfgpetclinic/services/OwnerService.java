package com.bartek.sfgpetclinic.services;

import com.bartek.sfgpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);



}

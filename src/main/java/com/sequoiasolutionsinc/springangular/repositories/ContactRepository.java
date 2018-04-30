package com.sequoiasolutionsinc.springangular.repositories;

import com.sequoiasolutionsinc.springangular.models.Contact;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

public interface ContactRepository extends CrudRepository<Contact, String> {
    @Override
    Optional<Contact> findById(String id);
    //Contact findById(String id);

    @Override
    void delete(Contact deleted);
}
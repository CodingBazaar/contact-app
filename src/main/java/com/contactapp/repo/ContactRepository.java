package com.contactapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.contactapp.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}

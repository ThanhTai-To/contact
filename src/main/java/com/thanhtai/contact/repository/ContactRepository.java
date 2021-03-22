package com.thanhtai.contact.repository;

import com.thanhtai.contact.domain.Contact;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends PagingAndSortingRepository<Contact, Long>, JpaSpecificationExecutor<Contact> {
}

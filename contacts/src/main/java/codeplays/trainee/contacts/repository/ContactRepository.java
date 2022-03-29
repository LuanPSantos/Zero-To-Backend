package codeplays.trainee.contacts.repository;

import codeplays.trainee.contacts.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact, Long> {

    List<Contact> findByNameContaining(String name);
}

package repository;

import entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository< User, Long> {

    // findBy + campul cautat din Entity
    // Avem campul "String name" in Entity, deci putem pune
    // findBy + Name
    // Asta inseamna practic
    // SELECT * FROM user WHERE name = numeCautat;
    List<User> findByName(String numeCautat);
    List<User> findByImage( String numeImagine);

}

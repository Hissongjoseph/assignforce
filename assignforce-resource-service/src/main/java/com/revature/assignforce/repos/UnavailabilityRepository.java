package com.revature.assignforce.repos;

import com.revature.assignforce.beans.Unavailability;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnavailabilityRepository extends JpaRepository<Unavailability, Integer> {

}

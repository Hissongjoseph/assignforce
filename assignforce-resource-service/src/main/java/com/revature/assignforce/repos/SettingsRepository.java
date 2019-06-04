package com.revature.assignforce.repos;

import com.revature.assignforce.beans.Settings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SettingsRepository extends JpaRepository<Settings, Integer>{

}

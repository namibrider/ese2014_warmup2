package org.sample.model.dao;

import org.sample.model.TeamName;
import org.springframework.data.repository.CrudRepository;

public interface TeamNameDao extends CrudRepository<TeamName,Long> {
   
    
}

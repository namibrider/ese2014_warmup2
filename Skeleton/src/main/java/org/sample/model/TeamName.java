package org.sample.model;

import java.sql.Date;
import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class TeamName implements java.io.Serializable{

    @Id
    @GeneratedValue
    private Long id;

    private String teamName;
    private Timestamp timeStampTeamCreation;
    
   
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    
    public Timestamp getTimeStampTeamCreation() {
        return timeStampTeamCreation;
    }

    public void setTimeStampTeamCreation() {
        java.util.Date date= new java.util.Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        this.timeStampTeamCreation = timestamp;
    }
	
	
}

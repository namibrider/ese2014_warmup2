package org.sample.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class TeamName implements java.io.Serializable{

    @Id
    @GeneratedValue
    private Long teamId;

    private String teamName;
    private Timestamp timeStampTeamCreation;
    
    //@OneToMany(cascade = {CascadeType.ALL}, mappedBy="userId")
    //private Set<User> users = new HashSet<User>(0);

  
   
    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
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

   //public Set<User> getUsers() {
   //     return users;
   // }

   // public void setUsers(Set<User> users) {
   //     this.users = users;
   // }
	
	
}

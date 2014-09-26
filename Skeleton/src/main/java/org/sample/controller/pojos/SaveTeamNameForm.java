/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.sample.controller.pojos;

import java.sql.Timestamp;
import java.util.Date;



/**
 *
 * @author namibrider
 */
public class SaveTeamNameForm {
    private Long id;    
    
    private Timestamp timeStampTeamCreation;          
    private String teamName;  
  

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
        Date date= new java.util.Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        this.timeStampTeamCreation = timestamp;
    }   
     
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}

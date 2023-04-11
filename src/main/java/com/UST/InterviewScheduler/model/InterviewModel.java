package com.UST.InterviewScheduler.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InterviewModel {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String skills;
    private String email;
    private String phoneno;
    private int experience;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-mm-yyyy")
    private Date date;
    private String time;
    private String link;
    private String poc;
}

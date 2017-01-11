package com.greenfox.exams.spring.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Viktor on 2017.01.11..
 */

@Entity
@Table(name = "feedbacks")
@Getter
@Setter
public class Feedback {

    @Id
    @GeneratedValue
    public long id;
    public String feedback;
    public int score;

    public Feedback(String feedback){
        this.feedback = feedback;
    }

}

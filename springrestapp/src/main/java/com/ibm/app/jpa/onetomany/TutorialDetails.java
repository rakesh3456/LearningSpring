package com.ibm.app.jpa.onetomany;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tutorial_details")
public class TutorialDetails {
    @Id
    private Long id;

    @Column
    private Date createdOn;

    @Column
    private String createdBy;

    //primary key and forg
    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "tutorial_id")
    private MyTutorial tutorial;

    public TutorialDetails() {
    }

    public TutorialDetails(String createdBy) {
        this.createdOn = new Date();
        this.createdBy = createdBy;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public MyTutorial getTutorial() {
        return tutorial;
    }

    public void setTutorial(MyTutorial tutorial) {
        this.tutorial = tutorial;
    }

}

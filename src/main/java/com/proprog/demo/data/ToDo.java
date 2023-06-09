package com.proprog.demo.data;

import org.springframework.data.annotation.Id;


public class ToDo {
    @Id
    private String id;
    private String title;
    private Boolean completed;


    public String getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }

    public Boolean getCompleted() {
        return completed;
    }

}

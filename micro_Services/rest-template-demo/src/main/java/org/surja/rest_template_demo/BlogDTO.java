package org.surja.rest_template_demo;

import java.util.Date;

public class BlogDTO {


    private Long id;

    private String title;

    private String body;

    private Date serverDateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getServerDateTime() {
        return serverDateTime;
    }

    public void setServerDateTime(Date serverDateTime) {
        this.serverDateTime = serverDateTime;
    }
}


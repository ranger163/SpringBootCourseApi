package me.inassar.springbootstarter.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TopicModel {

    @Id
    private String id;
    private String name;
    private String description;

    public TopicModel() {

    }

    TopicModel(String id, String name, String description) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
    }

    String getId() {
        return id;
    }

    void setId(String id) {
        this.id = id;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getDescription() {
        return description;
    }

    void setDescription(String description) {
        this.description = description;
    }

}

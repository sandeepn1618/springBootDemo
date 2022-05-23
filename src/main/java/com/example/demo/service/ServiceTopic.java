package com.example.demo.service;

import com.example.demo.model.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ServiceTopic {


    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic(1, "Java", "Java Tutorail"),
            new Topic(2, "Python", "Python Tutorail"),
            new Topic(3, "Selenium", "Selenium Tutorail"),
            new Topic(4, "Sandeep", "Sandeep Tutorail")
    ));

    public List<Topic> getAllTopics() {
        return topics;


    }

    public Topic getTopicById(int id) {
        return topics.stream().filter((o -> o.getId() == id)).findFirst().get();

    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(Topic topic, int id) {
        for (int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);
            if (t.getId() == id) {
                topics.set(i, topic);
                return;
            }
        }
    }

    public void deleteTopic(int id) {

        topics.removeIf(t->t.getId()==id);

    }

}

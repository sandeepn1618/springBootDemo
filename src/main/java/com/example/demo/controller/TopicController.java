package com.example.demo.controller;

import com.example.demo.model.Topic;
import com.example.demo.service.ServiceTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private ServiceTopic serviceTopic;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return serviceTopic.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable int id) {
        return serviceTopic.getTopicById(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/topics")
    public void  addTopic(@RequestBody Topic topic){
        serviceTopic.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/topics/{id}")
    public void  updateTopic(@RequestBody Topic topic ,@PathVariable  int id){
         serviceTopic.updateTopic(topic,id);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/topics/{id}")
    public void  deleteTopic(@PathVariable  int id){
        serviceTopic.deleteTopic(id);
    }
}

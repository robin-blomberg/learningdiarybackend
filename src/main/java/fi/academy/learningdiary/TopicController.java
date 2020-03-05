package fi.academy.learningdiary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class TopicController {
    @Autowired
    private TopicRepository tr;

    @GetMapping("")
    private List<Topic> listAllTopics(){
        return (List<Topic>) tr.findAll();
    }
    @GetMapping
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    private Topic findTopicUsingId(@PathVariable("id") Integer id){
        return tr.findByIdIs(id);
    }
    @DeleteMapping
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    private void deleteTopicUsingId(@PathVariable("id") Integer id){
        tr.delete(tr.findByIdIs(id));
    }
    @PostMapping
    @RequestMapping(method = RequestMethod.POST)
    private Topic addNewTopic(@RequestBody Topic t){
        tr.save(t);
        return t;
    }
    @PutMapping
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    private Topic uppdateTopic(@PathVariable("id") Integer id, @RequestBody Topic t){
        t.setId(id);
        tr.save(t);
        return t;
    }


}

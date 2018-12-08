package com.dylan.app.web.controller;

import com.dylan.app.web.model.Comments;
import com.dylan.app.web.model.Messages;
import com.dylan.app.web.repository.CommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/comments")
public class CommentsController {

    @Autowired
    private CommentsRepository commentsRepository;

    @GetMapping(value = "/all")
    public List<Comments> findAll() {
        return commentsRepository.findAll();
    }

    @PostMapping(value = "/add")
    public Messages add(@RequestBody Comments comments) {
        try {
            commentsRepository.save(comments);
            return new Messages(true);
        } catch (Exception e) {
            return new Messages(false);
        }
    }


}

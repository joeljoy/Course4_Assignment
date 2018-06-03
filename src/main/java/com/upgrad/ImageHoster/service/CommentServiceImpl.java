package com.upgrad.ImageHoster.service;

import com.upgrad.ImageHoster.common.CommentManager;
import com.upgrad.ImageHoster.model.Comment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    private CommentManager commentManager;

    public CommentServiceImpl() {
        this.commentManager = new CommentManager();
    }

    @Override
    public Comment createComment(Comment comment) {
        return commentManager.createComment(comment);
    }

    @Override
    public List<Comment> getAll() {
        return commentManager.getAllComments();
    }
}

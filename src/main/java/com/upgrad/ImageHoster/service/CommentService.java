package com.upgrad.ImageHoster.service;

import com.upgrad.ImageHoster.model.Comment;

import java.util.List;

public interface CommentService {
    Comment createComment(Comment comment);

    List<Comment> getAll();
}

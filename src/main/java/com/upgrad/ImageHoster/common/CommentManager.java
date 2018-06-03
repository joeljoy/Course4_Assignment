package com.upgrad.ImageHoster.common;

import com.upgrad.ImageHoster.model.Comment;
import org.hibernate.Session;

import java.util.List;

@SuppressWarnings("unchecked")
public class CommentManager extends SessionManager {

    public Comment createComment(Comment comment) {
        Session session = openSession();
        session.save(comment);
        commitSession(session);
        return comment;
    }

    public List<Comment> getAllComments() {
        Session session = openSession();
        List<Comment> comments = session.createCriteria(Comment.class).list();
        commitSession(session);
        return comments;
    }


}

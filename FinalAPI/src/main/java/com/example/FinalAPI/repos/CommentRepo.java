package com.example.FinalAPI.repos;

import com.example.FinalAPI.domain.Comment;

import java.util.List;

public interface CommentRepo {

    List<Comment>createComment(Comment comment);

    List<Comment>getCommentById(long id);

    List<Comment>getAllComments();

    List<Comment>getAllCommentsByPost(long postId);

    List<Comment>deleteComment(long id);

    List<Comment>updateComment(Comment comment);
}

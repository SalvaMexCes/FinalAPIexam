package com.example.FinalAPI.repos;

import com.example.FinalAPI.domain.Post;
import com.example.FinalAPI.domain.User;

import java.util.List;

public interface PostRepo {

    List<Post>createPost(Post post);

    List<Post>getPostById(Long id);

    List<Post>getAllPosts(Post post);

    List<Post>deletePost(Post post, Long id);

    List<Post>updatePost(Post post, Long id);

    List<Post>getPostByUserId(User user, Long UserId);

}

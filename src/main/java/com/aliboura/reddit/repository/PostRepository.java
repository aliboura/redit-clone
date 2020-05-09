package com.aliboura.reddit.repository;

import com.aliboura.reddit.model.Post;
import com.aliboura.reddit.model.Subreddit;
import com.aliboura.reddit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
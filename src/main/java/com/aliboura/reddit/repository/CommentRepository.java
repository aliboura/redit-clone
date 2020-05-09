package com.aliboura.reddit.repository;

import com.aliboura.reddit.model.Comment;
import com.aliboura.reddit.model.Post;
import com.aliboura.reddit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}

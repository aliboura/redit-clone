package com.aliboura.reddit.repository;

import com.aliboura.reddit.model.Post;
import com.aliboura.reddit.model.User;
import com.aliboura.reddit.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}

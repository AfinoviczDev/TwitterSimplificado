package dev.afinovicz.TwitterSimplificado.repositories;

import dev.afinovicz.TwitterSimplificado.entities.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TweetRepository extends JpaRepository<Tweet, Long> {
}

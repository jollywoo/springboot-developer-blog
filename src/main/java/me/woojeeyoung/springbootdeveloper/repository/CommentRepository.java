package me.woojeeyoung.springbootdeveloper.repository;

import me.woojeeyoung.springbootdeveloper.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}

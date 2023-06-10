package blog.backend;

import blog.backend.domain.Post;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Slf4j
@RestController
@Transactional
public class PostController {

    private final EntityManager entityManager;

    public PostController(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @PostMapping("/api/post")
    public Post createPost(@RequestBody Post post) {
        entityManager.persist(post);
        return post;
    }
}

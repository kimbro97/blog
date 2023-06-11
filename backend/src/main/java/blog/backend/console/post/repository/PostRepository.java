package blog.backend.console.post.repository;

import blog.backend.entity.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
@Transactional
@RequiredArgsConstructor
public class PostRepository {
    private final EntityManager entityManager;

    public Post save(Post post) {
        entityManager.persist(post);
        return post;
    }
}

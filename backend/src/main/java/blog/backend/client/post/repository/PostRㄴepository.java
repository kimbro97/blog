package blog.backend.client.post.repository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Slf4j
@Repository
@Transactional
@RequiredArgsConstructor
public class PostRㄴepository {
    private final EntityManager entityManager;
}

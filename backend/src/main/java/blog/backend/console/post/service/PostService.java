package blog.backend.console.post.service;

import blog.backend.console.post.repository.PostRepository;
import blog.backend.entity.Post;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public Post writer(Post post) {
        return postRepository.save(post);
    }
}

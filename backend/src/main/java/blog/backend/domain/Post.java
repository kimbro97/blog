package blog.backend.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;
    @Column(name = "content")
    private String content;

    public Post() {}

    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }
}

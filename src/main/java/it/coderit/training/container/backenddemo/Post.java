package it.coderit.training.container.backenddemo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "post")
@Getter
@Setter
@SequenceGenerator(
        name = "post_sq",
        sequenceName = "post_sq",
        initialValue = 1,
        allocationSize = 1
)
public class Post {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "post_sq")
    private Long id;

    @Column(name = "title", nullable = false, length = 255)
    private String title;

    @Column(name = "content", nullable = false, columnDefinition = "TEXT")
    private String content;

    @Column(name = "created", nullable = false)
    private LocalDateTime created = LocalDateTime.now();

}

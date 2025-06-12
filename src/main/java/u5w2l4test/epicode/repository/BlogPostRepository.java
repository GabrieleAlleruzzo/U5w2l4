package u5w2l4test.epicode.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import u5w2l4test.epicode.model.BlogPost;

public interface BlogPostRepository extends JpaRepository<BlogPost, Integer> {
}
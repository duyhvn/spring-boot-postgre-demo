package callicoder.com.postgredemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import callicoder.com.postgredemo.model.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}

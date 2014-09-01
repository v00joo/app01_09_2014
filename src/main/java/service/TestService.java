package service;

import model.LEinOC;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TestService {
    List<LEinOC> findById(long id);
}

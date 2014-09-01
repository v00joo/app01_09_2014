package service;

import model.LEinOC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.LEinOCRepository;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private LEinOCRepository repository;

    public List<LEinOC> findById(long id) {
        return repository.findById(id);
    }
}

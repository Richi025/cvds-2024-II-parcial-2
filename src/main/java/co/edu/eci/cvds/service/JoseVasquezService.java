package co.edu.eci.cvds.service;


import co.edu.eci.cvds.model.JoseVasquez;
import co.edu.eci.cvds.repository.JoseVasquezRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JoseVasquezService {

    private final JoseVasquezRepository joseVasquezRepository;

    @Autowired
    public JoseVasquezService(JoseVasquezRepository joseVasquezRepository) {
        this.joseVasquezRepository = joseVasquezRepository;
    }

    public List<JoseVasquez> getAllJoseVasquez() {
        return joseVasquezRepository.findAll();
    }
}

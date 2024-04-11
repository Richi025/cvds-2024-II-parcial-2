package co.edu.eci.cvds.service;

import co.edu.eci.cvds.model.MariaTorres;
import co.edu.eci.cvds.repository.MariaTorresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MariaTorresService {
    private final MariaTorresRepository mariaTorresRepository;

    @Autowired
    public MariaTorresService(MariaTorresRepository mariaTorresRepository) {
        this.mariaTorresRepository = mariaTorresRepository;
    }

    public List<MariaTorres> getAllMariaTorres() {
        return mariaTorresRepository.findAll();
    }

}
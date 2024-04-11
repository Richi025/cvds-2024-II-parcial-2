package co.edu.eci.cvds.repository;

import co.edu.eci.cvds.model.MariaTorres;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MariaTorresRepository extends JpaRepository<MariaTorres, String> {
    public List<MariaTorres> findByNumero(String numero);

}
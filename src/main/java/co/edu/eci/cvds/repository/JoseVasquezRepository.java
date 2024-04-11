package co.edu.eci.cvds.repository;

import co.edu.eci.cvds.model.JoseVasquez;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JoseVasquezRepository extends JpaRepository<JoseVasquez, String> {
    public List<JoseVasquez> findByPregunta(String pregunta);
}


package model.dao;

import model.entities.Produto;
import model.entities.Tipo;

import java.util.List;

public interface TipoDao {
    void insert(Tipo obj);
    void update(Tipo obj);
    void deleteById(Integer id);
    Tipo findById(Integer id);
    List<Tipo> findAll();
    List<Tipo> findByDepartment(Produto department);
}

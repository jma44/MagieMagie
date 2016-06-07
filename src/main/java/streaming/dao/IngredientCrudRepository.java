/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import streaming.entity.Ingredient;

/**
 *
 * @author ajc
 */
public interface IngredientCrudRepository extends CrudRepository<Ingredient, Long>
{
    public List<Ingredient> findAllByJoueurId(long id);
    
    public List<Ingredient> findAllByTypeIngredientAndJoueurId(Ingredient.Type type, long id);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.controller;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import streaming.entity.Ingredient;

/**
 *
 * @author ajc
 */
public interface IngredientCrudService extends CrudRepository<Ingredient, Long>
{
    
}

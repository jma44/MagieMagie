/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.concurrent.ThreadLocalRandom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streaming.dao.IngredientCrudRepository;
import streaming.dao.JoueurCrudRepository;
import streaming.entity.Ingredient;
import streaming.entity.Joueur;

/**
 *
 * @author ajc
 */
@Service
public class IngredientService 
{
    @Autowired
    private IngredientCrudRepository iCrud;
    
    @Autowired
    private JoueurCrudRepository jCrud;
    
    public Ingredient creationIngredientAleatoire(long id) 
    {
        Ingredient ingr = new Ingredient();
        
        ingr.setJoueur(jCrud.findOne(id));

        int i = ThreadLocalRandom.current().nextInt(1, 6);

        switch (i) {
            case 1:
                ingr.setTypeIngredient(Ingredient.Type.SANG_DE_VIERGE);
                break;
            case 2:
                ingr.setTypeIngredient(Ingredient.Type.AILE_DE_CHAUVE_SOURIS);
                break;
            case 3:
                ingr.setTypeIngredient(Ingredient.Type.BAVE_DE_CRAPAUD);
                break;
            case 4:
                ingr.setTypeIngredient(Ingredient.Type.CORNE_DE_LICORNE);
                break;
            case 5:
                ingr.setTypeIngredient(Ingredient.Type.LAPIS_LAZULI);
                break;
            default:
                break;
        }
        
        iCrud.save(ingr);
        
        return ingr;
    }

    public Ingredient creationIngredientSelonType(Ingredient.Type type, Joueur j)
    {
        Ingredient i = new Ingredient();
        i.setTypeIngredient(type);
        i.setJoueur(j);
        
        iCrud.save(i);
        
        return i;
    }
}

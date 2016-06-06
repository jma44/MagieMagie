/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streaming.entity.Ingredient;
import streaming.entity.Joueur;

/**
 *
 * @author ajc
 */
@Service
public class JoueurService 
{
    @Autowired
    private IngredientService iService; 
    
    public Joueur creerJoueur()
    {
        Joueur j = new Joueur();
        List<Ingredient> ingredients = new ArrayList<Ingredient>();
        
        for(int i = 0; i<7;i++)
        {
            ingredients.add(iService.creationIngredientAleatoire());
        }
        
        j.setIngredients(ingredients);
        
        return j;
    }
}

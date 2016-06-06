/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.concurrent.ThreadLocalRandom;
import streaming.entity.Ingredient;

/**
 *
 * @author ajc
 */
public class IngredientService {

    public Ingredient creationIngredientAleatoire() 
    {
        Ingredient ingr = new Ingredient();

        int i = ThreadLocalRandom.current().nextInt(1, 5);

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
        
        return ingr;
    }
}

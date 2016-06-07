/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
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
public class SortilegeService 
{
    @Autowired
    private IngredientService iService;
    
    @Autowired
    private IngredientCrudRepository iCrud;
    
    @Autowired
    private JoueurService jService;
    
    @Autowired
    private JoueurCrudRepository jCrud;
    
    public void invisibilite(long id)
    {
        Joueur j = jCrud.findOne(id);
        
        List<Ingredient> cornes = iCrud.findAllByTypeAndJoueurId(Ingredient.Type.CORNE_DE_LICORNE, j.getId());
        List<Ingredient> baves = iCrud.findAllByTypeAndJoueurId(Ingredient.Type.BAVE_DE_CRAPAUD, j.getId());
        
        if(cornes.size()>=1 && baves.size()>=1)
        {
            iCrud.delete(cornes.get(0));
            iCrud.delete(baves.get(0));
            
            List<Joueur> joueurs = (List<Joueur>) jCrud.findAll();
            
            for(Joueur joueur : joueurs)
            {
                if(joueur.getId()!= j.getId())
                {
                    int max = joueur.getIngredients().size();
                    
                    int i = ThreadLocalRandom.current().nextInt(0, max);
                    
                    joueur.getIngredients().get(i).setJoueur(j);
                    
                    iCrud.save(joueur.getIngredients().get(i));
                    
                }
            }
        }
    }
}

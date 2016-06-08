/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streaming.dao.JoueurCrudRepository;
import streaming.entity.Ingredient;
import streaming.entity.Joueur;

/**
 *
 * @author ajc
 */
@Service
public class JoueurService {

    @Autowired
    private IngredientService iService;

    @Autowired
    private JoueurCrudRepository jCrud;

    public void passageJoueurSuivant() {

        // Récup liste joueurs
        List<Joueur> joueurs = (List<Joueur>) jCrud.findAll();

        // Passe j actif à inactif
        int i;
        for (i = 0; i < joueurs.size(); i++) {
            if (joueurs.get(i).isActif()) {
                Joueur joueur = joueurs.get(i);
                joueur.setActif(false);
                jCrud.save(joueur);
                break;
            }
        }

        // Passe j suivant (ou au 1er si le j actif était le dernier)
        int iJoueurSuivant = 0;
        if (i < joueurs.size() - 1) {
            iJoueurSuivant = i + 1;
        }
        Joueur jSuiv = joueurs.get(iJoueurSuivant);
        jSuiv.setActif(true);
        jCrud.save(jSuiv);
    }

    public Joueur creerJoueur() {
        Joueur j = new Joueur();

        jCrud.save(j);

        List<Ingredient> ingredients = new ArrayList<Ingredient>();

        for (int i = 0; i < 7; i++) {
            ingredients.add(iService.creationIngredientAleatoire(j.getId()));

        }

        j.setIngredients(ingredients);
        j.setDateConnexion(new Date());
        j.setActif(false);

        return j;
    }
}

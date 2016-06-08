/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.controller;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import streaming.dao.IngredientCrudRepository;
import streaming.dao.JoueurCrudRepository;
import streaming.entity.Ingredient;
import streaming.entity.Joueur;
import streaming.service.IngredientService;
import streaming.service.JoueurService;

/**
 *
 * @author ajc
 */
@Controller
public class PlateauController {
    
    @Autowired
    private JoueurService jService;
    
    @Autowired
    private JoueurCrudRepository jCrud;    
    
    @Autowired
    private IngredientService iService;

    @Autowired
    private IngredientCrudRepository iCrud;    

    
    @RequestMapping(value = "/plateau", method = RequestMethod.GET)
    public String plateauGET(Model model, HttpSession session) {

        Joueur j = (Joueur)session.getAttribute("joueurActuel");
        
        // Recuperation de la liste des Joueurs
        List<Joueur> joueurs = (List<Joueur>) jCrud.findAll();

        model.addAttribute("listeJoueurs", joueurs);
        
        // Recuperation des cartes ingredient du Joueur actif
        List<Ingredient> ingredients = iCrud.findAllByJoueurId(j.getId());

        model.addAttribute("listeIngredient", ingredients);
        
        //test joueur actif
        System.out.println("********"+j.isActif());
        model.addAttribute("Actif", j.isActif());  
        
        return "plateau";          
    }
    
    @RequestMapping(value = "/ajax_rafraichir_nbre_cartes", method = RequestMethod.GET)
    public String rafraichirListeJoueurCartes(Model model) 
    {
        List<Joueur> joueurs = (List<Joueur>) jCrud.findAll();

        model.addAttribute("listeJoueurs", joueurs);
        
        return "_MENU_DROITE";
    }

    
    @RequestMapping(value = "/plateau/{idJoueur}", method = RequestMethod.POST)
    public String lancerSortPOST(Model model, @PathVariable("idJoueur") long idSorciere, @ModelAttribute("monJoueur") Joueur joueurActif) {  

        //Recuperation des 2 ingredients selectionne
        
        //Recuperation de la cible
        
        //Verification du sort correspondant aux ingredient selectionné
        
        return "plateau";
    }
    
}

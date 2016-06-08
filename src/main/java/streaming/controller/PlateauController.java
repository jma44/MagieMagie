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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import streaming.dao.IngredientCrudRepository;
import streaming.dao.JoueurCrudRepository;
import streaming.entity.Ingredient;
import streaming.entity.Joueur;
import static streaming.entity.Joueur_.ingredients;
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

    
    @RequestMapping(value = "/plateau/{idJoueur}", method = RequestMethod.GET)
    public String ajaxPlateauGET(Model model, @PathVariable("idJoueur") long idSorciere, HttpSession session) {

        // Recuperation de la liste des Joueurs
        List<Joueur> joueurs = (List<Joueur>) jCrud.findAll();

        model.addAttribute("listeJoueurs", joueurs);
        
        // Recuperation des cartes ingredient du Joueur actif
        List<Ingredient> ingredients = iCrud.findAllByJoueurId(idSorciere);

        model.addAttribute("listeIngredient", ingredients);
        
        //test joueur actif
        Joueur j = (Joueur)session.getAttribute("joueurActuel");
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
    
}

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import streaming.dao.IngredientCrudRepository;
import streaming.dao.JoueurCrudRepository;
import streaming.dto.SortDTO;
import streaming.entity.Ingredient;
import streaming.entity.Joueur;
import streaming.service.IngredientService;
import streaming.service.JoueurService;
import streaming.service.SortilegeService;

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
    private SortilegeService sService;

    @Autowired
    private IngredientCrudRepository iCrud;    

    @RequestMapping(value = "/ajax_passer_tour", method = RequestMethod.GET)
    public String ajaxPasserTour(){
        
        jService.passageJoueurSuivant();
        
        return "ajax_vide";
    }
    
    @RequestMapping(value = "/ajax_rafraichir_zone_actions", method = RequestMethod.GET)
    public String ajaxRafraichirZoneActions(Model model, HttpSession session) {

        Joueur j = (Joueur)session.getAttribute("joueurActuel");
        j=jCrud.findOne(j.getId());
        
        // Recuperation de la liste des Joueurs
        List<Joueur> joueurs = (List<Joueur>) jCrud.findAll();

        model.addAttribute("listeJoueurs", joueurs);
        
        // Recuperation des cartes ingredient du Joueur actif
        List<Ingredient> ingredients = iCrud.findAllByJoueurId(j.getId());

        model.addAttribute("listeIngredient", ingredients);
        
        SortDTO dto = new SortDTO();
        model.addAttribute("dto", dto);
        
        //test joueur actif
        System.out.println("********"+j.isActif());
        model.addAttribute("actif", j.isActif());  
        
        return "ajax_zone_actions";
    }
    
    @RequestMapping(value = "/plateau", method = RequestMethod.GET)
    public String plateauGET(Model model, HttpSession session) {

        Joueur j = (Joueur)session.getAttribute("joueurActuel");
        
        // Recuperation de la liste des Joueurs
        List<Joueur> joueurs = (List<Joueur>) jCrud.findAll();

        model.addAttribute("listeJoueurs", joueurs);
        
        // Recuperation des cartes ingredient du Joueur actif
        List<Ingredient> ingredients = iCrud.findAllByJoueurId(j.getId());

        model.addAttribute("listeIngredient", ingredients);
        
        SortDTO dto = new SortDTO();
        model.addAttribute("dto", dto);
        
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
        
        return "ajax_rafraichir_nbre_cartes";
    }

    
    @RequestMapping(value = "/plateau", method = RequestMethod.POST)
    public String lancerSortPOST(@ModelAttribute("dto") SortDTO dto, HttpSession session) {  

        // Récupere joueur actuel
        Joueur joueurAct = (Joueur) session.getAttribute("joueurActuel");
        
        //Recuperation des 2 ingredients selectionne
        Ingredient ing1 = iCrud.findOne(dto.getIng1Id());
        Ingredient ing2 = iCrud.findOne(dto.getIng2Id());
        
        //Recuperation de la cible
//        dto.getVictimeId();
        
        //Verification du sort correspondant aux ingredient selectionné
        if( ing1.getTypeIngredient()==Ingredient.Type.CORNE_DE_LICORNE && ing2.getTypeIngredient()==Ingredient.Type.BAVE_DE_CRAPAUD ){
            // Invisibilité
            
            sService.invisibilite(joueurAct.getId());
        }
        
        return "plateau";
    }
    
}

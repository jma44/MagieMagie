/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import streaming.dao.JoueurCrudRepository;
import streaming.entity.Joueur;
import streaming.service.JoueurService;

/**
 *
 * @author ajc
 */
@Controller
public class ConnnexionController {
    
    @Autowired
    private JoueurService jService;
    
    @Autowired
    private JoueurCrudRepository jCrud;

    @RequestMapping(value = "/demarrer", method = RequestMethod.GET)
    public String demarrerGET() {

        
        return "demarrer";        
    }
    
    
    @RequestMapping(value = "/connexion", method = RequestMethod.GET)
    public String ConnexionGET(Model model) {
        
        model.addAttribute("monJoueur", jService.creerJoueur());
        
        
        return "connexion";
    }
    
    
    
    @RequestMapping(value = "/connexion", method = RequestMethod.POST)
    public String ConnexionPOST(@ModelAttribute("monJoueur") Joueur joueurNouv) {
        
        jCrud.save(joueurNouv);
        
        return "redirect:/demarrer";
       
    }

    
}

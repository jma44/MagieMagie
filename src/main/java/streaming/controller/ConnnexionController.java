/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
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
    public String demarrerGET(Model model) {
        // Liste des joueurs en variable de session
        List<Joueur> joueurs = (List<Joueur>) jCrud.findAll();
        
        model.addAttribute("listeJoueurs", joueurs);
        
        return "demarrer";        
    }
    
    
    @RequestMapping(value = "/connexion", method = RequestMethod.GET)
    public String ConnexionGET(Model model) {
        
        model.addAttribute("monJoueur", new Joueur());
        
        return "connexion";
    }
    
    
    
    @RequestMapping(value = "/connexion", method = RequestMethod.POST)
    public String ConnexionPOST(@ModelAttribute("monJoueur") Joueur joueurNouv) 
    {
 
        
        
        String pseudo = joueurNouv.getPseudo();
        
        Joueur j = jService.creerJoueur();
        j.setPseudo(pseudo);
        
        jCrud.save(j);
        
        
        return "redirect:/demarrer";
       
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    private IngredientService iService;    

    
    @RequestMapping(value = "/plateau/{idJoueur}", method = RequestMethod.GET)
    public String ajaxPlateauGET(Model model, @PathVariable("idJoueur") long idSorciere) {
            
        //model.addAttribute("monPlateau",  );        
        
        // Recuperation des cartes du Joueur actif
    
        
        
        
        return "plateau";          
    }
    
    
    
}

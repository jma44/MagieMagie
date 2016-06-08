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
    private JoueurService joueurService;

    @Autowired
    private JoueurCrudRepository jCrud;

    @RequestMapping(value = "/demarrer", method = RequestMethod.POST)
    public String demarrerPOST(Model model,  HttpSession session ) {
        
        Joueur j = (Joueur)(session.getAttribute("joueurActuel"));
        
        //test joueur actif
        List<Joueur> joueurs = (List<Joueur>) jCrud.findAll();
        joueurs.get(0).setActif(true);
        jCrud.save(joueurs.get(0));
        
        System.out.println("********* j0 " + joueurs.get(0).isActif());
        
        Joueur joueurActif = jCrud.findOne(j.getId());
        
        System.out.println("********* jA " + joueurActif.isActif());
        
        //mettre a jour le joueur en session pour bien detecter si passer en actif
        session.setAttribute("joueurActuel",joueurActif);
        
        
        long idJoueur = j.getId();
                
        return "redirect:/plateau/" + idJoueur;
    }    
    
    @RequestMapping(value = "/demarrer", method = RequestMethod.GET)
    public String demarrerGET(Model model) {

        List<Joueur> joueurs = (List<Joueur>) jCrud.findAll();

        model.addAttribute("listeJoueurs", joueurs);

        return "demarrer";
    }

    @RequestMapping(value = "/connexion", method = RequestMethod.GET)
    public String connexionGET(Model model) {

        model.addAttribute("monJoueur", new Joueur());

        return "connexion";
    }

    @RequestMapping(value = "/connexion", method = RequestMethod.POST)
    public String connexionPOST(@ModelAttribute("monJoueur") Joueur joueurNouv, HttpSession session) {

        String pseudo = joueurNouv.getPseudo();

        Joueur j = joueurService.creerJoueur();
        j.setPseudo(pseudo);

        jCrud.save(j);
        
        // Mettre en variable de session le joueur (a modifier pour plus tard..)        
        session.setAttribute("joueurActuel",j);
        
        return "redirect:/demarrer";

    }

    @RequestMapping(value = "/rafraichir_liste", method = RequestMethod.GET)
    public String rafraichirListeJoueur(Model model) 
    {
        List<Joueur> joueurs = (List<Joueur>) jCrud.findAll();
        
        model.addAttribute("listeJoueurs", joueurs);
        
        return "rafraichir_liste";
    }

}

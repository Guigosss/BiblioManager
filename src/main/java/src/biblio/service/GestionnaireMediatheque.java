package src.biblio.service;

import src.biblio.dao.EmpruntDAO;
import src.biblio.dao.LivreDAO;
import src.biblio.dao.UtilisateurDAO;
import src.biblio.model.LivreEntity;
import src.biblio.model.UtilisateurEntity;

import java.util.List;

public class GestionnaireMediatheque {

    private final LivreDAO livreDAO;
    private final UtilisateurDAO utilisateurDAO;
    private final EmpruntDAO empruntDAO;

    public GestionnaireMediatheque(LivreDAO livreDAO, UtilisateurDAO utilisateurDAO, EmpruntDAO empruntDAO) {
        this.livreDAO = livreDAO;
        this.utilisateurDAO = utilisateurDAO;
        this.empruntDAO = empruntDAO;
    }

    //- Livres

    //- Utilisateurs

    //- Emprunts

}

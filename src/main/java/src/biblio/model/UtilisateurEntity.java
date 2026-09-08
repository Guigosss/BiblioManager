package src.biblio.model;

public class UtilisateurEntity {
    private int id;
    private String nom;

        public UtilisateurEntity(int id, String nom) {
            this.id = id;
            this.nom = nom;
        }

        public int getId() {
            return id;
        }

        public String getNom() {
            return nom;
        }
    }


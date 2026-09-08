package src.biblio.model;

import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmpruntEntity {

    private int id;
    private int livreId;
    private int utilisateurId;
    private LocalDate dateEmprunt;
    private LocalDate dateRetour;
}

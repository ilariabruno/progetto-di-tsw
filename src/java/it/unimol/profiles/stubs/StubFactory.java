package it.unimol.profiles.stubs;

import it.unimol.profiles.beans.pagine.RisultatiRicerca;
import it.unimol.profiles.beans.pagine.docente.*;
import it.unimol.profiles.beans.utils.*;
import java.util.ArrayList;

/**
 *
 * @author Stefano
 */
public class StubFactory {

    private StubFactory() {

    }

    public static InformazioniGeneraliDocente getInformazioniGeneraliDocenteStub() {
        return InformazioniGeneraliDocente.getStub();
    }

    public static ArrayList getListaDocentiStub() {
        ArrayList<Docente> listaDocenti = new ArrayList();
        for (int i = 0; i < 10; i++) {
            Docente nextDocente = Docente.getStub();
            listaDocenti.add(nextDocente);
        }
        return listaDocenti;
    }

    public static RisultatiRicerca getRisultatiRicercaStub() {
        return RisultatiRicerca.getStub();
    }
    
    public static InsegnamentiDocente getInsegnamentiDocenteStub() {
        return InsegnamentiDocente.getStub();
    }
    
    public static CurriculumDocente getCurriculumDocenteStub() {
        return CurriculumDocente.getStub();
    }
    
    public static ElencoSezioniPersonalizzate getElencoSezioniPersonalizzateStub() {
        return ElencoSezioniPersonalizzate.getStub();
    }
    
    public static PubblicazioniDocente getPubblicazioniDocenteStub() {
        return null;
    }
    
    public static RicevimentoStudenti getRicevimentoStudentiStub() {
        return RicevimentoStudenti.getStub();
    }
}

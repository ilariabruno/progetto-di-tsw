package it.unimol.profiles;

import it.unimol.profiles.beans.utils.*;
import it.unimol.profiles.beans.pagine.*;
import it.unimol.profiles.beans.pagine.docente.*;
import it.unimol.profiles.stubs.StubFactory;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Stefano
 */
public class ManagerDocenti {

    private static ManagerDocenti singletonManagerDocenti;

    private ManagerDocenti() {
    }
    public static ManagerDocenti getInstance() {
        if (singletonManagerDocenti == null) {
            singletonManagerDocenti = new ManagerDocenti();
        }
        return singletonManagerDocenti;
    }

    
    public ArrayList<Docente> getListaDocenti() {
        return StubFactory.getListaDocentiStub();
    }

    public RisultatiRicerca getRisultatiRicerca(String parametroNome, String parametroCognome) {
        return StubFactory.getRisultatiRicercaStub();
    }

    public InformazioniGeneraliDocente getInfoGeneraliDocente(Docente docente){
        return StubFactory.getInformazioniGeneraliDocenteStub();
    }
    
    public InsegnamentiDocente getInsegnamentiDocente(Docente docente){
        return StubFactory.getInsegnamentiDocenteStub();
    }
    
    public CurriculumDocente getCurriculumDocente(Docente docente){
        return StubFactory.getCurriculumDocenteStub();
    }
    
    public PubblicazioniDocente getPubblicazioniDocente (Docente docente){
        return null;
    }
    
    public RicevimentoStudenti getRicevimentoStudenti(Docente docente){
        return StubFactory.getRicevimentoStudentiStub();
    }
    
    public ElencoSezioniPersonalizzate getElencoSezioniPersonalizzate(Docente docente){
        return StubFactory.getElencoSezioniPersonalizzateStub();
    }
    
    public SezionePersonalizzata getSezionePersonalizzata(Docente docente, String nomeSezione){
        return null;
    }
    
    public SezionePersonalizzata getSezionePersonalizzata(Docente docente, int idSezione){
        return null;
    }
    
    private void inserisciFile(File file, String directory){
        /*
            salva il file passato nella cartella identificata dalla stringa directory
        */
    }
    
    public void inserisciDocente() {
        //todo inserire il professore in questione nel db
    }

    public void eliminaDocente() {
        //todo eliminare il professore in questione dal db
    }

}

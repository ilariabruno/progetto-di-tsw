package it.unimol.profiles.beans.pagine.docente;

import java.util.ArrayList;

/**
 *
 * @author Stefano
 */
public class InsegnamentiDocente extends ArrayList<String>{
    
    public InsegnamentiDocente(){
        super();
    }
    
    public static InsegnamentiDocente getStub(){
        InsegnamentiDocente stub = new InsegnamentiDocente();
        stub.add("Sistemi Operativi");
        stub.add("Tecnologie di Siluppo per il Web");
        stub.add("Ingegneria del Software");
        
        return stub;
    }
    
}

package it.unimol.profiles.beans.pagine.docente;

/**
 *
 * @author Stefano
 */
public class InformazioniGeneraliDocente {

    private String nome;
    private String cognome;
    private String ruolo;
    private String email;
    private String dipartimento;
    private String telefono;

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public InformazioniGeneraliDocente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(String dipartimento) {
        this.dipartimento = dipartimento;
    }

    public static InformazioniGeneraliDocente getStub() {
        InformazioniGeneraliDocente stub = new InformazioniGeneraliDocente();
        stub.setNome("Fausto");
        stub.setCognome("Fasano");
        stub.setDipartimento("Bioscienze e Territorio");
        stub.setEmail("fausto.fasano@unimol.it");
        stub.setRuolo("Ricercatore");
        stub.setTelefono("0874 404126");

        return stub;
    }
}

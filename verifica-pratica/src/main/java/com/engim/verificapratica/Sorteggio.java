package com.engim.verificapratica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorteggio {
    private List<Squadra> squadre = new ArrayList<>();
    private boolean daMischiare = true;
    private int nextName = 0;
    public void aggiungi(String nome, String nazione){
        squadre.add(new Squadra(nome,nazione));
        daMischiare = true;
        nextName = 0;
    }

    public Squadra next(){
        if(daMischiare){
            Collections.shuffle(squadre);
            daMischiare = false;
            nextName = 0;
        }
        if(nextName >= squadre.size())
            throw new IndexOutOfBoundsException("squadre finite");
        return squadre.get(nextName++);
    }



    public List<Squadra> getSquadre() {
        return squadre;
    }

    public boolean isDaMischiare() {
        return daMischiare;
    }

    public List<Partita> sorteggiaPartite(){
        List<Partita> listaDellePartite= new ArrayList<>();
        //implementare sorteggio
        return listaDellePartite;
    }

    /* ES 4: implementare il sorteggio delle squadre di una fase finale di un torneo a eliminazione diretta.
     * Creare il metodo sorteggiaPartite che:
     * - controlla se il numero di squadre aggiunte è una potenza di 2. Se non lo è lancia una RuntimeException.
     * - Finché ci sono squadre non sorteggiate: sorteggia 2 squadre e le inserisce in un oggetto della classe Partita (da creare)
     * - restituisce la lista di Partite.
     * creare get ("/getPartite") che restituisce la lista appena creata - 30 p
     * */
}

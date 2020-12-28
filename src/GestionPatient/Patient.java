/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionPatient;

import java.util.Date;

/**
 *
 * @author mac
 */
public class Patient {

    public Patient(int id,String nom, String prenom, String statut, int tele, int cin, String sexe) {
        this.nom = nom;
        this.id = id;
        this.prenom = prenom;
        this.statut = statut;
        this.tele = tele;
        this.cin = cin;
        this.sexe = sexe;
        
    }

    public Patient() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public int getTele() {
        return tele;
    }

    public void setTele(int tele) {
        this.tele = tele;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    
     public void setId(int id) {
        this.id = id;
    }

     public int getId() {
        return id;
    }

     public String getSexe() {
        return sexe;
    }
     
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }
     public Date getD() {
        return D;
    }
     
    public void setD(Date D) {
        this.D = D;
    }
   

   
    private
            String nom, prenom,statut,sexe;
            int tele,cin,id ;
            Date D;
            
    
}

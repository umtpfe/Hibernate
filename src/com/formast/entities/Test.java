package com.formast.entities;
// Generated 23 f�vr. 2019 21:07:17 by Hibernate Tools 3.4.0.CR1



/**
 * Test generated by hbm2java
 */
public class Test  implements java.io.Serializable {


     private int id;
     private String nom;
     private String prenom;
     private String telephone;
     private String email;

    public Test() {
    }

	
    public Test(int id) {
        this.id = id;
    }
    public Test(int id, String nom, String prenom, String telephone, String email) {
       this.id = id;
       this.nom = nom;
       this.prenom = prenom;
       this.telephone = telephone;
       this.email = email;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return this.prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getTelephone() {
        return this.telephone;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }




}


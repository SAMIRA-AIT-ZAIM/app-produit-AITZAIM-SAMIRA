/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package h1;

import java.util.Date;
import ma.projet.entity.Produit;
import ma.projet.service.ProduitService;

/**
 *
 * @author salam
 */
public class Teste {
    public static void main(String[] args) {
        ProduitService ps = new ProduitService();
        ps.create(new Produit("MIO", "KJSU38", new Date(), 6788, "jffhj"));
        ps.create(new Produit("TIDE", "KJSU38", new Date(), 67868, "jfhj"));
        ps.create(new Produit("ALO", "KJSU38", new Date(), 67988, "jhfj"));
        ps.create(new Produit("NOSO", "KJSU38", new Date(), 67688, "jffhj"));
        ps.create(new Produit("FIO", "KJSU38", new Date(), 67898, "jhffj"));
   
    for(Produit p : ps.findAll()){
        System.out.println("la liste des produits :" + p);
    }
    
   Produit produit = ps.findById(2);
        if (produit != null) {
            System.out.println("Produit à supprimer : " + produit.toString());

            // Supprimer le produit
            ps.delete(produit);
            System.out.println("Produit supprimé avec succès.");
        } else {
            System.out.println("Aucun produit trouvé avec l'ID 3.");
        }
        Produit p = ps.findById(3);
        if (p != null){
            p.setMarque("newmarque");
            p.setDateAchat(new Date());
            p.setDesignation("newdesignation");
            p.setPrix(2344);
            p.setReference("KSJSI89");
            
            ps.update(p);
            System.out.println("le produit à été modifier ");
        }else{
            System.out.println("ce produit n'existe pas");
            
        }
        
        System.out.println(ps.findByPriceGreaterThan(536.000)); 
        
        
        
        
        
    
    
    
    
    
    
    
    }
    
    
}

package javaapplication1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author miguelgmata
 */
public class JavaApplication1 {

    public static void main(String[] args) throws IOException{
   InputStreamReader inputNom = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader (inputNom);
        System.out.println("Ajouter votre Nom :");
        String nom = buffer.readLine();

        System.out.println("Ajouter votre Prenom :");
        String prenom = buffer.readLine();

        System.out.println("Ajouter votre Agê :");
        String strAge = buffer.readLine();
        Integer age = Integer.parseInt(strAge);

        System.out.println("Ajouter votre Salaire Brut :");
        String strSalaire = buffer.readLine();
        Double salaireBrut = Double.parseDouble(strSalaire);
        
        System.out.println("Bienvenue Monsieur : " + nom + " " + prenom);
        
        mutuelle(age, salaireBrut);
        
    }
   
    private static void mutuelle(Integer age, Double salaireBrut ){
        
        Double salaireNet = salaireBrut - (salaireBrut * 0.23);
        
        if(age > 18  && salaireNet > 700 && salaireNet <= 1000){
            System.out.print(" Vous avez le droit de travailler et la CMU-C ");
        }else if(age > 18 && salaireNet > 1000 && salaireNet <=1350){
            System.out.print(" Vous avez le droit de travailler et la Mutuelle JMI ");
        }if(age > 18 && salaireNet > 1350 && salaireNet <=1700){
            System.out.print(" Vous avez le droit de travailler et la Mutuelle SMI ");
        }if(age >= 18 && salaireNet > 1700){
            System.out.print(" Vous avez le droit de travailler et vous n'avait pas droit a mutuelle gratuit ");
        }else if(age < 18){
            System.out.print ("Tout mineur doit y être autorisé par son représentant légals ");
        }
        
        System.out.print("Âge : "+ age + " ans avec un salaire Net : " + (salaireNet));
        
    }
}

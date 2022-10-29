package project1;

import java.util.Scanner;

import javax.swing.JSpinner.ListEditor;
import miniProject.Employe;
public class Main {
	public static void main(String[] args) {
		int choix;
		// TODO Auto-generated method stub
		 do {
	          System.out.println("\n____________________________________________________________________________________");
	      	  System.out.println("---------------------------------------Menu du programme-------------------------------------------------");
	          System.out.println("1-Ajouter un employé:");
	          System.out.println("2-Modifier un employé:");
	          System.out.println("3-Suprimmer un employé:");
	          System.out.println("4-Afficher un employé:");
	          System.out.println("5-Afficher tous les employé:");
	          System.out.println("6-calculer le nombre des employés ayant un salaire qui dépasse 10000");
	          System.out.println("7-Afficher l'employer le plus agé:");
	          System.out.println("8-Afficher l'employer le moin agé:");
	          System.out.println("9-Quitter:");
	          Scanner xxScanner=new Scanner(System.in);
	          System.out.println("entrer votre choix: ");
	          choix=xxScanner.nextInt();				
	          switch (choix) {                 
	  	     case 1:			
	  				Employee.ajouter();
	  			break;
	  		case 2:
	  			Employee.modifier();
	  			break;
	  		case 3:
	  			Employee.suprimer();
	  			break;
	  		case 4:
	  			Employee.afficher();
	  			
	  			break;
	  		case 5:
	  			Employee.afficherListe();

	  			break;
	  		case 6:      
	  			Employee.Affichesalaire();
	  			break;
	  		case 7:
	  			Employee.plusAge();
	  			break;
	  			
	  		case 8:
	  			Employee.moinsAge();
	  			break;
	  		default :
	  			System.out.println("vous avez quitter le programme");
	  		}
	  		}while(choix!=0 );	

	          
	      
	}

}

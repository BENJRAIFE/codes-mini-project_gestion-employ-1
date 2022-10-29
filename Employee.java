package project1;
import java.util.ArrayList;
import java.util.Scanner;
public class Employee {
	  private static double matricule;
      private String nom;
      private String prenom;
      private static double age;
      private double salaire;
      static ArrayList <Employee> liste=new ArrayList<Employee>();
      static Scanner emp = new Scanner(System.in);
      //constroctors      
      public Employee(double matricule, String nom, String prenom, double age, double salaire) { }
  	public Employee() {
	}
	public void Employee(double matricule,String nom,String prenom,double age,double salaire) {
  		this.matricule = matricule;
  		this.nom = nom;
  		this.prenom = prenom;
  		this.age = age;
  		this.salaire = salaire;
  	}
      //getters and setters
      public static double getMatricule() {
          return matricule;      }
      public void setMatricule(int matricule) {
          this.matricule = matricule;      }
      public String getNom() {
          return nom;      }
      public void setNom(String nom) {
          this.nom = nom;      }
      public String getPrenom() {
          return prenom;     }
      public void setPrenom(String prenom) {
          this.prenom = prenom;     }
     public static  double getAge() {
          return age;      }
      public void setAge(int age) {
          this.age = age;      }
      public double getSalaire() {
          return salaire;      }
      public void setSalaire(int salaire) {
          this.salaire = salaire;      }
      // l'ajout des emlpoyees
      static public void ajouter(){
          Employee employe = new Employee();
          System.out.println("Entrer le matricule:");
          int matr = emp.nextInt();
          System.out.println("Entrer le nom:");
          String nom = emp.next();
          System.out.println("Entrer le prenom:");
          String prenom = emp.next();
          System.out.println("Entrer l'age:");
          int age = emp.nextShort();
          System.out.println("Entrer le salaire:");
          int salaire = emp.nextInt();
          employe.setMatricule(matr);
          employe.setNom(nom);
          employe.setPrenom(prenom);
          employe.setAge(age);
          employe.setSalaire(salaire);
			if(liste.contains(Employee.getMatricule())){
			      System.out.println("L'employé existe");
			  }else {liste.add(employe);
			      System.out.println("l'employé est ajouté vec succée");			  } }
      //2)Modification
      static public void modifier(){
          Employee employe = new Employee();
          System.out.println("entrer le matricule de l'employé:");
          int matricule = emp.nextInt();
          for (Employee i:liste) {
              if (i.getMatricule()==matricule){
                  System.out.println("entrer le neauvau nom:");
                  String nom = emp.nextLine();
                  System.out.println("entrer le neauvau prenom:");
                  String prenom = emp.nextLine();
                  System.out.println("entrerle neauvau age:");
                  short age = emp.nextShort();
                  System.out.println("entrer le neauvau salaire:");
                  int salaire = emp.nextInt();
                  i.setNom(nom);
                  i.setPrenom(prenom);
                  i.setAge(age);
                  i.setSalaire(salaire);
                  System.out.println("Modification avec succeé");
              }else {
                  System.out.println("L'employe n'existe pas");  }}}
      //3-Suprimmer Employé
     static  public void suprimer() {
          Employee employe = new Employee();
          System.out.println("Donner le matricule de l'employé:");
          int matricule = emp.nextInt();
          int compteur =0;
          for (Employee i : liste) {
              if (i.getMatricule() == matricule) {
                  liste.remove(i);
                  System.out.println("Suprission avec succeé");
                  compteur++;}}
          if (compteur==0){
              System.out.println("L'employe n'existe pas");}}
      //4-Afficher Employé
      static public void afficher(){
          System.out.println("entrer le matricule de l'employé:");
          int matricule = emp.nextInt();
          System.out.println("\n*****************************************************************\n");
          if(liste.isEmpty()){
              System.out.println("La liste est vide!!!");
          }else{
              for (Employee i : liste) {
                  if (i.getMatricule() == matricule) {
                      System.out.println("Matricule:" + i.getMatricule() + "\nl'employé est:" + i.getNom() + " " + i.getPrenom()
                              + "\nAge:" + i.getAge() + "\nSalaire:" + i.getSalaire());
                  } else {
                      System.out.println( "L'empolyé n'xiste pas"); } }}}
      //5-Afficher tous
     static  public void afficherListe(){
          if(liste.isEmpty()){
              System.out.println("La liste est vide");
          } else{
              for (Employee i : liste) {
                  if (liste.size() != 0) {
                      System.out.println("Matricule:"+i.getMatricule()+"\nL'employé :"+i.getNom()+" "+i.getPrenom()
                              +"\nAge:"+i.getAge()+"\nSalaire:"+i.getSalaire()+"\n************************************"); }}}}
      //6-Salaire
      static public void Affichesalaire(){
          int compteur =0;
          for (Employee i:liste) {
              if (i.getSalaire()>10000) {
                  compteur++;             } }
          if (compteur>0){
              System.out.println("Le nombre d'employés est:"+compteur);
          }else {
              System.out.println("acun employé");          }      }
      //7-Plus agé
      static public double plusAge(){
          Employee employe = new Employee();
          double plusage = Employee.getAge();
          for (Employee i:liste) {
              if(i.getAge()>plusage){
                  plusage=i.getAge();  } }
          return plusage;      }
      //8-moin agé
      static public double moinsAge(){
          double moinsage = liste.get(0).getAge();
          for (Employee i:liste) {
              if(i.getAge()<moinsage){
                  moinsage=i.getAge();} }
          return moinsage;
      }
 }



public class personne {
	private String nom;
	private String prenom;
	private int age;
	private String sexe;


public personne(){
	this.nom="Med";
	this.prenom=" Ben ALI";
	this.age=30;
	this.sexe="Homme";
}
personne (String nom,String prenom,int age,String sexe) {
	this.nom=nom;
	this.prenom=prenom;
	this.age=age;
	this.sexe=sexe;
}

String getnom() {
	return this.nom;
}
String getprenom() {
	return this.prenom;
}
int getage() {
	return this.age;
}
String getsexe() {
	return this.sexe;
}

void affiche() {
	System.out.println("nom = "+nom);
	System.out.println("prenom = "+prenom);
	System.out.println("age = "+age);
	System.out.println("sexe = "+sexe);
}

booleen sameLastName(personne p) {
	return this.prenom==personne.prenom);
}

/*public personne1(String nom,String prenom,int age,char sexe) {
	return ;
}
*/
public static void main(String[]arg) {
	personne p;
	p=new personne();
	personne p1=new personne();
	p.affiche();
	p1.affiche();
}
}
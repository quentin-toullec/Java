import java.util.Scanner;
class Start{
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Entrez un nombre entier:");
		int n = scanner.nextInt();//nombre de palets
		resoudre(n, "A","B","C"); //fonction pour r�soudre le jeu
			
	}
	
 public static void resoudre(int n, String dep, String milieu, String fin) { //definition de variable (nombre de disque donn�, depart, intermediaire, fin)
	        if (n == 0) { return;} //si 0 disque rien retourn�
			else {				// sinon tant que n != 0 bouger les disques pour que tous les disques soit sur FIN
	        resoudre(n-1, dep, fin, milieu);
	        System.out.println("Bougez le disque " + n + " de " + dep + " � " + fin);
	        resoudre(n-1, milieu, dep, fin);}
	    }
}
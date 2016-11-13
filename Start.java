import java.util.Scanner;
class Start{
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Entrez un nombre entier:");
		int n = scanner.nextInt();//nombre de palets
		resoudre(n, "A","B","C"); //fonction pour résoudre le jeu
			
	}
	
 public static void resoudre(int n, String dep, String milieu, String fin) { //definition de variable (nombre de disque donné, depart, intermediaire, fin)
	        if (n == 0) { return;} //si 0 disque rien retourné
			else {				// sinon tant que n != 0 bouger les disques pour que tous les disques soit sur FIN
	        resoudre(n-1, dep, fin, milieu);
	        System.out.println("Bougez le disque " + n + " de " + dep + " à " + fin);
	        resoudre(n-1, milieu, dep, fin);}
	    }
}
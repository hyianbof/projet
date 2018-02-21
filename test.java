class Test{
	public static void main(String [] args){
		Joueur j1= new Joueur("Alice");
		Joueur j2=new Joueur("Bob");
		Jeu a= new Jeu(j1, j2);
		a.jouer();
	}
}

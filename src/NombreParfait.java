public class NombreParfait {

    /*
    Qu’est-ce qu’un nombre parfait ?

Un nombre parfait est un entier positif qui est égal à la somme de ses diviseurs propres positifs.
Les diviseurs propres positifs sont des entiers positifs qui divisent complètement le nombre parfait sans laisser de reste, à l’exclusion du nombre parfait lui-même.

Par exemple, prenons le nombre 6 :
Ses diviseurs propres sont 1, 2 et 3 (puisque 6 est la valeur du nombre parfait, il est exclu), et la somme de ses diviseurs propres est 1 + 2 + 3 = 6.
Par conséquent, 6 est un nombre parfait (et c’est aussi le premier nombre parfait).

Écrire une méthode appelée isPerfectNumber avec un paramètre de type int appelé number.

	•	Si number est inférieur à 1, la méthode doit retourner false.
	•	La méthode doit calculer si le nombre est parfait. Si le nombre est parfait, la méthode doit retourner true, sinon, elle doit retourner false.

EXEMPLES D’ENTRÉES/SORTIES :

	•	isPerfectNumber(6); → devrait retourner true car ses diviseurs propres sont 1, 2, 3 et la somme est 1 + 2 + 3 = 6.
	•	isPerfectNumber(28); → devrait retourner true car ses diviseurs propres sont 1, 2, 4, 7, 14 et la somme est 1 + 2 + 4 + 7 + 14 = 28.
	•	isPerfectNumber(5); → devrait retourner false car son seul diviseur propre est 1 et la somme est 1, pas 5.
	•	isPerfectNumber(-1); → devrait retourner false car le nombre est inférieur à 1.

CONSEIL :

	•	Utilisez une boucle while ou for.
	•	Utilisez l’opérateur de reste %.

REMARQUE :

	•	La méthode isPerfectNumber doit être définie comme public static, comme nous l’avons fait jusqu’à présent dans le cours.
	•	N’ajoutez pas de méthode main dans le code de la solution.
     */
    public static boolean isPerfectNumber(int nombre){
        //exclure les nombre inférieurs à un
        if (nombre < 1){
            return false;
        }

        //créer une variable pour comptabiliser la somme des diviseurs
        int sommeDiviseurs = 0;

        //faire une boucle qui permet d'ajouter à la variable sommeDiviseurs chaque diviseurs propres
        for (int compteur = 1; compteur < nombre; compteur++){
            if (nombre % compteur == 0){
                sommeDiviseurs +=compteur;
            }
        }
        //verifier si la somme des diviseur est égale au nombre introduit dans la méthode
        return sommeDiviseurs == nombre;
    }

    public static void main(String[] args) {
        //tests
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }
}

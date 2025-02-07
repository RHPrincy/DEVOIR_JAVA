public class Main{
    public static void main(String[] args)    {
        Forme2d cercle = new Cercle(12);
        Forme2d carre = new Carre(45);

        Forme2d[] formes = {cercle ,carre};
        for (Forme2d forme : formes) {
            forme.dessiner();
            System.out.println("Surface: " + forme.surface());
            System.out.println("Perimetre: " + forme.perimetre());
        }
    }
}
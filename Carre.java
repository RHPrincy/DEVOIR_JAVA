public class Carre extends Forme2d implements IAction
{
    private float cote;

    public Carre(float cote) 
    {
        this.cote = cote;
    }
    public float surface() 
    {
        return cote * cote;
    }
    public float perimetre() 
    {
        return 4 * cote;
    }
    public void dessiner() 
    {
        System.out.println("Dessiner Carre");
    }
}

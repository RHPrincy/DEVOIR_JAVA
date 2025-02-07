public class Cercle extends Forme2d implements IAction 
{
    private float rayon;

    public Cercle(float rayon) 
    {
        this.rayon = rayon;
    }
    public float surface() 
    {
        return (float) (Math.PI * rayon * rayon);
    }
    public float perimetre() 
    {
        return (float) (2 * Math.PI * rayon);
    }
    public void dessiner() 
    {
        System.out.println("Dessiner Cercle");
    }
}
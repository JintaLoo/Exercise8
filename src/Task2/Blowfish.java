package Task2;

public class Blowfish extends Fish implements AnimalBehavoir,AnimalMove,AnimalName
{
    private String diameterKanisorn55477;

    Blowfish()
    {
        super();
        diameterKanisorn55477="-";
    }

    public Blowfish(String name,int age,int weight,String scaleColor, String diameter)
    {   super(name,age,weight,scaleColor);
        this.diameterKanisorn55477=diameter;
    }

    public Blowfish(int age,String scaleColor,String diameter)
    {
        super(age,scaleColor);
        this.diameterKanisorn55477=diameter;
    }


    //Special method
    public void Attack()
    {System.out.println("Blowfish has a poison inside the body");}

    @Override
    public void getVoice()
    {System.out.println("It cannot make sound");}

    @Override
    public void eat(String Food)
    {System.out.println("It eats "+Food);}

    public String getDiameter()
    {return diameterKanisorn55477;}
    public void setDiameter(String diameter)
    {this.diameterKanisorn55477=diameter;}

    @Override
    public String toString()
    {
        return "Dog{ breed = "+diameterKanisorn55477+'\''+'}';
    }

    @Override
    public void move(Object ob)
    {
        System.out.println(ob.getClass().getSimpleName()+" swim");
    }

    @Override
    public void sleep(String name,int age,int weight) {

    }
}

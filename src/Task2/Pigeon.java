package Task2;

public class Pigeon extends Bird implements AnimalBehavoir,AnimalMove,AnimalName
{
    private String spicesKanisorn55477;

    public Pigeon()
    {
        super();
        spicesKanisorn55477="-";
    }

    public Pigeon(String name,int age,int weight,String featherColor, String spices)
    {   super(name,age,weight,featherColor);
        this.spicesKanisorn55477=spices;
    }

    public Pigeon(int age,String featherColor,String spices)
    {
        super(age,featherColor);
        this.spicesKanisorn55477=spices;
    }

    //Special method
    public void longTimeAGo()
    {System.out.println("The Pigeons used to transport the letter");}

    @Override
    public void getVoice()
    {System.out.println("The Pigeons make a prolonged cooing sound");}

    @Override
    public void eat(String Food)
    {System.out.println("It eats" + Food);}

    public String getSpices()
    {return spicesKanisorn55477;}
    public void setSpices(String spices)
    {this.spicesKanisorn55477=spices;}

    @Override
    public String toString()
    {
        return "Fish{ Spices = "+spicesKanisorn55477+'\''+'}';
    }

    @Override
    public void move(Object ob)
    {
        System.out.println(ob.getClass().getSimpleName()+" fly");
    }

    @Override
    public void sleep(String name,int age,int weight) {

    }
}

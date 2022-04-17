package Task2;

public class Bird extends Animal implements AnimalMove,AnimalName
{
    private String featherColorKanisorn55477;

    public Bird()
    {
        super();
        featherColorKanisorn55477="-";
    }

    public Bird(String name,int age,int weight, String featherColor)
    {
        super(name,age,weight);
        this.featherColorKanisorn55477=featherColor;
    }

    public Bird(int age,String featherColor)
    {
        super(age);
        this.featherColorKanisorn55477=featherColor;
    }
    //Special method
    public void Rest()
    {System.out.println("Bird can not sleep while flying");}

    @Override
    public void getVoice()
    {System.out.println("Bird is making good voice");}

    @Override
    public void eat(String Food)
    {System.out.println("It eats" + Food);}

    public String getFeatherColor()
    {return featherColorKanisorn55477;}
    public void setFeatherColor(String featherColor)
    {this.featherColorKanisorn55477=featherColor;}

    @Override
    public String toString()
    {
        return "Bird{ FeatherColor = "+featherColorKanisorn55477+'\''+'}';
    }

    @Override
    public void sleep(String name, int age, int weight) {

    }
}

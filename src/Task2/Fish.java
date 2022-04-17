package Task2;

public class Fish extends Animal implements AnimalMove,AnimalName
{
    private String scaleColorKanisorn55477;

    public  Fish()
    {
        super();
        scaleColorKanisorn55477="-";
    }

    public Fish(String name,int age,int weight, String scaleColor)
    {
        super(name,age,weight);
        this.scaleColorKanisorn55477=scaleColor;
    }

    public Fish(int age,String scaleColor)
    {
        super(age);
        this.scaleColorKanisorn55477=scaleColor;
    }


    //Special method
    public void Lives()
    {System.out.println("Fish can not survive on the surface");}

    @Override
    public void getVoice()
    {System.out.println("Fish is not making sound");}

    @Override
    public void eat(String Food)
    {System.out.println("It eats" + Food);}

    public String getScaleColor()
    {return scaleColorKanisorn55477;}
    public void setScaleColor(String scaleColor)
    {this.scaleColorKanisorn55477=scaleColor;}

    @Override
    public String toString()
    {
        return "Fish{ Scale-color = "+scaleColorKanisorn55477+'\''+'}';
    }

    @Override
    public void sleep(String name, int age, int weight) {

    }
}

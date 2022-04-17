package Task2;

public class Mammal extends Animal implements AnimalMove,AnimalName
{
    private String orderKanisorn55477;

    public Mammal()
    {
        super();
        orderKanisorn55477="-";
    }
    public Mammal(String name,int age,int weight, String order)
    {
        super(name,age,weight);
        this.orderKanisorn55477=order;
    }
    public Mammal(int age,String order)
    {
        super(age);
        this.orderKanisorn55477=order;
    }

    //Special method
    public void drinkMilk()
    {System.out.println("Si Si");}

    @Override
    public void getVoice()
    {System.out.println("Mammal is making sound");}

    @Override
    public void eat(String Food)
    {System.out.println("It eats" + Food);}

    public String getOrder()
    {return orderKanisorn55477;}
    public void setWeight(String order)
    {this.orderKanisorn55477=order;}

    @Override
    public String toString()
    {
        return "Mammal{ Order = "+orderKanisorn55477+'\''+'}';
    }

    @Override
    public void sleep(String name, int age, int weight) {

    }
}

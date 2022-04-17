package Task2;

public class Dog extends Mammal implements AnimalBehavoir,AnimalMove,AnimalName
{
    private String breedKanisorn55477;

    Dog()
    {
        super();
        breedKanisorn55477="-";
    }

    public Dog(String name,int age,int weight, String type,String breed)
    {   super(name,age,weight,type);
        this.breedKanisorn55477=breed;
    }

    public Dog(int age,String type,String breed)
    {
        super(age, type);
        this.breedKanisorn55477=breed;
    }

    //Special method
    public void aport()
    {System.out.println("The dog is retrieving");}

    @Override
    public void drinkMilk()
    {System.out.println("The dog is drinking milk");}

    @Override
    public void getVoice()
    {System.out.println("The dog is barking");}

    @Override
    public void eat(String Food)
    {System.out.println("It eats "+Food);}

    public String getBreed()
    {return breedKanisorn55477;}
    public void setBreed(String breed)
    {this.breedKanisorn55477=breed;}

    @Override
    public String toString()
    {
        return "Dog{ breed = "+breedKanisorn55477+'\''+'}';
    }

    @Override
    public void move(Object ob)
    {
       System.out.println(ob.getClass().getSimpleName()+" run");
    }

    @Override
    public void sleep(String name,int age,int weight) {

    }
}

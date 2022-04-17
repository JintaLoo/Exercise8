package Task2;

abstract class Animal implements AnimalName,AnimalBehavoir,AnimalMove
{
    private String nameKanisorn55477;
    private int ageKanisorn55477,weightKanisorn55477;

    public Animal()
    {
        ageKanisorn55477=weightKanisorn55477=0;
        nameKanisorn55477="-";
    }

    public Animal(String name,int age,int weight)
    {
        this.nameKanisorn55477=name;
        this.ageKanisorn55477=age;
        this.weightKanisorn55477=weight;
    }

    public Animal(int age)
    {this.ageKanisorn55477=age;}
    public abstract void eat(String Food);
    public abstract void getVoice();

    public String getName()
    {return nameKanisorn55477;}
    public void setName(String name)
    {this.nameKanisorn55477=name;}
    public int getAge()
    {return ageKanisorn55477;}
    public void setAge(int age)
    {this.ageKanisorn55477=age;}
    public int getWeight()
    {return weightKanisorn55477;}
    public void setWeight(int weight)
    {this.weightKanisorn55477=weight;}
}

package Task2;

public class Main
{
    public static void main(String[] args)
    {
        Animal animal[]=new Animal[6];
        animal[0]=new Mammal("Little g",2,3,"Bat");
        animal[1]=new Dog("Jimmy",1,1,"Carnivora","Coyote");
        animal[2]=new Bird("Bob",2,1,"light blue");
        animal[3]=new Pigeon("Two",4,2,"Black","Rock dove");
        animal[4]=new Fish("Sam",3,1,"Pink");
        animal[5]=new Blowfish("Isco",3,2,"Red","4");


        AnimalBehavoir animalBehavoir[]=new AnimalBehavoir[3];
        animalBehavoir[0]=new Dog("Jimmy",1,1,"Carnivora","Coyote");
        animalBehavoir[1]=new Pigeon("Two",4,2,"Black","Rock dove");
        animalBehavoir[2]=new Blowfish("Isco",3,2,"Red","4");

        for(Animal a: animal)
        {
            a.move(a);
        }

        for(Animal a: animal)
        {
            AnimalName.name(a.getName());
        }
    }
}

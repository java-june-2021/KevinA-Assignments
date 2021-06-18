public class MammalPtTwo {
    protected String name;
    protected int energyLevel;

    //constructor
    public MammalPtTwo(String name, int energyLevel) {
        this.name = name;
        this.energyLevel = energyLevel;
    }

    public MammalPtTwo(String name) {
        this.name = name;
        this.energyLevel = 100;
    }
    
    public MammalPtTwo() {
        this.name = "Nameless Beast";
        this.energyLevel = 100;
    }

    //methods
    public int displayEnergy() {
        System.out.println(this.name + "'s energy level is: " + this.energyLevel);
        return this.energyLevel;
    }

    public int throwSomething() {
        this.energyLevel -= 5;
        System.out.println(this.name + " threw something.");
        return this.energyLevel;
    }

    public int eatBananas() {
        this.energyLevel += 10;
        System.out.println(this.name + " ate a banana!");
        return this.energyLevel;
    }

    public int climb() {
        this.energyLevel -= 10;
        System.out.println(this.name + " just climbed to the top of a tree!");
        return this.energyLevel;
    }

    //gettrs and settrs
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getEnergyLevel() {
        return this.energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }
}

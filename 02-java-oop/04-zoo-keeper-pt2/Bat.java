public class Bat extends MammalPtTwo {
    public Bat(String name, int energyLevel) {
        this.name = name;
        this.energyLevel = energyLevel;
    }
    public Bat(String name) {
        this.name = name;
        this.energyLevel = 300;
    }
    
    public Bat() {
        this.name = "Nameless Flying Beast";
        this.energyLevel = 300;
    }

    //methods

    public int fly() {
        this.energyLevel -= 50;
        System.out.println(this.name + " just took off flying with the sound of a whirlwind! It's Collosal flapping wings sounding,  Whoosh! Whooosh! Whoosh!");
        return this.energyLevel;
    }

    public int eatHumans() {
        this.energyLevel += 25;
        System.out.println("Oh my Gosh! Did " + this.name + " just eat that GUY???? I thought this was a zoo! Is it called Jurrasic Park now or something?");
        return this.energyLevel;
    }

    public int attackTown() {
        this.energyLevel -= 100;
        System.out.println(this.name + " is attacking a TOWN!!!");
        return this.energyLevel;
    }

    public void diedOrNot() {
        if(this.energyLevel < 0) {
        System.out.println(this.name + " just expelled all energy, so they fell to the ground and died!");
        }
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

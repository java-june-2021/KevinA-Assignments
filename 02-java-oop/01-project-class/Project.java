public class Project {
    private String name;
    private String description;
    // private double initialCost;

    // Constructors
    public Project() {
        this.name = "Name: ";
        this.description = "There should be a description about this project....";
    }

    public Project(String name) {
        this.name = name;
        this.description = "There should be a description about this project....";
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Getters and Setters
    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // public double getInitialCost() {
    // return this.initialCost;
    // }

    // public void setInitialCost(double initialCost) {
    // this.initialCost = initialCost;
    // }

    // Methods
    public static String elevatorPitch(Project project) {
        return project.getName() + ": " + project.getDescription();
    }
}

// Will come back later to add the optional features if I end up being ahead on
// other projects at the end of week.
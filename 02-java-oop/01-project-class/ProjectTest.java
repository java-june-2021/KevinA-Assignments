import java.util.Arrays;

public class ProjectTest {
    public static void main(String[] args) {
        Project projectOne = new Project("New Crypto App",
                "We have created an app for a financial institution to incorporate Buying and selling Crypto currencies into their Portfolio.");
        Project projectTwo = new Project("Fitness App");
        projectTwo.setDescription("A brand new fitness mobile and web app to support local Personal Trainers");
        Project projectThree = new Project();
        projectThree.setName("Review Blizzard");
        projectThree.setDescription("New Review app for local media and broadcast company...");

        System.out.println(Project.elevatorPitch(projectOne));
        System.out.println(Project.elevatorPitch(projectTwo));
        System.out.println(Project.elevatorPitch(projectThree));
    }
}

// Will come back later to add the optional features if I end up being ahead on
// other projects at the end of week.
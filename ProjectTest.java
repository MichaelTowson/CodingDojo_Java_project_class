public class ProjectTest {
    public static void main(String[] args){
        Project firstProject = new Project();
        Project secondProject = new Project("Dojo Project Two");
        Project thirdProject = new Project("Dojo Project Three", "A project with a custom description.");

        firstProject.elevatorPitch();
        secondProject.elevatorPitch();
        firstProject.setName("First Project's New Name");
        firstProject.setDescription("A new description");
        firstProject.elevatorPitch();
    }
}

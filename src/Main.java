import parent.Developer;
import childs.*;

public class Main {
    public static void printDeveloperGrade(Developer develop) {
        develop.getRange().printPhrase();

    }

    public static void main(String[] args) {
        Developer[] developers = new Developer[]{new Developer("I am junior developer", Range.JUNIOR),
                new Developer("I am senior developer", Range.SENIOR),
                new Developer("I am middle developer", Range.MIDDLE),
                new Developer("I am teamlead developer", Range.TEAMLEAD)};

        for (Developer develop : developers) {
            printDeveloperGrade(develop);


        }
    }
}






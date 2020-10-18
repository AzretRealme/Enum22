import childs.*;

import static childs.Range.*;


public class Main {

    public static void main(String[] args) {

        Java[] develoop = new Java[]{new Developer("Developer", JUNIOR),
                new Developer2("Developer2", SENIOR),
                new Developer3("Developer3", MIDDLE),
                new Developer4("Developer4", TEAMLEAD)};

        for (Java developers : develoop) {
            developers.printDeveloperGrade();
        }

        Java develops = new Java();
        switch (develops.getRange()) {
            case JUNIOR:
                System.out.println("I am junior developer2");
                break;
            case SENIOR:
                System.out.println("I am senior developer2");
            case MIDDLE:
                System.out.println("I am middle developer2");
                break;
            case TEAMLEAD:
                System.out.println("I am teamlead developer2");
                break;
            default:
                break;

        }
    }
}

            /*if (JUNIOR.equals(develop)) {
                System.out.println("I am junior developer");

                System.out.println("I am junior developer");
            } else if (SENIOR.equals(develop)) {
                System.out.println("I am junior developer");
            } else if (MIDDLE.equals(develop)) {
                System.out.println("I am junior developer");
            } else if (TEAMLEAD.equals(develop)) {
                System.out.println("I am junior developer");
            }*/







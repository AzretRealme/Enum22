import childs.*;


public class Main {

        public static void main(String[] args) {

            Developer developer = new Developer("Developer", Range.JUNIOR);
            Developer2 developer2 = new Developer2("Developer2", Range.SENIOR);
            Developer3 developer3 = new Developer3("Developer3", Range.MIDDLE);
            Developer4 developer4 = new Developer4("Developer", Range.TEAMLEAD);

           /* developer.printDeveloperGrade();
            developer2.printDeveloperGrade();
            developer3.printDeveloperGrade();
            developer4.printDeveloperGrade();
            */
            switch (developer.getRange()) {
                case JUNIOR:
                    System.out.println("I am junior developer");
                case SENIOR:
                    break;
                case MIDDLE:
                    break;
                case TEAMLEAD:
                    break;
                default:
                    break;
            }

            switch (developer2.getRange()) {
                case JUNIOR:
                    break;
                case SENIOR:
                    System.out.println("I am senior developer2");
                case MIDDLE:
                    break;
                case TEAMLEAD:
                    break;
                default:
                    break;

            }
            switch (developer3.getRange()){
                case JUNIOR:
                    break;
                case SENIOR:
                    break;
                case MIDDLE:
                    System.out.println("I am middle developer3");
                case TEAMLEAD:
                    break;
                default:
                    break;
            }
            switch (developer4.getRange()){
                case JUNIOR:
                    break;
                case SENIOR:
                    break;
                case MIDDLE:
                    break;
                case TEAMLEAD:
                    System.out.println("I am teamlead developer4");
                default:
                    break;
            }
        }

        }



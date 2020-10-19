package childs;

public class Developer4 extends Java{

        private static Range range;
        private String name;


        public Developer4(Range teamlead) {

        }
        public Developer4(String name, Range range) {
            this.name = name;
            this.range = range;

        }

        public Range getRange() {
            return range;
        }

        public void setRange(Range range) {
            this.range = range;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void printDeveloperGrade(){
            System.out.println("I am teamlead developer");
            //System.out.println("I am teamlead developer4");
        }
        public void printPhrase(){
             System.out.println("I am teamlead developer");
    }

    }


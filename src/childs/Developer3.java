package childs;

public class Developer3 extends Java{

        private Range range;
        private String name;


        public Developer3(Range middle) {

        }
        public Developer3(String name, Range range) {
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
            System.out.println("I am middle developer");
            //System.out.println("I am middle developer3");
        }

    }



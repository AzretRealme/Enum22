package childs;

public class Java {

        private static Range range;
        private String name;


        public Java() {

        }
        public Java(String name, Range range) {
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
            System.out.println("I am developer");
        }

}

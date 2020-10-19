package childs;

public class Developer2 extends Java {

    private Range range;
        private String name;


        public Developer2(Range senior) {

        }
        public Developer2(String name, Range range) {
            this.name = name;
            this.range = range;

        }

    public Developer2() {

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
            System.out.println("I am senior developer");
            }
    public void printPhrase(){
        System.out.println("I am senior developer");
    }
            //System.out.println("I am senior developer2");
        }




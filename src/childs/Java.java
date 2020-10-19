package childs;

public class Java {

        private Range range;
        private String phrase;


        public Java() {

        }
        public Java(String phrase, Range range) {
            this.phrase = phrase;
            this.range = range;

        }

        public Range getRange() {
            return range;
        }

        public void setRange(Range range) {
            this.range = range;
        }

        public String getString() {
            return phrase;
        }

        public void setString(String phrase) {
            this.phrase = phrase;
        }

        public void printDeveloperGrade(){
            System.out.println("I am developer");
        }
        public void printPhrase(){
            System.out.println("I am developer");
        }

}

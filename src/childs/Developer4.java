package childs;

public class Developer4 extends Java{

    private Range range;
    private String phrase;


    public Developer4() {

    }
    public Developer4(String phrase, Range range) {
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
            System.out.println("I am teamlead developer");
            //System.out.println("I am teamlead developer4");
        }
        public void printPhrase(){
             System.out.println("I am teamlead developer");
    }

    }


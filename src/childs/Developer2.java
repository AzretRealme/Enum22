package childs;

public class Developer2 extends Java {

    private Range range;
    private String phrase;


    public Developer2() {

    }
    public Developer2(String phrase, Range range) {
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
            System.out.println("I am senior developer");
            }
    public void printPhrase(){
        System.out.println("I am senior developer");
    }
            //System.out.println("I am senior developer2");
        }




package parent;

import childs.Range;

public class Developer{


    private String phrase;
    private Range range;

    public Developer(String phrase) {

    }

    public Developer(String phrase, Range range) {
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
        System.out.println(phrase);
    }
    public void printPhrase(){
        System.out.println(phrase);
    }

}

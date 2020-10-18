package childs;

//import static childs.Range.*;

public class Developer extends Java{

    private Range range;
    private String name;


    public Developer(Range junior) {

    }
    public Developer(String name, Range range) {
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
        System.out.println("I am junior developer");
        }


    }



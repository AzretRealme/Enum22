package childs;

public enum Phrasee {

    JUNIOR("I am Junior Developer"){
        @Override
        void printPhrase(){

        }
    },
    MIDDLE("I am Senior Developer"){
        @Override
        void printPhrase(){

        }
    },
    SENIOR("I am Middle Developer"){
        @Override
        void printPhrase(){

        }
    },
    TEAMLEAD("I am Teamlead Developer"){
        @Override
        void printPhrase(){

        }
    };

    String phrase;

    Phrasee(String phrase) {
        this.phrase = phrase;
    }
    Phrasee(){

    }
    boolean hasPhrase(){
        return phrase != null;
    }
    abstract void printPhrase();
}

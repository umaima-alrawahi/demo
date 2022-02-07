package demo.demo;

/**
 * AClass
 */
public class AClass {
    private String textA;

    public AClass(String textA){
        this.textA = textA;
    }

    public String getTextA(){
        return textA;
    
    }

    @Override
    public String toString(){
    return textA;
    }

    
}
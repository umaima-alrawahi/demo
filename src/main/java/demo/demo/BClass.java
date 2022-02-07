package demo.demo;

public class BClass{
    private final AClass aclass;

    public BClass(AClass aclass){
        this.aclass = aclass;
        
    }

    public String getAValue() {
        return this.aclass.getTextA();
    }

    
}

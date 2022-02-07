package demo.demo;

public class CClass{
    private final BClass bclass;

    public CClass(BClass bclass){
        this.bclass = bclass;
    }
    
    public String getCValue() {
        return this.bclass.getAValue();
    }
    
}

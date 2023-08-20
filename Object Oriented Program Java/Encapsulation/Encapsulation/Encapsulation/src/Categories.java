public class Categories {
    private int id;
    private String name;
    private boolean expensive;

    public Categories() {
        super();
    }

    public Categories(int id, String name, boolean expensive) {
        super();
        this.id = id;
        this.name = name;
        this.expensive = expensive;
    }

    //getterIntId;
    public int getId(){
        return this.id;
    }

    //setterIntId
    public void setId(int id){
        this.id = id;
    }

    //getterStringName;
    public String getName(){
        return this.name;
    }

    //setterStringName
    public void setName(String name){
        this.name = name;
    }

    //getterBooleanExpensive;
    public boolean isExpensive(){
        return this.expensive;
    }

    //setterBooleanExpensive
    public void setExpensive(boolean expensive){
        this.expensive = expensive;
    }

}
package AnimalRescuer;

public class cat extends Animal {

    private String thenameofyourfavoritefood ;
    private String thenameoffavoriterecreationactivity ;
    private String whiskers;
    private String claws;




    public void setthenameofyourfavoritefood(String thenameofyourfavoritefood) {
        this.thenameofyourfavoritefood = thenameofyourfavoritefood;
    }

    public String getThenameofyourfavoritefood() {
        return thenameofyourfavoritefood;
    }
    public void run (){
        System.out.println("Running");
    }



    public void purs(){
        System.out.println("Pursing");
}


    public String getWhiskers() {
        return whiskers;
    }

    public void setWhiskers(String whiskers) {
        this.whiskers = whiskers;
    }

    public String getClaws() {
        return claws;
    }

    public void setClaws(String claws) {
        this.claws = claws;
    }
}



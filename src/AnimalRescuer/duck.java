package AnimalRescuer;

public class duck extends Animal{

    private String thenameofyourfavoritefood ;
    private String thenameoffavoriterecreationactivity ;
    private  float wingsDimensions;
    private String quacks;




    public void setthenameofyourfavoritefood(String thenameofyourfavoritefood) {
        this.thenameofyourfavoritefood = thenameofyourfavoritefood;
    }

    public String getThenameofyourfavoritefood() {
        return thenameofyourfavoritefood;
    }
    public void run (){
        System.out.println("Running");
    }

        public void sing(){
            System.out.println("Singing");
        }
        public void fly(){
            System.out.println("Fliyng");
    }

    public float getWingsDimensions() {
        return wingsDimensions;
    }

    public void setWingsDimensions(float wingsDimensions) {
        this.wingsDimensions = wingsDimensions;
    }

    public String getQuacks() {
        return quacks;
    }

    public void setQuacks(String quacks) {
        this.quacks = quacks;
    }
}


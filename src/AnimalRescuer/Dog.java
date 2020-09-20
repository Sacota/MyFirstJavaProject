package AnimalRescuer;

public class Dog extends Animal{


    private String thenameofyourfavoritefood ;
    private String thenameoffavoriterecreationactivity ;
    private String wagsthetail;
    private String sniffsaround;



    public void setthenameofyourfavoritefood(String thenameofyourfavoritefood) {
        this.thenameofyourfavoritefood = thenameofyourfavoritefood;
    }

    public String getThenameofyourfavoritefood() {
        return thenameofyourfavoritefood;
    }

    public void run (){
        System.out.println("Running");
        }

            public void barks(){
                System.out.println("Barksing");
            }

    public String getWagsthetail() {
        return wagsthetail;
    }

    public void setWagsthetail(String wagsthetail) {
        this.wagsthetail = wagsthetail;
    }

    public String getSniffsaround() {
        return sniffsaround;
    }

    public void setSniffsaround(String sniffsaround) {
        this.sniffsaround = sniffsaround;
    }
}





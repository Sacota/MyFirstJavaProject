package AnimalRescuer;

public class AppMain {


    public static void main(String[] args) {

    Dog rex= new Dog();
    adaptor AAA= new adaptor();
    petfood purina= new petfood();
    recreationactivity running= new recreationactivity();
    veterinary name= new veterinary();




        System.out.println("Catelul meu se numeste"+ rex.getName() + "are varsta de"+ rex.getAge() + "are culoare"
               + rex.getColor() + "nivelul de sanatate este" + rex.getHelthstatus() + "ii este foame"+
                rex.getHungri()+ "ii place mancarea de la"+rex.getThenameofyourfavoritefood());

    }




}

public class Decisiones {

    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = false;
        double notaDeLaPelicula = 8.2;
        String plan = "plus";

        if (fechaDeLanzamiento >= 2022){
            System.out.println("Peliculas mas populares");
        }else{
            System.out.println("Peliculas mas antiguas");
        }
//No tan correcta la comparacion
//        if (incluidoEnElPlan == true){
//            System.out.println("Incluido en el plan");
//        }else {
//            System.out.println("No incluido");
//        }

        //Comparacion correcta
        // || == a o && == a y
        // y es para ambas verdadderas, o es para solo si se cumple una de las 2
        if (incluidoEnElPlan && plan.equals("plus")){
            System.out.println("Disfrute de su pelicula");
        }else {
            System.out.println("Disculpe, no disponible en plan actual");
        }
    }
}

public class Main {
        public static void main(String[] args) {
            Player player1=new Player("Tavi Popescu",279,11000,30, new Country(2,"Romania"));
            Player player2=new Player("Florinel Coman",5,278,22,new Country(1,"Pakistan"));
            Player player3=new Player("Mirel Radoi",10,258,56,new Country(4,"Poland"));

            StreamCollectorsExercise streamCollectorsExercise=new StreamCollectorsExercise();
           // System.out.println(streamCollectorsExercise.getPlayersByCountry());

            //System.out.println(streamCollectorsExercise.getTotalRunsByCountry());
            System.out.println(streamCollectorsExercise.getTotalRunsByCountry());

        }
    }


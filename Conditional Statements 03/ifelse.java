public class ifelse {
        public static void main (String args[]){
            int age = 16;
            if (age >= 18) {
                System.out.println("adult : drive, vote");
            }
            if (age > 13 && age < 18) {
                System.out.println("Teenage");
            }
            else{
                System.out.println("Not Adult");
            }
        }
}
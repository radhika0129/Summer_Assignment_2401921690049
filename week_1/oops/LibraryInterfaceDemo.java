public class LibraryInterfaceDemo {

    public static void main(String[] args) {


        // Kid User Test Case

        KidUsers kid1 = new KidUsers();

        kid1.age = 10;
        kid1.bookType = "Kids";

        kid1.registerAccount();
        kid1.requestBook();



        KidUsers kid2 = new KidUsers();

        kid2.age = 18;
        kid2.bookType = "Fiction";

        kid2.registerAccount();
        kid2.requestBook();



        // Adult User Test Case

        AdultUser adult1 = new AdultUser();

        adult1.age = 5;
        adult1.bookType = "Kids";

        adult1.registerAccount();
        adult1.requestBook();



        AdultUser adult2 = new AdultUser();

        adult2.age = 23;
        adult2.bookType = "Fiction";

        adult2.registerAccount();
        adult2.requestBook();

    }
}
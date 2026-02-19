import java.util.ArrayList;

public class Main {



    // opgave 1 student name og alder
    /*
    public static void main() {

        ArrayList<Student>printAll = new ArrayList<>();
        Student s1 = new Student("Lars", 20);
        Student s2 = new Student("Morten", 19);
        Student s3 = new Student("Frederik", 23);

        printAll.add(s1);
        printAll.add(s2);
        printAll.add(s3);

        printAllStudents(printAll);
        printOldestStudent(printAll);



    }


   static void printAllStudents(ArrayList<Student> list) {

       for (Student p : list) {
           p.printInfo();

       }
   }

   static void printOldestStudent(ArrayList<Student> old){

        Student oldest = old.get(0);
        for (Student p : old){
            if(p.age > oldest.age){
                oldest = p;
            }

        }
       System.out.println("Den ældste er: ");
       oldest.printInfo();
    }
     */ //--------------------------------------------------------------//

    //opgave 2 Product klasse
    /*
    //-------------------------------------------------------------------//

    public static void main(){

        ArrayList<Product> products = new ArrayList<>();

        // Opret produkter
        Product p1 = new Product("Laptop", 6000);
        p1.addTag("electronics");
        p1.addTag("sale");

        Product p2 = new Product("Phone", 4000);
        p2.addTag("electronics");

        Product p3 = new Product("TV", 8000);
        p3.addTag("sale");

        // Put i array
        products.add(p1);
        products.add(p2);
        products.add(p3);

        // 1. Løb gennem array og check hasTag("sale")
        System.out.println("Produkter på sale:");
        for (Product p : products) {
            if (p.hasTag("sale")) {
                p.priceInfo();
            }
        }

        // 2. Find dyreste produkt
        if (!products.isEmpty()) {
            Product mostExpensive = products.get(0);

            for (Product p : products) {
                if (p.price > mostExpensive.price) {
                    mostExpensive = p;
                }
            }

            System.out.println("\nDyreste produkt:");
            mostExpensive.priceInfo();
        }
    }
    */

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Anna", 1000);

        account.deposit(400);
        account.withdraw(2100);
        account.deposit(12000);
        account.withdraw(3100);
        account.withdraw(5200);
}










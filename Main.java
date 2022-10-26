import java.util.*;

public class Main {

    /**
     * @param id     is the contact id witch is saved in the contact object later on
     * @param index  is used as index of contact array to access each object in this
     *               array of objects from contact class
     * @param con    is an array of objects from Contact class
     * @param jline  is simply an input object
     * @param status is used to declare if the code is running or not (switches by
     *               the exit command from user)
     */
    public static void main(String[] args) {
        Scanner jline = new Scanner(System.in);
        Contact con[] = new Contact[1000];
        int id = 1;
        int index = 0;
        int status = 0;
        while (status == 0) {
            /* recieving the command */
            System.out.print("enter your command: ");
            String command = jline.nextLine();
            /*
             * checking what the command is
             * an acting according to that
             */

            /*
             * when add is called
             * this assign the input values to objects
             */
            if (command.equals("add")) {
                con[index] = new Contact();
                System.out.print("    first name: ");
                con[index].setFirstname(jline.nextLine());
                System.out.print("    last name: ");
                con[index].setLastname(jline.nextLine());
                System.out.print("    phone number: ");
                con[index].setPhonenumber(jline.nextLine());
                System.out.print("    email: ");
                con[index].setEmail(jline.nextLine());
                System.out.print("    birthdate: ");
                con[index].setBirthdate(jline.nextLine());
                con[index].setId(id);
                System.out.println("####");
                System.out.println("id: " + id);
                id += 1;
                index += 1;
            }
            /*
             * this sets the empty objects of array to null
             * avoiding runtime errors
             */
            for (int j = 0; j < con.length; j++) {
                if (j > index) {
                    con[j] = new Contact(0);
                }
            }
            /*
             * When list command is called
             * Displays all saved commands so far.
             */
            if (command.equals("list")) {
                int i = 0;
                while (i < index) {
                    con[i].display();
                    i += 1;
                }
            }
            /*
             * the following parts are for the search feature
             */
            if (command.equals("search-by-phone")) {
                int pfound = 0;
                System.out.print("phone number: ");
                String srcnm = jline.nextLine();
                int k = 0;
                while (k < index) {
                    if (con[k].checkerNum(srcnm)) {
                        con[k].display();
                        pfound += 1;
                        k += 1;
                    } else {
                        k += 1;
                    }
                }
                /*
                 * This part is neccessary to avoid outputting the not found message for
                 * multiple times
                 */
                if (pfound == 0) {
                    System.out.println("####");
                    System.out.println("no contacts found");
                }
            }
            if (command.equals("search-by-email")) {
                int efound = 0;
                System.out.print("email: ");
                String srcem = jline.nextLine();
                int z = 0;
                while (z < index) {
                    if (con[z].checkerEm(srcem)) {
                        con[z].display();
                        efound += 1;
                        z += 1;
                    } else {
                        z += 1;
                    }
                }
                if (efound == 0) {
                    System.out.println("####");
                    System.out.println("no contacts found");
                }
            }
            if (command.equals("exit")) {
                status = 1;
            }
        }
    }
}
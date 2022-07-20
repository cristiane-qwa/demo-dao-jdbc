package apllication;

import model.model.entities.Department;
import model.model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Department obj = new Department(1, "Books");

        Seller seller = new Seller(21, "Bob", "Bob@gmail.com", new Date(), 3000.0, obj);
        System.out.println(seller);
    }

}

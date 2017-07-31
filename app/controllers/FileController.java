package controllers;

import play.mvc.Controller;
import play.mvc.Result;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class FileController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result getFile() {
        File file = new File("/home/yongmu/MIDBatch.csv");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while(scanner.hasNext()) {
            System.out.println(scanner.next());
        }
        return ok(file);
    }

}

package cs1302.gui;

import javafx.application.Application;

/**
 * A simple driver program to launch our CSCI 1302 Image Application.
 */
public class ImageDriver {

    /**
     * The main entry point of the application.
     *
     * @param args the command-line arguments to the program.
     */
    public static void main(String[] args) {
        try {
            Application.launch(ImageApp.class, args);
        } catch (Exception e) {
            System.err.println(e);
            e.printStackTrace();
            System.err.println("Likely due to X11 timeout. Logout and log back in...");
            System.exit(1);
        } // try
    } // main

} // ImageDriver

package service;

import java.io.FileNotFoundException;
import java.util.Scanner;
import util.filereader;

public class addnewexp {
    public static void expAdder() throws FileNotFoundException {

        System.out.println("Refer the below format to save entry");

        String path = "C:\\Users\\swapn\\Desktop\\Code\\Calculator\\expencetracker\\json\\addnewexp.json";

        filereader.jsonreader(path);
        Scanner sc = new Scanner(System.in);


    }
}

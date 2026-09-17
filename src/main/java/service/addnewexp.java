package service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.Expense;

public class addnewexp {
    public static void expAdder() throws FileNotFoundException {

        System.out.println("Refer the below format to provide input");

          Scanner sc = new Scanner(System.in);
          Gson gson  = new Gson();
          String path = "C:\\Users\\swapn\\Desktop\\Code\\Calculator\\expencetracker\\json\\addnewexp.json";
        FileReader reader = new FileReader(path);
        Type type = new TypeToken<List<Expense>>() {}.getType();

        List<Expense> expenses = gson.fromJson(reader, type);
        System.out.println(Expense.getDetail());

    }
}

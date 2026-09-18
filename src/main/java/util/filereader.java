package util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.Expense;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

public class filereader {

    public static void jsonreader(String path) throws FileNotFoundException {

        Gson gson  = new Gson();
        FileReader reader = new FileReader(path);
        Type type = new TypeToken<List<Expense>>() {}.getType();

        List<Expense> expenses = gson.fromJson(reader, type);
        for (Expense expense : expenses) {
            System.out.println(expense.getNumber() +": "+ expense.getDetail());
        }
    }

}

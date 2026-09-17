package service;

import controller.expencetrack;

import java.io.FileNotFoundException;

public class inputhandler {


    public static String getInputValue(int number) throws FileNotFoundException {

/*
        System.out.println("1. Want to add new expence");
        System.out.println("2. Want to preview your expence");
        System.out.println("3. Want to preview your expence Category wise");
        System.out.println("4. Exit");*/


        switch (number){

            case 1 :
                addnewexp.expAdder();
;                break;
            case 2 :
                previewexp.expPreviewer();
                break;
            case 3 :
                previewexp.expPreviewerCatwise();
                break;
            case 4 :
                expencetrack.callingInput();
                break;
            default :
                System.out.println("Please provide proper input");
                expencetrack.callingInput();
                break;

        }




        return null;
    }


}

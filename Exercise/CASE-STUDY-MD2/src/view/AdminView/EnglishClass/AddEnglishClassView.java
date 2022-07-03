package view.AdminView.EnglishClass;

import controller.EnglishClassController;
import model.Class.EnglishClass;
import model.Class.Shift;
import view.Common.CommonView;

import java.util.Scanner;

public class AddEnglishClassView {
    EnglishClassController englishClassController=new EnglishClassController();
    public AddEnglishClassView(CommonView commonView , Scanner scanner){
        Shift classShift=englishClassController.addEnglishClassShift(commonView,scanner);
        String className= englishClassController.addEnglishClassName(commonView,scanner,classShift);
        int classNumberSlot= englishClassController.AddNumberSlot(commonView,scanner);
        englishClassController.saveNewClass(commonView,scanner,className,classNumberSlot,classShift);
    }
}

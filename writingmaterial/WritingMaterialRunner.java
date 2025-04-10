package com.xworkz.writingmaterial;

import com.xworkz.writingmaterial.notebook.Notebook;
import com.xworkz.writingmaterial.writingmaterial.WritingMaterial;

public class WritingMaterialRunner {
    public static void main(String[] args) {
        WritingMaterial writingMaterial = new WritingMaterial();
        writingMaterial.validateWritingMaterialDetails();

        Notebook notebook = new Notebook();
        notebook.validateWritingMaterialDetails();

    }

}

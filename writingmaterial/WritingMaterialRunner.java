package com.xworkz.writingmaterial;

import com.xworkz.writingmaterial.notebook.Notebook;
import com.xworkz.writingmaterial.writingmaterial.WritingMaterial;

public class WritingMaterialRunner {
    public static void main(String[] args) {


        WritingMaterial writingMaterial = new WritingMaterial();
        writingMaterial.validateWritingMaterialDetails();
        writingMaterial.materialType();
        writingMaterial.uses();
        writingMaterial.durability();
        writingMaterial.storage();


        Notebook notebook = new Notebook();
        notebook.validateWritingMaterialDetails();
        notebook.notebookType();
        notebook.pageCount();
        notebook.coverMaterial();
        notebook.notebookSize();


        WritingMaterial polymorphicWritingMaterial = new Notebook();
        polymorphicWritingMaterial.validateWritingMaterialDetails();
        polymorphicWritingMaterial.materialType();
        polymorphicWritingMaterial.uses();
        polymorphicWritingMaterial.durability();
        polymorphicWritingMaterial.storage();
    }
}

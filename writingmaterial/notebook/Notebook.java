package com.xworkz.writingmaterial.notebook;

import com.xworkz.writingmaterial.writingmaterial.WritingMaterial;

public class Notebook extends WritingMaterial {

    @Override
    public void validateWritingMaterialDetails() {
        System.out.println("Notebook: A collection of pages used for writing or recording information.");
    }

    public void notebookType() {
        System.out.println("This is a spiral-bound notebook with ruled pages.");
    }

    public void pageCount() {
        System.out.println("The notebook contains 200 pages.");
    }

    public void coverMaterial() {
        System.out.println("The cover of this notebook is made of durable cardboard with a textured finish.");
    }

    public void notebookSize() {
        System.out.println("The notebook is A5 size, perfect for daily notes and journaling.");
    }
}

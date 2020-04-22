package com.nfragiskatos.CreationalPatterns.Builder;

import java.util.ArrayList;
import java.util.List;

public class HtmlElement {
    public String name, text;
    public List<HtmlElement> elements = new ArrayList<>();
    private final int indentSize = 2;
    private final String newLine = System.lineSeparator();

    public HtmlElement(){

    }

    public HtmlElement(String name, String text) {
        this.name = name;
        this.text = text;
    }
}

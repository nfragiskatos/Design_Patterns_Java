package com.nfragiskatos.CreationalPatterns.Builder.HtmlBuilder;

import java.util.ArrayList;
import java.util.Collections;
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

    private String toStringImpl(int indent) {

        // Create tag with proper indent
        StringBuilder sb = new StringBuilder();
        String i = String.join("", Collections.nCopies(indent * indentSize, " "));
        sb.append(String.format("%s<%s>%s", i, name, newLine));

        // append internal text (if any)
        if (text != null && !text.isEmpty()) {
            sb.append(String.join("", Collections.nCopies(indentSize*(indent + 1), " ")))
                    .append(text)
                    .append(newLine);
        }

        // Recursive part to also print all internal elements
        for (HtmlElement e : elements) {
            sb.append(e.toStringImpl(indent + 1));
        }

        // print closing tag
        sb.append(String.format("%s</%s>%s", i, name, newLine));

        return sb.toString();
    }

    @Override
    public String toString() {
        return toStringImpl(0);
    }
}

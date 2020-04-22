package com.nfragiskatos.CreationalPatterns.Builder.Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CodeBuilder {

    private String clazzName;
    private List<ClazzField> fields = new ArrayList<>();
    private String nl = System.lineSeparator();

    public CodeBuilder(String clazzName) {
        this.clazzName = clazzName;
    }

    public CodeBuilder addField(String name, String type) {
        fields.add(new ClazzField(name, type));
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder((String.format("public class %s %s{%s", clazzName, nl, nl)));

        for (ClazzField field : fields) {
            sb.append("  ")
                    .append(String.format("%s %s;", field.type, field.name))
                    .append(nl);
        }
        sb.append("}");
        return sb.toString();
    }

    private class ClazzField {
        private String name, type;
        public ClazzField(String name, String type) {
            this.name = name;
            this.type = type;
        }
    }
}

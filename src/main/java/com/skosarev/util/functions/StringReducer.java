package com.skosarev.util.functions;

import java.util.List;

public class StringReducer implements Reducer<String, String> {
    @Override
    public String reduce(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s).append(" ");
        }
        return sb.toString().trim();
    }
}

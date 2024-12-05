package com.skosarev.util.functions;

import java.util.List;

public interface Reducer<T, P> {
    P reduce(List<T> list);
}

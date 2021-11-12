package com.company;

public class Some_values<Type_1, Type_2, Type_3> {
    public Type_1 first;
    public Type_2 second;
    public Type_3 third;

    public Some_values(Type_1 _first, Type_2 _second, Type_3 _third) {
        first = _first;
        second = _second;
        third = _third;
    }

    public Type_1 getFirst(){
        return first;
    }
    public Type_2 getSecond(){
        return second;
    }
    public Type_3 getThird() {
        return third;
    }
}


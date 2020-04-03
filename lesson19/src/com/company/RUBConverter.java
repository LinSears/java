package com.company;

public class RUBConverter implements Converter {

    @Override
    public float convert(float value) {
        return value * 100f / 3.5f;
    }
}

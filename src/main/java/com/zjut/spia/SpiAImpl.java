package com.zjut.spia;

import com.zjut.spiinterface.SpiModelInterface;

public class SpiAImpl implements SpiModelInterface {

    @Override
    public void helloSpi() {
        System.out.println("A======= say hello");
    }
}

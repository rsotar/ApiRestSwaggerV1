package com.rsotar.swagger;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Factors {

    private int first;

    private int second;


    public int getFirst() {return first;}

    public void setFirst(int first) {this.first = first;}

    public int getSecond() {return second;}

    public void setSecond(int second) {this.second = second;}


}

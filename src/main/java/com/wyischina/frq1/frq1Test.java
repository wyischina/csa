package com.wyischina.frq1;

public class frq1Test {
    public static void main(String[] args){
        LightSequence gradShow = new LightSequence("0101 0101 0101");
        gradShow.display();
        gradShow.changeSequence("0011 0011 0011");
        String resultSeq = gradShow.insertSegment("1111 1111", 4);
    }
}

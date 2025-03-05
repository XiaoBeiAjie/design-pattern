package org.example.adapter;

public class Speaker {
    public String speak() {
        return "aba_aba";
    }
}


interface Translator {
    public String translate();
}

class AdapterSpeaker implements Translator {
    Speaker speaker;
    public AdapterSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }
    @Override
    public String translate() {
        String s = speaker.speak();
        // 转化操作
        s = "我说" + s;
        return s;
    }
}
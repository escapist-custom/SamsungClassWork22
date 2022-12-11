package com.samsung;

public interface Liveable {

    boolean isLive = true;

    String breathe();
    String reproduction();

    String feed(Liveable[] liveables);

}

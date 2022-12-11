package com.samsung;

public interface Character {
    int maxDamage = 0;
    int maxArmor = 0;

    void attack(Character[] characters);

    void destroy();

}

package com.gilbert.designpattern.StrategyPattern;

import com.gilbert.designpattern.StrategyPattern.Item.Knife;
import com.gilbert.designpattern.StrategyPattern.Item.Sword;

public class main {
    public static void main(String[] args) {
        UserCharactor character = new UserCharactor();
        character.attack();

        character.setWeapon(new Knife());
        character.attack();

        character.setWeapon(new Sword());
        character.attack();
    }
}

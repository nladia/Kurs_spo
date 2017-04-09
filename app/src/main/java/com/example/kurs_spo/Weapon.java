package com.example.kurs_spo;

import java.util.Random;



public class Weapon {
    private Integer minDmg;
    private Integer maxDmg;

    Weapon()
    {
        minDmg = 0;
        maxDmg = 0;
    }

    void standartWeapon(Integer characterClass)
    {
        if (characterClass==1)
        {
            minDmg = 2;
            maxDmg = 3;
        }
        if (characterClass==2)
        {
            minDmg = 2;
            maxDmg = 4;
        }
        if (characterClass==3)
        {
            minDmg = 1;
            maxDmg = 4;
        }
    }

    void getNewWeapon(Integer characterClass, Integer characterLvl)
    {
        if (characterLvl <= 0)
            characterLvl = 1;

        Random rnd = new Random(System.currentTimeMillis());

        switch (characterClass)
        {
            case 1:
            {
                minDmg = rnd.nextInt(characterLvl + 1);
                maxDmg = rnd.nextInt(characterLvl + 3);
                break;
            }
            case 2:
            {
                minDmg = rnd.nextInt(characterLvl + 2);
                maxDmg = rnd.nextInt(characterLvl + 4);
                break;
            }
            case 3:
            {
                minDmg = rnd.nextInt(characterLvl);
                maxDmg = rnd.nextInt(characterLvl + 4);
                break;
            }
        }

        if (minDmg >= maxDmg)
            maxDmg = minDmg + 1;
    }

    Integer getMinDmg()
    {
        return minDmg;
    }

    Integer getDmgDiff()
    {
        return maxDmg - minDmg;
    }
}

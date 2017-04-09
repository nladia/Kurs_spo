package com.example.kurs_spo;

import java.util.concurrent.ThreadLocalRandom;

public class Monster {
    Integer hp;
    Integer minAtk;
    Integer maxAtk;
    Integer exp;

    public Monster(Integer type, Integer lvl)
    {
        switch (type)
        {
            case 1:{
                hp = 45;
                minAtk = 6;
                maxAtk = 8;
                exp = 12;
                break;
            }
            case 2:{
                hp = 45;
                minAtk = 6;
                maxAtk = 8;
                exp = 12;
                break;
            }
            case 3:{
                hp = 45;
                minAtk = 6;
                maxAtk = 8;
                exp = 12;
                break;
            }
        }
        hp += 52 * lvl;
        minAtk += 8 * lvl;
        maxAtk += 9 * lvl;
        exp += 2 * lvl;
    }

    public Integer attack(){
        return ThreadLocalRandom.current().nextInt(minAtk, maxAtk + 1);
    }

    public void takeDmg(int dmg)
    {
        hp -= dmg;
    }

    public Integer getHp() {
        return hp;
    }

    public Integer getExp() {
        return exp;
    }

    public Integer getMaxAtk() {
        return maxAtk;
    }

    public Integer getMinAtk() {
        return minAtk;
    }
}

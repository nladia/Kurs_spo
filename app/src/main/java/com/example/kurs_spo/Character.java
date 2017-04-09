package com.example.kurs_spo;

import com.example.kurs_spo.Weapon;

import java.util.Random;


public class Character {
    private Integer hp;
    private Integer lvl;
    private Integer attackPower;
    private Integer characterClass;
    private Integer exp;
    private Integer newLvlExp;
    private Integer maxHp;
    private Weapon weapon;

    void newWeapon(Weapon weapon)
    {
        this.weapon = weapon;
    }

    Character() {}

    Character(Integer characterClass)
    {
        newLvlExp = 7;
        this.characterClass = characterClass;
        exp = 0;

        switch (characterClass)
        {
            case 1:
            {
                attackPower = 10;
                hp = 200;
                maxHp = 200;
                lvl = 0;
                weapon = new Weapon();
                weapon.standartWeapon(characterClass);
                break;
            }
            case 2:
            {
                attackPower = 14;
                hp = 150;
                maxHp = 150;
                lvl = 0;
                weapon = new Weapon();
                weapon.standartWeapon(characterClass);
                break;
            }
            case 3:
            {
                attackPower = 12;
                hp = 100;
                maxHp = 100;
                lvl = 0;
                weapon = new Weapon();
                weapon.standartWeapon(characterClass);
                break;
            }
        }
    }

    void lvlUp()
    {
        switch (characterClass)
        {
            case 1:
            {
                attackPower++;
                maxHp += 70;
                hp += 70;
                break;
            }
            case 2:
            {
                attackPower += lvl / 2;
                maxHp += 30;
                hp += 30;
                break;
            }
            case 3:
            {
                attackPower += lvl;
                maxHp += 10;
                hp += 10;
                break;
            }
        }

        lvl++;
        newLvlExp += 2;
    }

    Integer attack()
    {
        Random rnd = new Random(System.currentTimeMillis());
        return attackPower + rnd.nextInt(weapon.getMinDmg() + weapon.getDmgDiff());
    }

    Integer getLvl()
    {
        return lvl;
    }

    void getDmg(Integer dmg)
    {
        if (hp - dmg <= maxHp)
            hp -= dmg;
        else
            hp = maxHp;
    }

    Integer getHp()
    {
        return hp;
    }

    Integer getMaxHp()
    {
        return maxHp;
    }

    void addExp(Integer monsterExp)
    {
        exp += monsterExp;
    }

    Integer getCharacterClass()
    {
        return  characterClass;
    }

    Integer getExp()
    {
        return exp;
    }

    Integer maxAttack()
    {
        return attackPower + weapon.getMinDmg() + weapon.getDmgDiff();
    }

    Integer minAttack()
    {
        return attackPower + weapon.getMinDmg();
    }

    Integer getNewLvlExp()
    {
        return  newLvlExp;
    }

    void increaseDmg(Integer dmg)
    {
        attackPower += dmg;
    }

    void setHp(Integer newHp)
    {
        hp = newHp;
    }

    void heal(Integer healCount)
    {
        Integer modifiedHeal = maxHp / 10;
        modifiedHeal *= healCount;

        if (modifiedHeal + hp >= maxHp)
            hp = maxHp;
        else
            hp += modifiedHeal;
    }

}

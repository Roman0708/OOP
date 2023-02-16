package Character;

public class Base_unit {
    protected int hp, maxHP, level, currentStamina, maxStamina, inventoryVolume, maxInventoryVolume, armor, damage;

    protected boolean team;                 //Через булевое значение реализована принадлежность к сторонам конфликта
    
    protected int position;                 //Юниты размещаются на одной числовой прямой


    public Base_unit(int maxHpValue, int levelValue, int staminaValue, boolean teamValue, int maxinventoryVolumeValue,
    int armorValue, int damageValue, int positionValue) {
        maxHP = maxHpValue;
        level = levelValue;
        currentStamina = staminaValue;
        team = teamValue;
        maxInventoryVolume = maxinventoryVolumeValue;
        inventoryVolume = maxInventoryVolume;
        armor = armorValue;
        damage = damageValue;
        position = positionValue;
    }

    public Base_unit() {
        maxHP = 100;
        hp = maxHP;
        level = 1;
        currentStamina = 100;
        team = true;
        maxInventoryVolume = 100;
        inventoryVolume = 0;
        armor = 0;
        damage = 0;
        position = 0;
    }

    public int getHP() {
        return this.hp;
    }
    
    public int getLevel() {
        return this.level;
    }

    public int getPosition() {
        return this.position;
    }

    public int getStamina() {
        return this.currentStamina;
    }

    public void move(int distance) {
        int staminaRequired = distance*this.armor;
        if (this.currentStamina >= staminaRequired) {
            this.position += staminaRequired;
            this.currentStamina -= staminaRequired;
        }
        else System.out.println("Not enough stamina");
    }
    
    // public void getDamage(int damage) {  
    //     Base_unit.hp -= damage;             //Что-то не работает, пока разбираюсь
    // }

}

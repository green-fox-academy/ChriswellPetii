package Aircrafts_Carrier;

public class Aircraft {
    private String type;
    private int ammo;
    private int maxAmmo;
    private int baseDamage;
    private int damage = this.ammo * this.baseDamage;

    Aircraft(int maxAmmo, int baseDamage) {
        this.ammo = 0;
        this.maxAmmo = maxAmmo;
        this.baseDamage = baseDamage;
    }

    Aircraft(int maxAmmo, int baseDamage, int ammo) {
        this.ammo = ammo;
        this.maxAmmo = maxAmmo;
        this.baseDamage = baseDamage;

    }

    private int fight() {
        this.ammo = 0;
        return this.damage;
    }

    public void refill(int amount) {
        if (amount > this.maxAmmo) {
            this.ammo = this.maxAmmo;
            amount -= this.maxAmmo;
        } else {
            this.ammo += amount;
        }
    }

    private String getType() {
        return this.type;
    }

    public void getStatus() {
        System.out.println("Type " + getType() + ", Ammo: " + this.ammo + ", Base Damage: " + this.baseDamage + ", All Damage: " + this.damage);
    }

    private boolean isPriority() {
        return this.ammo != this.maxAmmo;
    }

    public int getAmmo() {
        return this.ammo;
    }
    public int getDamage(){
        return this.damage;
    }

}

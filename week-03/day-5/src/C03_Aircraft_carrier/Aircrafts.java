package C03_Aircraft_carrier;

public class Aircrafts {

    String type;
    int MaxAmmo;
    int BaseDamage;
    int AmmoStorage;
    int Damage;

    public void F35(){
        this.type = "F35";
        this.MaxAmmo = 12;
        this.BaseDamage = 50;
        this.AmmoStorage = 0;
        this.Damage = 0;

    }

    public void F16(){
        this.type = "F16";
        this.MaxAmmo = 8;
        this.BaseDamage = 30;
        this.AmmoStorage = 0;
        this.Damage = 0;

    }

    public void fight(){
        for(int d = AmmoStorage -1; d >= 0; d--){
            this.AmmoStorage --;
            this.Damage +=  this.BaseDamage;
        }
    }

    public int RefillAmmo(){
        return Carrier.setMainAmmoStorage(Carrier.getMainAmmoStorage() - (this.MaxAmmo-this.AmmoStorage));
    }

}

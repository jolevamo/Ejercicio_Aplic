package com.company;

public class Watchman extends Person{
    private String weapon;
    private String restDay;

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getRestDay() {
        return restDay;
    }

    public void setRestDay(String workday) {
        this.restDay = workday;
    }
    public String mostrarWatcman(){
        return "Nombre: "+this.getName()+ "\n"+
                "Identificación: "+this.getIdentification()+"\n"+
                "Edad: "+this.getAge()+"\n"+
                "Arma: "+this.getWeapon()+"\n"+
                "Dia descanso: "+this.getRestDay();
    }
}

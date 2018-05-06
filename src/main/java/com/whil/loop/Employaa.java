package com.whil.loop;

public class Employaa {


    private int id;
    private String name;
    private double rateb;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRateb() {
        return rateb;
    }

    public void setRateb(double rateb) {
        this.rateb = rateb;
    }


    public double getSakn() {
        double getsakn = (10 * this.getRateb()) / 100;
        return getsakn;
    }

    public double getNaql() {
        double getnaql = (7 * this.getRateb()) / 100;
        return getnaql;
    }

    public double getTaminat() {

        double gettaminat = (3 * this.getRateb()) / 100;
        return gettaminat;

    }


    public double getsaffi() {
        double getsaffi = (this.getRateb() + this.getSakn() + this.getNaql()) - this.getTaminat();
        return getsaffi;
    }





}



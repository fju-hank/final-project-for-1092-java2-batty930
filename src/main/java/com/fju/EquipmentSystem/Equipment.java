package com.fju.EquipmentSystem;

public class Equipment {
    //建立屬性
    private String name;
    private String days;
    private double price;
    private String type;
    private boolean isBorrowed = false;
    //進行初始化
    public Equipment(String name, String days, double price, String type){
        this.name = name;
        this.days = days;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Equiment{" + "name='" + name + '\'' +
                ",days='" + days + '\'' +
                ",price='" + price + '\'' +
                ",type='" + type + '\'' +
                ",isBorrowed='" + isBorrowed + '\'' + '}';
    }
        public Double getPrice() {
        return  price;
        }

        public String getName() {
            return name;
        }

        public boolean isBorrowed() {
            return isBorrowed;
        }

        public void setBorrowed(boolean borrowed) {
            isBorrowed = borrowed;
        }
}


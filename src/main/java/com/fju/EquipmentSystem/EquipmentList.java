package com.fju.EquipmentSystem;

public class EquipmentList {
    // 給 EquipmentList 100的容量
    private Equipment[] equipments = new Equipment[100];
    private int size = 0;

    public EquipmentList(){
        equipments[0] = new Equipment("1.帳篷(含營釘、營繩)","4天(含)以下",200,"住");
        equipments[1] = new Equipment("1.帳篷(含營釘、營繩)","5天-10天",250,"住");
        equipments[2] = new Equipment("1.帳篷(含營釘、營繩)","11天-30天",350,"住");
        equipments[3] = new Equipment("1.天幕","4天(含)以下",50,"住");
        equipments[4] = new Equipment("1.天幕","5天-10天",100,"住");
        equipments[5] = new Equipment("1.天幕","11天-30天",150,"住");
        equipments[6] = new Equipment("1.地布","4天(含)以下",50,"住");
        equipments[7] = new Equipment("1.地布","5天-10天",100,"住");
        equipments[8] = new Equipment("1.地布","11天-30天",150,"住");
        equipments[9] = new Equipment("1.鍋具","4天(含)以下",50,"食");
        equipments[10] = new Equipment("1.鍋具","5天-10天",100,"食");
        equipments[11] = new Equipment("1.鍋具","11天-30天",200,"食");
        equipments[12] = new Equipment("1.爐頭","4天(含)以下",50,"食");
        equipments[13] = new Equipment("1.爐頭","5天-10天",100,"食");
        equipments[14] = new Equipment("1.爐頭","11天-30天",200,"食");
        equipments[15] = new Equipment("1.瓦斯罐","4天(含)以下",80,"食");
        equipments[16] = new Equipment("1.擋風板","4天(含)以下",20,"食");
        equipments[17] = new Equipment("1.擋風板","5天-10天",40,"食");
        equipments[18] = new Equipment("1.擋風板","11天-30天",60,"食");
        equipments[19] = new Equipment("1.水袋","4天(含)以下",50,"食");
        equipments[20] = new Equipment("1.水袋","5天-10天",100,"食");
        equipments[21] = new Equipment("1.水袋","11天-30天",200,"食");
        equipments[22] = new Equipment("1.濾水器","4天(含)以下",50,"食");
        equipments[23] = new Equipment("1.濾水器","5天-10天",100,"食");
        equipments[24] = new Equipment("1.濾水器","11天-30天",200,"食");
        equipments[25] = new Equipment("1.開山刀","4天(含)以下",50,"行");
        equipments[26] = new Equipment("1.開山刀","5天-10天",100,"行");
        equipments[27] = new Equipment("1.開山刀","11天-30天",200,"行");
        equipments[28] = new Equipment("1.登山包","4天(含)以下",100,"私");
        equipments[29] = new Equipment("1.登山包","5天-10天",150,"私");
        equipments[30] = new Equipment("1.登山包","11天-30天",250,"私");
        equipments[31] = new Equipment("1.睡袋","4天(含)以下",50,"私");
        equipments[32] = new Equipment("1.睡袋","5天-10天",100,"私");
        equipments[33] = new Equipment("1.睡袋","11天-30天",200,"私");
        equipments[34] = new Equipment("1.睡墊","4天(含)以下",10,"私");
        equipments[35] = new Equipment("1.睡墊","5天-10天",20,"私");
        equipments[36] = new Equipment("1.睡墊","11天-30天",40,"私");
        equipments[37] = new Equipment("1.防寒外套","4天(含)以下",50,"私");
        equipments[38] = new Equipment("1.防寒外套","5天-10天",100,"私");
        equipments[39] = new Equipment("1.防寒外套","11天-30天",200,"私");
        equipments[40] = new Equipment("1.頭燈","4天(含)以下",50,"私");
        equipments[41] = new Equipment("1.頭燈","5天-10天",100,"私");
        equipments[42] = new Equipment("1.頭燈","11天-30天",200,"私");

        size = 43;

    }

    // 後面需要針對其中的某一個裝備進行操作.
    public Equipment getEquipment(int index) {
        return equipments[index];
    }

    public void setEquipment(int index, Equipment equipment) {
        equipments[index] = equipment;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

}

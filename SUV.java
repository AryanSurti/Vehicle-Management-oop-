public class SUV extends Car {
    SUV(String name, boolean isManual) {
        super(name, 4, 5, 6, isManual, "SUV");//inside defined(hardcode)


    }

    public void acclerate(int rate){
        int newspeed=getCurrentSpeed()+rate;
        /*
        * speed 0-10:gear 1
        * speed 10-20:gear 2
        * speed 20-30:gear 3
        * speed 30-40:gear 4
        * speed 40-50:gear 5
        * gear 6
         */
        if (newspeed==0) {
            stop();
            changeGear(1);
        }else if (newspeed>0 && newspeed<=10){
            changeGear(1);
        }
        else if (newspeed>10 && newspeed<=20){
            changeGear(2);

        }
        else if (newspeed>20 && newspeed<=30){
            changeGear(3);
        }
        else if (newspeed>30 && newspeed<=40){
            changeGear(4);
        }
        else if (newspeed>40 && newspeed<=50){
            changeGear(5);
        }
        else {
            changeGear(6);
        }
        if (newspeed>0){
            changeSpeed(newspeed,getCurrentDirection());
        }

    }

}

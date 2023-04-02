package basic.homeworks;

public class homework28032023 {
    public void main(String[] args) {
        boolean isWeekend = true;
        boolean isRain = false;

        boolean isReweOpen = false;
        boolean isEdekaOpen = true;

        double temperature1 = 102.5;
        double temperature2 = 98.2;



        work1(isWeekend, isRain);
        canBuy(isEdekaOpen, isReweOpen);
        canWork(temperature1, temperature2);
    }




    private static Boolean work1(boolean isWeekend, boolean isRain){
        //boolean isWeekend = true;
        //boolean isRain = false;
        boolean canWalk = (isWeekend = true) && (isRain = false);
        return  canWalk;
    }

    private static Boolean canBuy(boolean isEdekaOpen, boolean isReweOpen){
        boolean canBuy = (isEdekaOpen = true) || (isReweOpen = true);
        System.out.println("Я могу купить еду, это" + canBuy);
        return canBuy;

    }

    private static Boolean canWork(double temperature1, double temperature2 ){
        boolean result = (temperature1 > 100) && (temperature2 < 100);
        return result;
    }
}

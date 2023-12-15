public class Task1 {
    public static void main(String[] args) {
        boolean isEdekaOpen = false;
        boolean isReweOpen = true;
        boolean canBuyFood = canBuy(isEdekaOpen, isReweOpen);

        if (canBuyFood) {
            if (isEdekaOpen && isReweOpen) {
                System.out.println("Я могу купить еду, это Edeka и Rewe");
            } else if (isEdekaOpen) {
                System.out.println("Я могу купить еду, это Edeka");
            } else {
                System.out.println("Я могу купить еду, это Rewe");
            }
        } else {
            System.out.println("Я не могу купить еду, оба магазина закрыты");
        }
    }

    private static boolean canBuy(boolean isEdekaOpen, boolean isReweOpen) {
        return isEdekaOpen || isReweOpen;
    }
}
//1. Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
//        Реализует логический метод canBuy,  возвращающий boolean
//        Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
//        Отобразите строку «Я могу купить еду, это ……» и значение.


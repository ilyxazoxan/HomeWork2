public class DiscountsOnShirts {
    public static void main(String[] args) {
        int shirtPrice = 1350;
        int selectedShirts = 8;
        int discountFrom = 10;
        long add = discountFrom - selectedShirts;
        System.out.println("Столько рубашек нужно докупить для получения скидки: " + add);
        long price = selectedShirts * shirtPrice;
        System.out.println("Цена выбранных рубашек без скидки: " + price);
        long priceAll = discountFrom * shirtPrice;
        System.out.println("Цена за количество рубашек, от которого количества идет скидка: " + priceAll);
        double discount = 0.38;
        System.out.println("Процент скидки при покупке 10 рубашек: " + discount);
        double discountedPriceOfAllShirts = priceAll * discount;
        System.out.println("Процент скидки при покупке 10 рубашек" + discount);
        double discountedPriceOfOneShirt = shirtPrice * discount;
        System.out.println("Количество сэкономленых денег при осуществлении скидки" + discountedPriceOfOneShirt);
        double saved = priceAll - discountedPriceOfAllShirts;
        System.out.println("Количество рубашек которые можно купить на сэкономленные деньги" + saved);

    }
}





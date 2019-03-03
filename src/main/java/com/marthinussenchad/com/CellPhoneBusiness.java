package com.marthinussenchad.com;

import java.util.*;

/**
 * Created by ChadMarthinussen2 on 2019/03/03.
 */
public class CellPhoneBusiness {


    private static final String [] cellPhones = {"IPhone","Alcatel","Vodaphone", "Samsung", "ZTE", "Sony"};

    public static void main(String[] args) {

        new MobilePhones();
    }


    private static class MobilePhones {

        public MobilePhones() {

            List<String> arrangement = new ArrayList<>();

            for(String name : cellPhones)
                arrangement.add(name);
            System.out.println("Cellphones AVAILABLE: " );
            for(int i = 0; i < arrangement.size();i++)
                System.out.printf("%s, ", arrangement.get(i++));
            MobilePhonePrices(arrangement);
        }



        private void MobilePhonePrices(Collection<String > collection){

            Set<String> set = new LinkedHashSet<>(collection);
            System.out.println();
            System.out.println("\n"+"List of Mobile Phone Manufacturers ");
            for (String expensiveMobilePhones : set)
                System.out.printf("%s " + "\n",expensiveMobilePhones);
            Map MobilePhones  = new HashMap();

            System.out.println();
            MobilePhones.put("IPhone : ", + 16000);
            MobilePhones.put("Samsung : ", + 10000 );
            MobilePhones.put("Google Phone : ",5000);
            MobilePhones.put("Hauwei : ", 5000);
            System.out.println("Price of MobilePhones :  ");
            for(Object key : MobilePhones.keySet())
                System.out.println(key + "-"+ MobilePhones.get(key));
        }

    }
}

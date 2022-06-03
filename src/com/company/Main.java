package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Days days1=Days.MONDAY;
        Days days2=Days.TUESDAY;
        Days days3=Days.WEDNESDAY;
        Days days4=Days.THURSDAY;
        Days days5=Days.FRIDAY;
        Days days6=Days.SATURDAY;
        Days days7=Days.SUNDAY;
        Days[] kundor={days1,days2,days3,days4,days5,days6,days7};
        Random random=new Random();
        int a= random.nextInt(0,7);
        System.out.println(kundor[a]);



   switch (kundor[a]){
       case MONDAY :
           System.out.println("Dyishomby kunu Java tachnicheskiy sabak okuimun");
           break;
       case TUESDAY:
           System.out.println("Sheidhembi kyny anglis tilin okuimun");
           break;
       case WEDNESDAY:
           System.out.println("Charshembi kunu Java tachnicheskiy sabak okuimun ");
           break;
       case THURSDAY:
           System.out.println("Beishembi kunu Skill soft okuimun");
           break;
       case FRIDAY:
           System.out.println("Juma kunu Java tachnicheskiy sabak okuimun ");
           break;
       case SATURDAY:
           System.out.println("Ishembi kunu oz aldyncha kaitaloo kylamyn");
           break;
       case SUNDAY:
           System.out.println("Jekshembi kunu es alam");
           break;
       default:
           System.out.println("Kindordun atalyshyn kata jazdynyz");
   }



    }
}

package main.java.tasks.day4;
/*имеется текст лога в виде:
        access_log.2020.09.07 212.168.101.5 granted
        access_log.2020.09.07 212.168.101.6 denied
        написать метод, который выводит список из уникальных IP адресов и количества удачных и неудачных попыток доступа в формате:
        ip 212.168.101.5: ok - 3, failed - 2*/

public class ReturnIPList {

    public static void main(String[] args) {

        String iPList = "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.101.6 granted\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.167.101.6 granted";

        String shortIpList = iPList.replaceAll(iPList.substring(0, 22), "");
        System.out.println(shortIpList);

        String[] splitShortIPList = shortIpList.split("\\n");
        String[][] arrayBig = new String[splitShortIPList.length][3];

        //[0] = String "IP"
        //[1] = String "granted as number"
        //[2] = String "denied as number"

        for (String[] summaryItem : arrayBig){
            for (int i = 0; i < 3; i++){
                summaryItem[i] = "0";
            }
        }

        int unique = 0;

        for (String splitIpAndAccess : splitShortIPList) {
            String[] oneAccess = splitIpAndAccess.split("\\s");

                for (int e = 0; e < arrayBig.length; e++ ) {

                    if (arrayBig[e][0] == oneAccess[0]){
                        if (oneAccess[1].equals("granted")) {
                            //TODO;
                        } else {
                            ;
                        }

                    } else {
                        if (arrayBig[e][0] == null) {
                            arrayBig[e][0] = oneAccess[0];
                        }
                    }


            }
        }

        //System.out.println("ip " + [0] + ": granted - " + [1] + ", denied -" + [2]);
    }
}

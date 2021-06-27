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

        String[] arraySplit = shortIpList.split("\\n");
        String[][] arrayBig = new String[arraySplit.length][3];
        int counterOk = 1;
        int counterError = 1;

        for (String i : arraySplit) {
            String[] oneAccess = shortIpList.split("\\s");

                for (int e = 0; e < arrayBig.length; e++ ) {
                    if (arrayBig[e][Integer.parseInt(oneAccess[0])] == null) {
                        arrayBig[e][Integer.parseInt(oneAccess[0])] = oneAccess[0];
                    } else {
                        if (arrayBig[e][Integer.parseInt(oneAccess[0])] == oneAccess[0]) {
                            if (oneAccess[1].equals("granted")) {
                                arrayBig[e][1] = Integer.toString(counterOk);
                                counterOk++;
                            } else {
                                arrayBig[e][1] = Integer.toString(counterError);
                                counterError++;
                            }
                        } else {

                    }
                }
            }
        }
    }
}

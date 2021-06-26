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
        String[][] array = new String[arraySplit.length][3];
        int counterOk = 1;
        int counterError = 1;
        for (String i : arraySplit) {
            String[] oneAccess = shortIpList.split("\\s");

            for (String[] e : array) {
                if (!(array[Integer.parseInt(i)][Integer.parseInt(oneAccess[0])] == null)) {
                    array[Integer.parseInt(i)][Integer.parseInt(oneAccess[0])] = oneAccess[0];
                } else if (array[Integer.parseInt(i)][0] == oneAccess[0]) {

                    if (oneAccess[1].equals("granted")) {
                        array[Integer.parseInt(i)][1] = Integer.toString(counterOk);
                        counterOk++;
                    } else {
                        array[Integer.parseInt(i)][1] = Integer.toString(counterError);
                        counterError++;
                    }

                }
            }
        }
    }


}
/*
{"212.198.101.5" "1", "1"} - 3 длина массива
212.198.101.5 granted
212.198.101.6 denied
212.197.101.1 granted - arr1

String[][] array = new String[arr1.length][3];

for (String i : arr1){
    работаем с каждой стрингой as (212.198.101.6 denied) -> string to split по пробелу ->new array with 2 values :IP and grant, den.
    для каждого массива делаем for большого массива
   if
        }

for (arr2){
    if ([0] - пустой, то записываем) - счетчик
    если совпадение, то смотрим на равенство granted , denied
        }
    if equals for granted and denied

Парсинг стринги "1", "0"*/

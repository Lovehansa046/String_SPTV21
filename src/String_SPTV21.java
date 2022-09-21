import java.util.Scanner;

public class String_SPTV21 {
    public static void main(String[] args) {
        System.out.println("----Работа со строками-----");
        System.out.print("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        do {

            System.out.println("-----Функции программы-----");
            System.out.println("0. Выйти из программы");
            System.out.println("1. Постчитать кол-во символов в строке");
            System.out.println("2. Посчитать кол-во слов в строке");
            System.out.println("3. Найти подстроку в строке");
            System.out.println("4. Заменить подстроку в строке указанную");
            System.out.print("Выберите номер функции: ");
            int numFunc = scanner.nextInt();
            scanner.nextLine();
            if (numFunc == 0) {
                break;
            } else if (numFunc == 1) {
                System.out.println("Вы выбрали пункт "+ numFunc);
                int countCharInStr = 0;
                char[] chars = str.toCharArray();
                for(int i = 0; i < chars.length;i++){
                    if(chars[i] != ' '){
                        countCharInStr++;
                    }
                }
                System.out.println("В строке " + countCharInStr + " символов");
            } else if (numFunc == 2) {
                System.out.println("Вы выбрали пукт "+ numFunc);
                String[] words = str.split("\\W+");
                System.out.printf("Слов в данной строке = %d%n", words.length);
                for (String w:words){
                    System.out.print(w + "; ");
                }
            } else if (numFunc == 3) {
                System.out.println("Вы выбрали пукт "+ numFunc);
                System.out.println("Введите искомую строку: ");
                String removeSTR = scanner.nextLine();
                int index = str.indexOf(removeSTR);
                if(index<0){
                    System.out.println("Такой строки в тексте нет!");
                } else {
                    index++;
                    System.out.println("Искомая строка находиться на " + index + " позиции");
                }
            } else if (numFunc == 4) {
                System.out.println("Вы выбрали пукт "+ numFunc);
                System.out.println("Введите подстроку которую надо заменить: ");
                String findStr = scanner.nextLine();
                int index = str.indexOf(findStr);
                if(index < 0){
                    System.out.println("Такой подстроки в строке нет");
                }else{
                    System.out.println("Введите строку замены: ");
                    String replaceStr = scanner.nextLine();
                    System.out.println("Результат замены: "+str.replace(findStr, replaceStr));
                }
            }
            System.out.println("+++++++++++++++++++++++++++++++++++");
        }while (true);

            }

        }


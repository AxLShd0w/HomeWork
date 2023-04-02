package com.ua.HomeWork.l20;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> map1 = new HashMap<>();
        map1.put("Танк", List.of("Tank", "Panzer", "タンク"));
        map1.put("Гармата", List.of("Cannon", "Kanone", "銃"));
        map1.put("Гвинтівка", List.of("Rifle", "Gewehr", "ライフル"));
        map1.put("Класс", List.of("Class", "Klasse", "クラス"));
        map1.put("Інцидент", List.of("Incident", "Vorfall", "事件"));
        map1.put("Персонаж", List.of("Character", "Charakter", "キャラクター"));
        map1.put("Лікарня", List.of("Hospital", "Krankenhaus", "病院"));
        map1.put("Вразливість", List.of("Vulnerability", "Verletzlichkeit", "脆弱性"));
        map1.put("Сила", List.of("Strength", "Stärke", "力"));
        map1.put("Хакер", List.of("Threat Actor", "Hacker", "ハッカー"));
        map1.put("Війна", List.of("War", "Krieg", "戦争"));

        System.out.println("Перелік слів : " + map1.keySet());
        System.out.print("Введіть слово з переліку : ");
        String fromInput = scanner.nextLine();
        if (map1.containsKey(fromInput)) {
                System.out.println("Переклад :" + map1.get(fromInput));
        } else {
            System.out.println("Помилка!!! Перевірте регістр або слово відсутнє в переліку!!!");
    }
    }
}


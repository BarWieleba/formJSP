package com.example.form;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Helper {
    public static void writeToFile(HashMap<String, Integer> hm, String path){
        //metoda zapisuje dane z HashMap do pliku o podanej w path lokalizacji
        //dane są zapisywane wierszami:
        //np. Java:1
        try (FileWriter fw = new FileWriter(path)) {
            for (String i:hm.keySet()) {
                fw.write(i + ":" + hm.get(i) + "\n");
            }
        }
        catch (IOException e) {
            System.out.println("Nie znaleziono pliku!");
        }
    }
    public static HashMap<String, Integer> readFromFile(String path){
        //metoda odczytuje dane z pliku do HashMap
        String line;
        HashMap<String, Integer> results = new HashMap();
        File file = new File(path);
        FileInputStream fis;
        BufferedReader br;
        try {
            fis = new FileInputStream(file);
            br = new BufferedReader(new InputStreamReader(fis));
            while ((line = br.readLine()) != null) {
                String[] elem = line.split(":");
                results.put(elem[0], Integer.parseInt(elem[1]));
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku!");
        } catch (IOException e) {
            System.out.println("Błąd odczytu pliku!");
        }
        return results;
    }

    public static void getAllParametersMap(HttpServletRequest request, PrintWriter out){
        Map<String, String[]> hm = request.getParameterMap();
        out.println("<h1>Wybrałeś technologie: </h1>");
        for (String i : hm.keySet()) {
            out.println(" " + i + "<br>"); //wyświetlane są same klucze
        }
    }

    public static void getAllParametersMapAndFile(HttpServletRequest request, PrintWriter out, String path){
        
    }
}

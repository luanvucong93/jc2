package org;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Ex3 {

    public static void main(String[] args) throws MalformedURLException {
//        getData();
        long startTime = System.currentTimeMillis();
        List<Double> airTempData = getAirTempData();
        List<Double> windData = getWindData();
        //Use new Java way with Map-Reduce to calculate average value in parallel
        double windAvg = windData.parallelStream().mapToDouble(value -> value).average().getAsDouble();
        double airTempAvg = airTempData.parallelStream().mapToDouble(value -> value).average().getAsDouble();
        long endTime = System.currentTimeMillis();
        System.out.println("Average Wind Speed value: " + windAvg);
        System.out.println("Average Air Temp value: " + airTempAvg);
        long runTime = endTime - startTime;
        System.out.println("Run Time: " + runTime + " milliseconds");
    }

    /**
     * Get data from specific URL to data.txt file
     *
     * @throws MalformedURLException when URL is invalid
     */
    static void getData() throws MalformedURLException {
        URL dataSource = new URL("http://lpo.dt.navy.mil/data/DM/Environmental_Data_Deep_Moor_2015.txt");
        try (BufferedInputStream inputStream = new BufferedInputStream(dataSource.openStream());
             BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("data.txt", false));
        ) {
            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write((char) c);
            }
        } catch (IOException e) {
            System.out.println("An I/O Error Occur:" + e.getMessage());
        }
    }

    /**
     * Get an array of Air Temp data
     *
     * @return List<Double>
     */
    static List<Double> getAirTempData() {
        File dataFile = new File("data.txt");
        List<Double> dataList = new ArrayList<>();
        try (BufferedReader data = new BufferedReader(new InputStreamReader(new FileInputStream(dataFile)))) {
            data.readLine();
            String inputLine;
            while ((inputLine = data.readLine()) != null) {
                dataList.add(Double.parseDouble(inputLine.substring(20, 25)));
            }
        } catch (IOException e) {
            System.out.println("An I/O Error Occur:" + e.getMessage());
        }
        return dataList;
    }

    /**
     * Get an array of Wind Speed data
     *
     * @return List<Double>
     */
    static List<Double> getWindData() {
        File dataFile = new File("data.txt");
        List<Double> dataList = new ArrayList<>();
        try (BufferedReader data = new BufferedReader(new InputStreamReader(new FileInputStream(dataFile)))) {
            data.readLine();
            String inputLine;
            while ((inputLine = data.readLine()) != null) {
                dataList.add(Double.parseDouble(inputLine.substring(56)));
            }
        } catch (IOException e) {
            System.out.println("An I/O Error Occur:" + e.getMessage());
        }
        return dataList;
    }
}

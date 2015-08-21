import weka.clusterers.SimpleKMeans;
import weka.core.*;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dennis on 20/08/15.
 */
public class Cluster {

    public static void main(String[] args) throws Exception {

        // open file
        FileInputStream fstream = new FileInputStream("data");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine;

        ArrayList<String> rawdata = new ArrayList<>();


        // Read File line by line
        while ((strLine = br.readLine()) != null) {
            rawdata.add(strLine);
        }

        br.close();

        // make data
        Map<String, List<Double>> data = new HashMap<>();
        for (String s : rawdata){
            String[] line = s.split(",", 2);
            ArrayList<Double> entryData = new ArrayList<>();
            for (String entry : line[1].split(",")) {
               entryData.add(Double.parseDouble(entry));
            }
            data.put(line[0], entryData);
        }

        // make instances
        int n = data.size(); // number of devices

        int p = data.get(data.keySet().toArray()[0]).size(); // number of features

        ArrayList<Attribute> atts = new ArrayList<>();








//        // attributes
//
//        Attribute attr1 = new Attribute("attr1", 0);
//        Attribute attr2 = new Attribute("attr2", 1);
//
//        List<String> profit = new ArrayList<>();
//        profit.add("Y");
//        profit.add("N");
//
//        Attribute attr3 = new Attribute("pro", profit, 2);
//
//        ArrayList<Attribute> atts = new ArrayList<>();
//        atts.add(attr1);
//        atts.add(attr2);
//        atts.add(attr3);
//
//        // instances
//
//        List<Instance> instances = new ArrayList<>();
//
//        Instance iexample = new DenseInstance(3);
//        iexample.setValue(0, 10);
//        iexample.setValue(1, 2);
//        iexample.setValue(attr3, "Y");
//        instances.add(iexample);
//
//        iexample.setValue(0, 12);
//        iexample.setValue(1, 3);
//        iexample.setValue(attr3, "Y");
//        instances.add(iexample);
//
//        iexample.setValue(0, 9);
//        iexample.setValue(1, 2);
//        iexample.setValue(attr3, "Y");
//        instances.add(iexample);
//
//        iexample.setValue(0, 0);
//        iexample.setValue(1, 10);
//        iexample.setValue(attr3, "N");
//        instances.add(iexample);
//
//        iexample.setValue(0, 1);
//        iexample.setValue(1, 9);
//        iexample.setValue(attr3, "N");
//        instances.add(iexample);
//
//        iexample.setValue(0, 3);
//        iexample.setValue(1, 11);
//        iexample.setValue(attr3, "N");
//        instances.add(iexample);
//
//        // data
//        Instances data = new Instances("data", atts, instances.size());
//
//        for (Instance inst : instances){
//            data.add(inst);
//        }
//
//
//        SimpleKMeans kmeans = new SimpleKMeans();
//        kmeans.setSeed(10);
//
//        kmeans.setPreserveInstancesOrder(true);
//        kmeans.setNumClusters(2);
//
//
//        kmeans.buildClusterer(data);
//
//        int[] assignments = kmeans.getAssignments();
//
//        int i = 0;
//        for (int clusterNum : assignments) {
//            System.out.printf("Instance %d -> Cluster %d \n", i, clusterNum);
//            i++;
//        }
    }
}

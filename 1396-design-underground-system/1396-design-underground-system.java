class UndergroundSystem {
    
    HashMap<Integer, String[]> customerTime = new HashMap<>();
    HashMap<String, double[]> avgStationTime = new HashMap<>();
    public UndergroundSystem() {
        customerTime = new HashMap<>();
        avgStationTime = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        customerTime.put(id, new String[]{stationName,t+""});
    }
    
    public void checkOut(int id, String stationName, int t) {
        String curr[] = customerTime.get(id);
        String stationAppend = curr[0] + "@" + stationName;
        double timeTaken = Double.parseDouble(curr[1]);
        timeTaken = t - timeTaken;
        customerTime.remove(id);
        
        if(avgStationTime.containsKey(stationAppend))
        {
            double arr[] = avgStationTime.get(stationAppend);
            avgStationTime.put(stationAppend, new double[]{timeTaken+arr[0], arr[1]+1});
        }
        else
        {
            avgStationTime.put(stationAppend, new double[]{timeTaken,1});
        }
        // System.out.println(stationAppend);
        // System.out.println(avgStationTime.get(stationAppend)[0] + " " + avgStationTime.get(stationAppend)[1]);
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String stringAppend = startStation + "@" + endStation;
        double curr[] = avgStationTime.get(stringAppend);
        double avg = curr[0]/curr[1];
        return avg;
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */
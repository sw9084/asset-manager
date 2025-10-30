package com.pluralsight;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    ArrayList<Asset>  myAsset = new ArrayList<>();
    // 2 houses
    myAsset.add(new House("my House","2016-01-10", 250000,"1420 West Main", 1, 2000, 43560));
    myAsset.add(new House("vacation Home", "2016-01-12", 300000,"3329 Noel Rd", 2, 1600, 50000));
    // 2 vehicles
    myAsset.add(new Vehicle("My car", "2017-01-01", 30000, "Toyota camry", 2017, 45000));
    myAsset.add(new Vehicle(" Tom's Truck", "2019-02-23",55000, "Ford F150", 2019,160000));

    for (Asset asset : myAsset) {
        String details;
        if (asset instanceof House) {
            House house = (House) asset;
            details = "House at " + house.getAddress();
        }else if (asset instanceof Vehicle) {
            Vehicle vehicle = (Vehicle) asset;
            details = "vehicle: " + vehicle.getYear() + " " + vehicle.getMakeModel();

        } else {
            details = "unknows asset";
        }
        System.out.println("**********************************************");
        System.out.println(details);
        System.out.println("Description: " + asset.getDescription());
        System.out.println("Data Acquired: " + asset.getDataAcquired());
        System.out.println("original cost: $" + asset.getOriginalCost());
        System.out.println("current value: $" + asset.getValue()); }
    }
}

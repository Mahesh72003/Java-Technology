class NoodleRunner 
{
    public static void main(String any) 
	{
        
        Noodle ref1 = new Noodle();
        ref1.brand = "Maggi";
        ref1.flavor = "Chicken";
        ref1.packageSize = "Small";
        ref1.price = 189;
        ref1.noOfPackets = 1;
        System.out.println("Brand: " + ref1.brand);
        System.out.println("Flavor: " + ref1.flavor);
        System.out.println("Package Size: " + ref1.packageSize);
        System.out.println("Price: " + ref1.price);
        System.out.println("No of Packets: " + ref1.noOfPackets);

        
        Noodle ref2 = new Noodle();
        ref2.brand = "Top Ramen";
        ref2.flavor = "Vegetable";
        ref2.packageSize = "Medium";
        ref2.price = 224;
        ref2.noOfPackets = 2;
        System.out.println("Brand: " + ref2.brand);
        System.out.println("Flavor: " + ref2.flavor);
        System.out.println("Package Size: " + ref2.packageSize);
        System.out.println("Price: " + ref2.price);
        System.out.println("No of Packets: " + ref2.noOfPackets);

        
        Noodle ref3 = new Noodle();
        ref3.brand = "Wai Wai";
        ref3.flavor = "Spicy";
        ref3.packageSize = "Large";
        ref3.price = 449;
        ref3.noOfPackets = 3;
        System.out.println("Brand: " + ref3.brand);
        System.out.println("Flavor: " + ref3.flavor);
        System.out.println("Package Size: " + ref3.packageSize);
        System.out.println("Price: " + ref3.price);
        System.out.println("No of Packets: " + ref3.noOfPackets);

        Noodle ref4 = new Noodle();
        ref4.brand = "Maggi";
        ref4.flavor = "Vegetable";
        ref4.packageSize = "Medium";
        ref4.price = 266;
        ref4.noOfPackets = 2;
        System.out.println("Brand: " + ref4.brand);
        System.out.println("Flavor: " + ref4.flavor);
        System.out.println("Package Size: " + ref4.packageSize);
        System.out.println("Price: " + ref4.price);
        System.out.println("No of Packets: " + ref4.noOfPackets);

        
        Noodle ref5 = new Noodle();
        ref5.brand = "Top Ramen";
        ref5.flavor = "Chicken";
        ref5.packageSize = "Small";
        ref5.price = 206;
        ref5.noOfPackets = 1;
        System.out.println("Brand: " + ref5.brand);
        System.out.println("Flavor: " + ref5.flavor);
        System.out.println("Package Size: " + ref5.packageSize);
        System.out.println("Price: " + ref5.price);
        System.out.println("No of Packets: " + ref5.noOfPackets);

        
        Noodle ref6 = new Noodle();
        ref6.brand = "Wai Wai";
        ref6.flavor = "Chicken";
        ref6.packageSize = "Medium";
        ref6.price = 299;
        ref6.noOfPackets = 2;
        System.out.println("Brand: " + ref6.brand);
        System.out.println("Flavor: " + ref6.flavor);
        System.out.println("Package Size: " + ref6.packageSize);
        System.out.println("Price: " + ref6.price);
        System.out.println("No of Packets: " + ref6.noOfPackets);

        
        Noodle ref7 = new Noodle();
        ref7.brand = "Maggi";
        ref7.flavor = "Spicy";
        ref7.packageSize = "Large";
        ref7.price = 453;
        ref7.noOfPackets = 3;
        System.out.println("Brand: " + ref7.brand);
        System.out.println("Flavor: " + ref7.flavor);
        System.out.println("Package Size: " + ref7.packageSize);
        System.out.println("Price: " + ref7.price);
        System.out.println("No of Packets: " + ref7.noOfPackets);

        
        Noodle ref8 = new Noodle("Top Ramen", "Vegetable", "Medium", 266, 2);
        System.out.println("Brand: " + ref8.brand);
        System.out.println("Flavor: " + ref8.flavor);
        System.out.println("Package Size: " + ref8.packageSize);
        System.out.println("Price: " + ref8.price);
        System.out.println("No of Packets: " + ref8.noOfPackets);

        
        Noodle ref9 = new Noodle("Wai Wai", "Spicy", "Small", 283, 1);
        System.out.println("Brand: " + ref9.brand);
        System.out.println("Flavor: " + ref9.flavor);
        System.out.println("Package Size: " + ref9.packageSize);
        System.out.println("Price: " + ref9.price);
        System.out.println("No of Packets: " + ref9.noOfPackets);

        
        Noodle ref10 = new Noodle("Maggi", "Chicken", "Medium", 244, 2);
        System.out.println("Brand: " + ref10.brand);
        System.out.println("Flavor: " + ref10.flavor);
        System.out.println("Package Size: " + ref10.packageSize);
        System.out.println("Price: " + ref10.price);
        System.out.println("No of Packets: " + ref10.noOfPackets);

        
        Noodle ref11 = new Noodle("Top Ramen", "Spicy", "Large", 449, 3);
        System.out.println("Brand: " + ref11.brand);
        System.out.println("Flavor: " + ref11.flavor);
        System.out.println("Package Size: " + ref11.packageSize);
        System.out.println("Price: " + ref11.price);
        System.out.println("No of Packets: " + ref11.noOfPackets);

        
        Noodle ref12 = new Noodle("Wai Wai", "Vegetable", "Small", 189, 1);
        System.out.println("Brand: " + ref12.brand);
        System.out.println("Flavor: " + ref12.flavor);
        System.out.println("Package Size: " + ref12.packageSize);
        System.out.println("Price: " + ref12.price);
        System.out.println("No of Packets: " + ref12.noOfPackets);

        
        Noodle ref13 = new Noodle("Maggi", "Spicy", "Medium", 283, 2);
        System.out.println("Brand: " + ref13.brand);
        System.out.println("Flavor: " + ref13.flavor);
        System.out.println("Package Size: " + ref13.packageSize);
        System.out.println("Price: " + ref13.price);
        System.out.println("No of Packets: " + ref13.noOfPackets);

        
        Noodle ref14 = new Noodle("Top Ramen", "Chicken", "Large", 488, 3);
        System.out.println("Brand: " + ref14.brand);
        System.out.println("Flavor: " + ref14.flavor);
        System.out.println("Package Size: " + ref14.packageSize);
        System.out.println("Price: " + ref14.price);
        System.out.println("No of Packets: " + ref14.noOfPackets);
    }
}
